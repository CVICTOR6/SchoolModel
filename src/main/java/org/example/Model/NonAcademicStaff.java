package org.example.Model;

public abstract class NonAcademicStaff extends Staff{
    public NonAcademicStaff(String name, String gender, int age, boolean isPresent) {
        super(name, gender, age, isPresent);
    }

    public NonAcademicStaff() {
    }
    public abstract void organisizeAdmissions(String applicantName);
}
