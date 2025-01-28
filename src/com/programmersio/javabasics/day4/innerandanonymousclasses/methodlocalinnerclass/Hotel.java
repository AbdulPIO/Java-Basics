package com.programmersio.javabasics.day4.innerandanonymousclasses.methodlocalinnerclass;

public class Hotel {

    private String name;

    private int totalRooms;

    private int reservedRooms;

    public Hotel(String name, int reservedRooms, int totalRooms) {
        this.name = name;
        this.reservedRooms = reservedRooms;
        this.totalRooms = totalRooms;
    }

    public void reservedRoom(String guestName, int numOfRooms){

        // Method Local Inner Class
        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name cannot be null.");
                    return false;
                }
                if(numOfRooms<0){
                    System.out.println("Number of rooms should be positive.");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Not enough rooms available.");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRooms += numOfRooms;
            System.out.println("Reservation confirmed for "+ guestName + " for " + numOfRooms + " rooma");
        }else {
            System.out.println("Reservation failed.");
        }
    }
}
