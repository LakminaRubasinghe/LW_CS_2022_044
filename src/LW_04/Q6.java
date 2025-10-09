package LW_04;
public class Q6 {
    public static void main(String[] args) {
        int number=10;
        while (number<50){
            System.out.print(number+" ");
            number++;
            if(number%10==0)
                System.out.println();
        }
    }
}
