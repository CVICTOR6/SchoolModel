package org.example.Services.ServicesImplementation;

import org.example.Model.*;
import org.example.Services.PrincipalService;

import java.util.List;

public class PrincipalImplementation implements PrincipalService{
    public String principalCanAdmit(int age, School school){
        Applicant applicant = school.getApplicant();
        Staff principal = school.getPrincipal();

        final int minAge = 21;
        final int maxAge = 35;

        if (applicant.getAge() < minAge || applicant.getAge() > maxAge) {
            return principal.getName() + " cannot admit " + applicant.getName();
        } else {
            return principal.getName() + " can admit " + applicant.getName();
        }
    }

    public String principalCanExpel(String studentScore,boolean breakRules, School school){
        List<Students> studentList = school.getStudentList();
        Staff principal = school.getPrincipal();
        for (int i = 0; i<studentList.size(); i++){
            if(studentList.get(i).getStudentScore().equalsIgnoreCase(studentScore) && studentList.get(i).isBreakRules()==breakRules){
                return principal.getName() + " cannot expel "+ studentList.get(i).getName();
            }
            else if (studentList.get(i).getStudentScore().equalsIgnoreCase(studentScore) && studentList.get(i).isBreakRules()!= breakRules){
                return principal.getName() + " issues warning to " + studentList.get(i).getName();
            }
            else if (studentList.get(i).getStudentScore().equalsIgnoreCase(studentScore) && studentList.get(i).isBreakRules() != breakRules){
                return principal.getName() + " can expel " + studentList.get(i).getName();
            }
        }
        return null;
    }

}
