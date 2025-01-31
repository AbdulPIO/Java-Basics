package com.programmersio.javabasics.week3day1.transientkeyword;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
    public static final long serialVersionUID = 123456L;
    int id;
    String gender;
    transient int password;

    public User(int id, String gender, int password){
        this.id = id;
        this.gender = gender;
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User(102,"Male",1080);

        try(ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\week3day1\\transientkeyword\\user.ser"))){
            out.writeObject(user);
            System.out.println("Object Serialized Successfully.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
