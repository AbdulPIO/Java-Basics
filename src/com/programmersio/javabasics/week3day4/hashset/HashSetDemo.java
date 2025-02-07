package com.programmersio.javabasics.week3day4.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class User {
    private String userName;
    private int userId;

    public User(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName=" + userName +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userId);
    }
}

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Manan");
        set.add("Abdul");
        set.add("Manan");

        System.out.println("Set: " + set);

        // passing custom objects in set
        User user1 = new User("Abdul", 1);
        User user2 = new User("Abdul", 1);

        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);

        //Override equals() and hashCode() method so duplicate objects are not stored in HashSet
        System.out.println("userSet: " + userSet);
    }
}
