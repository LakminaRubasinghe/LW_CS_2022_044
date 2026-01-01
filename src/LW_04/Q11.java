package LW_04;
import java.util.*;


public class Q11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nGuess The Random Number");
        System.out.println("=======================\n");
        int i=1;
        do {
            Random rand=new Random();
            int randomNumber=rand.nextInt(100);
            System.out.print("--->>> The computer has generated a random number between 0 to 99. Can you guess it ?    :   ");
            int number=input.nextInt();
            System.out.println("The random number computer generated : "+randomNumber);
            if (randomNumber==number){
                System.out.println("Your guess is right. Congratulations.");break;
            }else{
                System.out.println("Your guess is wrong. Try again next time.");
            }
        }while(i==1);
    }
}
