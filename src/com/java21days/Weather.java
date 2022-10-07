package com.java21days;

public class Weather {
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        float cel = convertToCelsius(fah);
        System.out.println(cel);
    }

    static float convertToCelsius(float fah) {
        return (fah - 32)/9*5;
    }
}
