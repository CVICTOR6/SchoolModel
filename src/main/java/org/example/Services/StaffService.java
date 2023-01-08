package org.example.Services;

import org.example.Model.Read;
import org.example.Model.Staff;

import java.util.List;

public interface StaffService {

    List<Staff> getStaffList(Read read, String staffFile);
}
