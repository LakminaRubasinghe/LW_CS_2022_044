package LW_02;
import java.text.SimpleDateFormat;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Date date=new Date(2025-1900,8,14);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEEE, MMMM d, YYYY");
        System.out.println(simpleDateFormat.format(date));
    }
}
