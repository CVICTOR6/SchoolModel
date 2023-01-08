package org.example.Model;

import java.util.List;

public class Students extends Users{
    private String studentScore;
    private boolean breakRules;
    private List<Courses> coursesList;

    public Students(String name, String gender, int age, String studentScore, boolean breakRules, List<Courses> coursesList) {
        super(name, gender, age);
        this.studentScore = studentScore;
        this.breakRules = breakRules;
        this.coursesList =  coursesList;
    }

    public Students(String name, String gender, int age, boolean breakRules) {
        super(name, gender, age);
        this.breakRules = breakRules;
    }

    public String getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(String studentScore) {
        this.studentScore = studentScore;
    }

    public boolean isBreakRules() {
        return breakRules;
    }

    public void setBreakRules(boolean breakRules) {
        this.breakRules = breakRules;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

//    @Override
//    public String toString() {
//        return "Students{" +
//                "name='" + getName()+ '\'' +
//                ", breakRules=" + breakRules +
//                ", gender=" + getGender() +
//                ", age=" + getAge() +
//                '}';
//    }


    @Override
    public String toString() {
        return "Students{" +
                "breakRules=" + breakRules +
                "} " + super.toString();
    }
}
