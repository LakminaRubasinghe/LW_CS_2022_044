package LW_02;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int number=10; number<50; number++){
            if (number%10==0){
                System.out.println();
            }
            System.out.print(number+" ");
        }
    }
}
