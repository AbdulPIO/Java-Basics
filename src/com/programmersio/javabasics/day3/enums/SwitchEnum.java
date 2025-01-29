package com.programmersio.javabasics.day3.enums;

public class SwitchEnum {
    public static void main(String[] args) {

        Month month = Month.JULY;

        switch (month){
            case JANUARY:{
                System.out.println("January");
                break;
            }
            case FEBRUARY:{
                System.out.println("February");
                break;
            }
            case MARCH:{
                System.out.println("March");
                break;
            }
            case APRIL:{
                System.out.println("April");
                break;
            }
            case MAY:{
                System.out.println("May");
                break;
            }
            case JUNE:{
                System.out.println("June");
                break;
            }case JULY:{
                System.out.println("July");
                break;
            }
            case AUGUST:{
                System.out.println("August");
                break;
            }
            case SEPTEMBER:{
                System.out.println("September");
                break;
            }
            case OCTOBER:{
                System.out.println("October");
                break;
            }
            case NOVEMBER:{
                System.out.println("November");
                break;
            }
            case DECEMBER:{
                System.out.println("December");
                break;
            }
            default:{
                System.out.println("Invalid");
            }

        }
    }
}
