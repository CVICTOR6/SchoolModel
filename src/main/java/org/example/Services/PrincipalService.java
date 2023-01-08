package org.example.Services;

import org.example.Model.Read;
import org.example.Model.School;
import org.example.Model.Staff;

import java.util.List;

public interface PrincipalService {
    String principalCanAdmit(int age, School school);
    String principalCanExpel(String studentScore,boolean breakRules, School school);

}
