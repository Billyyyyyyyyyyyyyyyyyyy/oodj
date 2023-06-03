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
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author billytiong
 */
public class FileIO {

    // Method to update the field value in the file
    public static void updateFieldInFile(String updatedValue, File file, int fieldIndex, String keyValue, int keyIndex) {

        StringBuilder lineToWrite = new StringBuilder();

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

            System.out.println("Content before write is:" + lineToWrite.toString());
            writer.write(lineToWrite.toString());

            System.out.println("Field value updated in " + file + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating " + file + ".");
            e.printStackTrace();
        }
    }
    
    private ArrayList<String> filterAvailableRooms(String selectedRoomType, String filename) {
        ArrayList<String> availableRooms = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 7) {
                    String roomNumber = parts[0].trim();
                    String roomType = parts[1].trim();
                    String occupantCountStr = parts[2].trim();
                    String[] occupants = Arrays.copyOfRange(parts, 3, 7);

                    if (roomType.equals(selectedRoomType) && occupantCountStr.equals("-")) {
                        boolean isOccupied = false;
                        for (String occupant : occupants) {
                            if (!occupant.equals("-")) {
                                isOccupied = true;
                                break;
                            }
                        }
                        if (!isOccupied) {
                            availableRooms.add(roomNumber);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading " + filename + ".");
            e.printStackTrace();
        }

        return availableRooms;
    }
}
