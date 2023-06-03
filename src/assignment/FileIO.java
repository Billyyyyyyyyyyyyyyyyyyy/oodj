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
        StringBuilder lineToWrite = new StringBuilder();
        try (
                FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(";");
                String infoKeyValue = info[keyIndex];
                if (!infoKeyValue.equals(keyValue)) {
                    lineToWrite.append(line);
                } else {
                    // found the key
                    info[fieldIndex] = updatedValue;
                    String tempUpdatedLine = String.join(";", info);
                    lineToWrite.append(tempUpdatedLine);
                }
                lineToWrite.append(System.getProperty("line.separator"));
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading " + file + ".");
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(lineToWrite.toString());
            System.out.println("Field value updated in " + file + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating " + file + ".");
            e.printStackTrace();
        }
    }

    public static void addRecordToFile(String recordString, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(recordString.toString());
            writer.newLine();
            System.out.println("Field value added to " + file + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while adding to " + file + ".");
            e.printStackTrace();
        }
    }
}
