package org.example.Services.ServicesImplementation;

import org.example.Model.Courses;
import org.example.Model.School;
import org.example.Model.Students;
import org.example.Model.Teachers;
import org.example.Services.TeacherServices;

import java.util.List;

public class TeachersImplementation implements TeacherServices{
    public String teacherCanTeachCourse(String courseName, School school, Teachers teacher) {
        List<Courses> coursesList = school.getCoursesList();
        for (int i = 0; i < coursesList.size(); i++) {
            if (teacher.getCoursesList().get(i).getCourseName().equalsIgnoreCase(courseName)) {
                return teacher.getName() + " can teach " + courseName;
            }
        }
        return teacher.getName() + " cannot take " + courseName;
    }
}