package org.example;

import org.example.Model.*;
import org.example.Services.ServicesImplementation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class Main {
    public static void main(String[] args) {
        Courses courseOne = new Courses("ENGLISH");
        Courses courseTwo = new Courses("PHYSICS");
        List<Courses> coursesList = new ArrayList<>(Arrays.asList(courseOne, courseTwo));

        Teachers teacher = new Teachers("Mr Fadipe", "M", 30, true, coursesList);
        Students student1 = new Students("Chinemerem", "M", 27, "A", false, coursesList);
        Students student2 = new Students("Chisom", "F", 25, "B", true, coursesList);
        List<Students> studentsList = new ArrayList<>(Arrays.asList(student1, student2));

        Applicant applicant = new Applicant("Kemi", "F", 24);

        Principal principal = new Principal("Mr Joshua", "M", 50, true, studentsList, applicant);

        Classes classesOne = new Classes("SS3", studentsList, coursesList, teacher);
        Classes classesTwo = new Classes("JSS2", studentsList, coursesList, teacher);
        List<Classes> classesList = new ArrayList<>(Arrays.asList(classesOne, classesTwo));


        School school = new School("Haruk group of schools", teacher, studentsList, classesList, coursesList, principal, applicant);

        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        StudentsImplementation studentsImplementation = new StudentsImplementation();
        TeachersImplementation teachersImplementation = new TeachersImplementation();

        studentsImplementation.studentsCanTakeCourse("PHYSICS", school, student1);

        // principalImplementation.principalCanExpel("A", true, school);
//        System.out.println(principalImplementation.principalCanAdmit(23, school));
//        System.out.println(principalImplementation.principalCanExpel("A", true, school));
//        System.out.println(studentsImplementation.studentsCanTakeCourse("PHYSICS", school, student1));
//        System.out.println(teachersImplementation.teacherCanTeachCourse("ENGLISH", school, teacher));
        // ReadAndWriteStudentsList writeFile = new ReadAndWriteStudentsList();
        // writeFile.ReadStudentsList("src/main/resources/Students List - Sheet1 (1).csv");
        //writeFile.WriteStudentList("Stacy", "F", 29, "B", true, "Physics", "Chemistry", "Mathematics", "src/main/resources/Students List - Sheet1 (1).csv");
        //ReadAndWriteStaff listOutStaff = new ReadAndWriteStaff();
        //listOutStaff.ReadStaffList("src/main/resources/Staff List - Sheet1.csv");
        //listOutStaff.WriteStaffList("Ahmed", "Male", 40, "N114", false, "src/main/resources/Staff List - Sheet1.csv");
//        ReadAndWriteCourses listOutCourses = new ReadAndWriteCourses();
//        listOutCourses.ReadCourses("src/main/resources/Courses List - Sheet1.csv");
        // listOutCourses.WriteCourses("Geography","src/main/resources/Courses List - Sheet1.csv");

        Read read = new Read();

        StaffImplementation staffImplementation = new StaffImplementation();
        StudentsImplementation studentsImplementation1 = new StudentsImplementation();
        ReadCoursesImplementation coursesImplementation = new ReadCoursesImplementation();

        String staffFile = "src/main/resources/Staff List - Sheet1.csv";
        String studentFile = "src/main/resources/Students List - Sheet1 (2).csv";
        String coursesFile = "src/main/resources/Courses List - Sheet1.csv";


//        staffList.forEach(staff -> {
//            System.out.println(staff.toString());
//        });

        List<Staff> staffList = staffImplementation.getStaffList(read, staffFile);
        List<Students> studentsList1 = studentsImplementation1.getStudentList(read, studentFile);
        List<Courses> courses = coursesImplementation.getCourseList(read, coursesFile);

        for(Staff staff : staffList) {
            System.out.println(staff.toString());
        }

        System.out.println();

        for (Students students : studentsList1) {

            System.out.println(students.toString());
        }

        System.out.println();

        for (Courses course : courses) {
            System.out.println(course.toString());
        }

    }
}

