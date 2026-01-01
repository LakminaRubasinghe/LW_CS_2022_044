package LW_04;
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of Asterix(*) rows you want to get in the pyramid    :   ");
        int number= input.nextInt();
        int i=1;
        for (; i<=number; i++){
            int j=number-i;
            for (; j>0; j--){
                System.out.print(" ");
            }
            int k=1;
            for(; k<=i; k++){
                System.out.print("*");
                if (k>1){
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }
        input.close();
    }
}
