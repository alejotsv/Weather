package com.java21days;

public class Weather {
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        float toCel = convertToCelsius(fah);
        System.out.println(toCel + " degrees Celsius.");

        float cel = 30;
        System.out.println((cel + "degrees Celsius is ..."));
        float toFah = convertToFahrenheit(cel);
        System.out.println(toFah + " degrees Fahrenheit.");
    }

    static float convertToCelsius(float fah) {
        return (fah - 32)/9*5;
    }

    static float convertToFahrenheit(float cel) {
        return (cel*9/5) + 32;
    }
}
