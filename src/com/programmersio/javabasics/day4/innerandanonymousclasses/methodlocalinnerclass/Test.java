package com.programmersio.javabasics.day4.innerandanonymousclasses.methodlocalinnerclass;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("XYZ Hotel",5,10);
        hotel.reservedRoom("Abdul",1);
        hotel.reservedRoom("",3);
        hotel.reservedRoom("PQR",-12);
        hotel.reservedRoom("ABC",5);
    }
}
