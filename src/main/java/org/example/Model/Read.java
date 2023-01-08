package org.example.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {

    public List<String> readFile(String filePath) {

        String read;
        List<String> objectList = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            while ((read = bufferedReader.readLine()) != null) {
                objectList.add(read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return objectList;
    }
}
