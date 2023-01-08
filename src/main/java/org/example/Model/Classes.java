package org.example.Model;

import java.util.List;

public class Classes {
    private String className;
    private List<Students> studentsList;
    private List<Courses> coursesList;

    private Teachers teacher;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    public Teachers getTeachers() {
        return teacher;
    }

    public void setTeachers(Teachers teachers) {
        this.teacher = teachers;
    }

    public Classes(String className, List<Students> studentsList, List<Courses> coursesList, Teachers teacher) {
        this.className = className;
        this.studentsList = studentsList;
        this.coursesList = coursesList;
        this.teacher = teacher;

    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", studentsList=" + studentsList +
                ", coursesList=" + coursesList +
                ", teachers=" + teacher+
                '}';
    }
}
