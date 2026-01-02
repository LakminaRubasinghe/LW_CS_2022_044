package LW_05_Q2;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudents, ArrayList<Course> coursesOffering) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = coursesOffering;
    }

    public void displayInfo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(){

    }

    public void withdrawCourse(){

    }

    public void listCoursesOffering(){

    }

}
