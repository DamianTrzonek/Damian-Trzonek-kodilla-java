package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
forumUsers.add(new ForumUser(1,"daddy1",'M', LocalDate.of(1975,2,28),5));
forumUsers.add(new ForumUser(2,"mommy2",'F',LocalDate.of(1980,6,11),25));
forumUsers.add(new ForumUser(3,"dude3",'M',LocalDate.of(2000,1,21),100));
forumUsers.add(new ForumUser(4,"man4",'M',LocalDate.of(2002,9,7),1));
forumUsers.add(new ForumUser(5,"sista5",'F',LocalDate.of(1999,12,24), 7));
forumUsers.add(new ForumUser(6,"beastyboy6",'M',LocalDate.of(1985,6,6),4));
forumUsers.add(new ForumUser(7,"user7",'F',LocalDate.of(1999,12,31),17));
forumUsers.add(new ForumUser(8,"dudezor8",'M',LocalDate.of(1995,1,1),0));
forumUsers.add(new ForumUser(9,"rambogirl",'F',LocalDate.of(1998,8,8),8));
    }
    public List<ForumUser> getForumUsers() {
        return new ArrayList<>(forumUsers);
    }
}