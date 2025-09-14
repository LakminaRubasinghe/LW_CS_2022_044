package LW_01;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a word that has odd number of characters : ");
        String word=input.next();
        int total=word.length();
        total=(total/2);
        System.out.println("The middle letter of the word is : "+word.charAt(total));
    }
}
