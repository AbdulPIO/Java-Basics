package com.programmersio.javabasics.week3day1.transientkeyword;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserDeserialization {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\week3day1\\transientkeyword\\user.ser"))){
            User user = (User) in.readObject();
            System.out.println(user.id + " " + user.gender + " " + user.password);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
