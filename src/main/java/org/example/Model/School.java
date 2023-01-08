package org.example.Model;

import java.util.List;

public class School {
    private String schoolName;
    private Teachers teacher;
    private List<Students> studentList;
    private List<Classes> classesList;
    private List<Courses> coursesList;
    private Staff principal;
    private Applicant applicant;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    public List<Students> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Students> studentList) {
        this.studentList = studentList;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    public Staff getPrincipal() {
        return principal;
    }

    public void setPrincipal(Staff principal) {
        this.principal = principal;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public School(String schoolName, Teachers teacher, List<Students> studentList, List<Classes> classesList, List<Courses> coursesList, Staff principal, Applicant applicant) {
        this.schoolName = schoolName;
        this.teacher = teacher;
        this.studentList = studentList;
        this.classesList = classesList;
        this.coursesList = coursesList;
        this.principal = principal;
        this.applicant = applicant;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", teacher=" + teacher+
                ", studentList=" + studentList +
                ", classesList=" + classesList +
                ", coursesList=" + coursesList +
                ", principal=" + principal +
                ", applicant=" + applicant +
                '}';
    }
}
