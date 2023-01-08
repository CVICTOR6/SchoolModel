package org.example.Services;

import org.example.Model.School;
import org.example.Model.Teachers;

public interface TeacherServices {
    String teacherCanTeachCourse(String courseName, School school, Teachers teacher);
}
