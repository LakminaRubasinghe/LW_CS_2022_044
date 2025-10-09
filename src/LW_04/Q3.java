package LW_04;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("Enter a number that you want to get the power of 10 (ex : 3, 6, 9, 12, 15, 18, 21, 30, 100) : ");
        number=scanner.nextInt();
        if(number==6){
            System.out.println("Entered number is 6. The 6th power of 10 is called Million.");
        }else if(number==9){
            System.out.println("Entered number is 9. The 9th power of 10 is called Billion.");
        }else if(number==12){
            System.out.println("Entered number is 12. The 12th power of 10 is called Trillion.");
        }else if(number==15){
            System.out.println("Entered number is 15. The 15th power of 10 is called Quadrillion.");
        }else if(number==18){
            System.out.println("Entered number is 18. The 18th power of 10 is called Quintillion.");
        }else if(number==21){
            System.out.println("Entered number is 21. The 21th power of 10 is called Sextillion.");
        }else if(number==30){
            System.out.println("Entered number is 30. The 30th power of 10 is called Nonillion.");
        }else if(number==100){
            System.out.println("Entered number is 100. The 100th power of 10 is called Googol.");
        }else{
            System.out.println("There is no special name called to that entered power of the number 10.");
        }
    }
}
