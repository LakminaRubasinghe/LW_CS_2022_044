package LW_04;

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter an integer : ");
        a=scanner.nextInt();
        System.out.print("Enter an integer : ");
        b=scanner.nextInt();
        System.out.print("Enter an integer : ");
        c=scanner.nextInt();
        int smallest=a;
        if (smallest<b){
            if (smallest<c){
                smallest=a;
            }else{
                smallest=c;
            }
        }else if(a<c) {
            if (a<b){
                smallest=a;
            }else{
                smallest=b;
            }
        }else if (b>c){
            smallest=c;
        }else {
            smallest=b;
        }
        System.out.println("Smallest Number Is : "+smallest);
    }
}
