package LW_04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter a sentence : ");
        String sentence=input.nextLine();
        System.out.print("\nEnter the word you want to replaced : ");
        String oldWord=input.nextLine();
        System.out.print("\nEnter the new word : ");
        String newWord=input.nextLine();
        String newSentence=sentence.replace(oldWord, newWord);
        System.out.println(newSentence);
    }
}
