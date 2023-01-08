package org.example.Model;

import java.util.List;

public class Principal extends Staff{
    private List<Students> studentsList;
    private Applicant applicants;

    public Principal(String name, String gender, int age, boolean isPresent, List<Students> studentsList, Applicant applicants) {
        super(name, gender, age, isPresent);
        this.studentsList = studentsList;
        this.applicants = applicants;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public Applicant getApplicants() {
        return applicants;
    }

    public void setApplicants(Applicant applicants) {
        this.applicants = applicants;
    }

    public Principal(List<Students> studentsList, Applicant applicants) {
        this.studentsList = studentsList;
        this.applicants = applicants;

    }

    @Override
    public String toString() {
        return "Principal{" +
                "studentsList=" + studentsList +
                ", applicants=" + applicants +
                '}';
    }
}
