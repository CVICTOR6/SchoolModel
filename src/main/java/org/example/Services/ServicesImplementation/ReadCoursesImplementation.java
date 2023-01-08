package org.example.Services.ServicesImplementation;

import org.example.Model.Courses;
import org.example.Model.Read;
import org.example.Services.CourseService;

import java.util.ArrayList;
import java.util.List;

public class ReadCoursesImplementation implements CourseService {

    public List<Courses> getCourseList(Read read, String coursesFile) {

        Courses courses;
        List<Courses> coursesList = new ArrayList<>();

        List<String> newList = read.readFile(coursesFile);


        for(String s : newList) {
            courses = new Courses(s);
            coursesList.add(courses);
        }

        return coursesList;
    }

}
