package org.example.Services.ServicesImplementation;

import org.example.Model.Read;
import org.example.Model.Staff;

import java.util.ArrayList;
import java.util.List;

public class ReadStaffImplementation {
    public List<Staff> getStaffList(Read read, String filePath) {

        String[] newString;
        Staff staff;
        List<Staff> staffList = new ArrayList<>();



        List<String> newList = read.readFile(filePath);


        for(String s : newList) {
            newString = s.split(",");
            String staffName = newString[0];
            String staffGender = newString[1];
            int staffAge = Integer.parseInt(newString[2]);
            boolean isPresent = Boolean.parseBoolean(newString[3]);
            staff = new Staff(staffName, staffGender, staffAge, isPresent);
            staffList.add(staff);
        }

        return staffList;
    }
}
