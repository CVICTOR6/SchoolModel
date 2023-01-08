package org.example.Model;

import java.io.*;
import java.util.List;

public class ReadAndWriteStudentsList {
  public void ReadStudentsList(String filePath){
    String line = "";
    try(
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            ){
      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    }
    catch(IOException exe){
      System.out.println("Cannot Read");
    }
  }
    public void WriteStudentList (String name, String gender, int age, String studentScore, boolean breakRules,String course1, String course2, String course3, String filePath){
      try{
        FileWriter fileWriter = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println(name + "," + gender + "," + age + "," + studentScore + "," + breakRules + "," + course1 + "," + course2 + "," + course3);
        printWriter.close();
        System.out.println("Students details successfully uploaded! ");
        }
      catch(IOException exception){
        System.out.println("Details not uploaded");
        }
    }
}
