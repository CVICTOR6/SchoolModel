package org.example.Model;

import java.util.List;

public class Teachers extends Staff{
    private List<Courses> coursesList;

    public Teachers(String name, String gender, int age, boolean isPresent, List<Courses> coursesList) {
        super(name, gender, age, isPresent);
        this.coursesList = coursesList;
    }

    public Teachers() {
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "coursesList=" + coursesList +
                '}';
    }
}
