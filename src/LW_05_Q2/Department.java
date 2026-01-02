package LW_05_Q2;

import java.util.ArrayList;

public class Department {
    private String name;
    Lecturer departmentHead;
    ArrayList<Course> coursesOffering;
    ArrayList<Lecturer> lecturerBelongsTo;

    public Department(String name, Lecturer departmentHead, ArrayList<Course> coursesOffering, ArrayList<Lecturer> lecturerBelongsTo) {
        this.name = name;
        this.departmentHead = departmentHead;
        this.coursesOffering = coursesOffering;
        this.lecturerBelongsTo = lecturerBelongsTo;
    }

    public class displayInfo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(){

    }

    public void displayDepartmentHeadInfo(){

    }

    public void offerCourse(){

    }

    public void withdrawCourse(){

    }

    public void addLecturer(){

    }

    public void removeLecturer(){

    }
}
