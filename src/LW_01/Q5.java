package LW_01;

import javax.swing.*;

public class Q5 {
    public static void main(String[] args) {
        Circle outerCircle = new Circle(21);
        Circle innerCircle = new Circle(7);
        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();
        double shadedArea = outerCircleArea-innerCircleArea;

        System.out.println("Shaded area : "+shadedArea);

        double outerCircumference = outerCircle.computeCircumference();
        double inerCircumference = innerCircle.computeCircumference();
        double shadedCircumference = outerCircumference-inerCircumference;

        System.out.println("Shaded circumference : "+shadedCircumference);


    }
}
