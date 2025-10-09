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
        int smallest;
        if(a<b && a<c){
            smallest=a;
        }else if(a<b && a>c){
            smallest=c;
        }else if(a<c && a>b){
            smallest=b;
        }else if(b>c){
            smallest=c;
        }else{
            smallest=b;
        }

        System.out.println("Smallest Number Is : "+smallest);
    }
}
