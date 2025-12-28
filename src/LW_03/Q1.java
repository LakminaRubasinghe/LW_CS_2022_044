import LW_03.Temperature;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Temperature temperature=new Temperature();
        System.out.print("Enter the temperature in celcius : ");
        double celcius= input.nextDouble();
        temperature.setCelcius(celcius);
        System.out.println("The entered temperature in Fahrenheit : "+temperature.getFahrenheit());
    }
}