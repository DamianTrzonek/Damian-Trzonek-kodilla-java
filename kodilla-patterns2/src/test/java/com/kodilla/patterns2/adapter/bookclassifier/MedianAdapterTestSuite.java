package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void PublicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author", "Title", 1990, "1"));
        bookSet.add(new Book("Author1","Title1", 1991, "2"));
        bookSet.add(new Book("Author2", "Title2", 1995, "3"));
        bookSet.add(new Book("Author3", "Title3", 2000, "4"));
        bookSet.add(new Book("Author4", "Title4", 1996, "5"));
        bookSet.add(new Book("Author5", "Title5", 1995, "6"));
        //When
        int testmedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(1995, testmedian);
    }
}