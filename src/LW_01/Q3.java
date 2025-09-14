package LW_01;

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length in centimeters (without decimals) : ");
        int centi=input.nextInt();
        int feet=centi/30;
        centi=centi%30;
        double inches=centi/2.54;
        System.out.printf("Entered length is %d feets and %.2f inches",feet, inches);
    }
}

