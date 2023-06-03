/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author billytiong
 */
public class FileIO {

    // Method to update the field value in the file
    public static void updateFieldInFile(String updatedValue, File file, int fieldIndex, String keyValue, int keyIndex) {

        String lineToWrite = "";

        System.out.println(file.length());
        try (
                FileReader fr = new FileReader(file); 
                BufferedReader reader = new BufferedReader(fr)
                ) {
            System.out.println(file.length());
            String line;
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(";");
                String infoKeyValue = info[keyIndex];
                if (!infoKeyValue.equals(keyValue)) {
                    lineToWrite.concat(line);
                } else {
                    // found the key
                    info[fieldIndex] = updatedValue;
                    String tempUpdatedLine = String.join(";", info);
                    lineToWrite.concat(tempUpdatedLine);
                }

                lineToWrite.concat(System.getProperty("line.separator"));
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading " + file + ".");
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            System.out.println("Content before write is:" + lineToWrite.toString());
            writer.write(lineToWrite.toString());

            System.out.println("Field value updated in " + file + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating " + file + ".");
            e.printStackTrace();
        }
    }
}
