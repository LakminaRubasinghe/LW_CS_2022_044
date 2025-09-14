package LW_01;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first name : ");
        String fname=input.next();
        System.out.print("Enter middle name : ");
        String mname=input.next();
        System.out.print("Enter last name : ");
        String lname=input.next();
        System.out.println(lname+", "+fname+" "+mname.charAt(0)+".");
    }
}
