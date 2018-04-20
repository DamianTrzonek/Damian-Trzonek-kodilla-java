 package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        IntStream.iterate(1,n -> n + 1 )
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.of(1990 + n,1 + n, 1 + n))));

        //making a shallow copy of library
        Library clonedLibrary = null;
        try {
        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Library 2");
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //making a deep copy of library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //When
        Book book6 = new Book("Title6", "Author6",LocalDate.of(1996,6,6));
        library.getBooks().add(book6);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(6,library.getBooks().size());
        Assert.assertEquals(6,clonedLibrary.getBooks().size());
        Assert.assertEquals(5,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());
    }
}
