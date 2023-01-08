package org.example.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStaff {
    public void ReadStaffList (String filePath){
        List<Staff> staffList = new ArrayList<>();

        String line = "";
        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                ){
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                }
            }
        catch (IOException ex){
            System.out.println("Cannot Read");
            }

        }


    public void WriteStaffList (String staffName, String staffGender, int staffAge, String staffId, boolean isPresent, String fileStaff){
        try{
            FileWriter fileWriter = new FileWriter(fileStaff, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(staffName + "," + staffGender + "," + staffAge + "," + staffId + "," + isPresent);
            printWriter.close();
            System.out.println("Staff details successfully recorded");
        }
        catch (IOException exception){
            System.out.println("Staff details not found");
       }
    }
}
