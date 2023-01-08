package org.example.Services;

import org.example.Model.Courses;
import org.example.Model.Read;

import java.util.List;

public interface CourseService {

    List<Courses> getCourseList(Read read, String coursesFile);
}
