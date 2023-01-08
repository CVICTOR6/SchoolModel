package org.example.Services.ServicesImplementation;

import org.example.Model.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalImplementationTest {

    private PrincipalImplementation principalImplementation;

    private int age;

    private School school;

    private String schoolName;

    private Teachers teacher;

    private List<Students> studentsList;

    private List<Classes> classList;

    private Principal principal;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        age = 15;
        schoolName = "FGC";

        studentsList = new ArrayList<>();
        studentsList.add()

        teacher = new Teachers();

        school = new School(schoolName, );

        principal = new Principal();
    }

    @org.junit.jupiter.api.Test
    void principalCanAdmit() {

        String actual = principalImplementation.principalCanAdmit(age, school);
        String expected = principal.getName() + " cannot admit " + applicant.getName();
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void principalCanExpel() {
    }
}