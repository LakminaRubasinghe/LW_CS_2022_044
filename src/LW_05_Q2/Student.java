package LW_05_Q2;

import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private String year;
    Degree degree;
    ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year, Degree degree, ArrayList<Course> coursesEnrolled) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = coursesEnrolled;
    }

    public void displayInfo(){

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(){

    }

    public void displayDegreeInfo(){

    }

    public void enrollCourse(){

    }

    public void unenrollCourse(){

    }

    public void listCoursesEnrolled(){

    }

}
