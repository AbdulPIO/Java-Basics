package com.programmersio.javabasics.day5.multipleexceptions;

public class MultipleExceptions {
    public static void main(String[] args) {
        Employee emp = null;
        try {
            int[] array = new int[5];
            System.out.println(array[3]);
            emp.setId(101);
        } catch (NullPointerException e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e){ // parent class of exceptions at bottom. Hierarchy should be followed
            System.out.println(e);
        }
    }
}
