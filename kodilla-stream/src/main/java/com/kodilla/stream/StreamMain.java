package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
                Forum forum = new Forum();

                Map<Integer,ForumUser> theResultOfForumUsers = forum.getForumUsers().stream()
                        .filter(forumUser -> forumUser.getSex() == 'M')
                        .filter(forumUser -> forumUser.getBirthday().getYear()< 1998)
                        .filter(forumUser -> forumUser.getWrittenPosts() > 0)
                        .collect(Collectors.toMap(ForumUser::getId,forumUser -> forumUser));

                System.out.println("# elements: " + theResultOfForumUsers.size());
                theResultOfForumUsers.entrySet().stream()
                        .map(integerForumUserEntry -> integerForumUserEntry.getKey() + ": " + integerForumUserEntry.getValue())
                        .forEach(System.out::println);
            }
        }