package LW_02;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=0;
        do {
            System.out.print("Enter a number to check the number of digits in it : ");
            number=scanner.nextInt();
            if(number>=0){
                int count=1;
                while(number/10!=0){
                    number=number/10;
                    count++;
                }
                System.out.println("There are "+count+" digits in the entered number.");
            }else{
                System.out.println("Entered number is invalid");break;
            }

        }while(number>=0);
    }
}

