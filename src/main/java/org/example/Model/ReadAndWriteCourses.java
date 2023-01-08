package org.example.Model;

import java.io.*;

public class ReadAndWriteCourses {
    public void ReadCourses(String filePath){
        String line = "";
        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                ){
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException exp){
            System.out.println("Cannot Read");
        }
    }

    public void WriteCourses(String courseName, String filecourses){
        try{
            FileWriter fileWriter = new FileWriter(filecourses, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(courseName);
            printWriter.close();
            System.out.println("Course is Recorded");
        }
        catch (IOException exception){
            System.out.println("Course not recorded");
            }
        }
    }

