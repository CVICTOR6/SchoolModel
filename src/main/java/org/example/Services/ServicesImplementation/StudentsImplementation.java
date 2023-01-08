package org.example.Services.ServicesImplementation;

import org.example.Model.*;
import org.example.Services.StudentServices;

import java.util.ArrayList;
import java.util.List;

public class StudentsImplementation implements StudentServices {

    public String studentsCanTakeCourse(String courseName, School school, Students student1) {
        List<Courses> coursesList = school.getCoursesList();
        for (int i = 0; i < coursesList.size(); i++) {
            if (student1.getCoursesList().get(i).getCourseName().equalsIgnoreCase(courseName)) {
                return student1.getName() + " can learn " + courseName;
            }
        }
        return student1.getName() + " cannot take " + courseName;
    }

    public List<Students> getStudentList(Read read, String studentFile) {
        String[] newString;
        Students students;
        List<Students> studentsList = new ArrayList<>();



        List<String> newList = read.readFile(studentFile);


        for(String s : newList) {
            newString = s.split(",");
            String name = newString[0];
            String gender = newString[1];
            int age = Integer.parseInt(newString[2]);
            boolean breakRules = Boolean.parseBoolean(newString[4]);
            students = new Students(name,gender, age,breakRules);
            studentsList.add(students);
        }

        return studentsList;
    }

}
