package com.example.java;

public class ConvertPrimitives {
    public static void main(String[] args){
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd Value is: " + intValue2);

        long longValue1 = intValue1;
        System.out.println("The long Value is: " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The long Value is: " + longValue1);

        int intValue3 = 1024;
        byte  byteValue = (byte) intValue3;
        System.out.println("The byte Value is: " + byteValue);

        double doubleValue = 3.99999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int: " + longValue1);



    }
}
