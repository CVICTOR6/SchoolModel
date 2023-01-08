package org.example.Services.ServicesImplementation;

import org.example.Model.Read;
import org.example.Model.Staff;
import org.example.Model.Students;
import org.example.Services.StaffService;

import java.util.ArrayList;
import java.util.List;

public class StaffImplementation implements StaffService {


    @Override
    public List<Staff> getStaffList(Read read, String staffFile) {


        String[] newString;
        Staff staff;
        List<Staff> staffList = new ArrayList<>();



        List<String> newList = read.readFile(staffFile);


        for(String s : newList) {
            newString = s.split(",");
            String staffName = newString[0];
            String staffGender = newString[1];
            int staffAge = Integer.parseInt(newString[2]);
            boolean isPresent = Boolean.parseBoolean(newString[3]);
            staff = new Staff(staffName,staffGender,staffAge,isPresent);
            staffList.add(staff);
        }

        return staffList;
    }

}

