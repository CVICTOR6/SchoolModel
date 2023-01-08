package org.example.Services;

import org.example.Model.Courses;
import org.example.Model.Read;
import org.example.Model.School;
import org.example.Model.Students;

import java.util.List;

public interface StudentServices {
    String studentsCanTakeCourse(String courseName, School school, Students student1);

    List<Students> getStudentList(Read read, String studentFile);
}
