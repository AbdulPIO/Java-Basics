package com.programmersio.javabasics.day4.innerandanonymousclasses.staticinnerclass;

public class Computer {

    private String brand;

    private String model;

    private OperatingSystem os;

    public OperatingSystem getOs(){
        return os;
    }

    public Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    // Nested/Member Inner class
    class OperatingSystem{
        private String osName;

        OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model: " + model + ", OS: " + osName);
        }
    }

    // Static Inner Class
    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        void displayInfo() {
            System.out.println("USB Type: " + type);
        }
    }
}
