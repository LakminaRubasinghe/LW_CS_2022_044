package LW_05_Q2;

import java.util.ArrayList;

public class Lecturer extends Person {
    private String position;
    Department department;
    ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department, ArrayList<Course> coursesTeaching) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }

    public void displayInfo(){
       // super(String name)



    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo(){

    }

    public void addCourse(){

    }

    public void removeCourse(){

    }

    public void listCoursesTeaching(){

    }

}
