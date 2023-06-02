/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author dtang
 */
public class StudentApplication extends Report implements FileLocation{
    private String status;
    private String studentName;
    private String roomNumber;
    private String bookingDate;
    private String duration;
    
    public StudentApplication(String studentName){
        this.studentName = studentName;
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentApplicationFile));
            while ((line = reader.readLine()) != null) {
                String[] student = line.split(";");
                if(student[1].equals(studentName)){
                    status = student[0];
                    roomNumber = student[2];
                    bookingDate = student[3];
                    duration = student[4];
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public StudentApplication(){
    
    }
    
    public boolean editRoomNumber(String currentRoomNumber, String newRoomNumber){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentApplicationFile));
            while ((line = reader.readLine()) != null) {
                String[] application = line.split(";");
                if ((currentRoomNumber).equals(application[2])) {
                    stringBuilder.append(application[0]).append(";").append(application[1]).append(";").append(newRoomNumber).append(";").append(application[3]).append(";").append(application[4]).append("\n");
                }else
                    stringBuilder.append(line).append("\n");
            }
            reader.close();
            FileWriter writer = new FileWriter(studentApplicationFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            success = false;
        }
        return success;
    }
    
    public boolean changeApplicationStatusWithSN(String status, String studentName, String reason){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentApplicationFile));
            while ((line = reader.readLine()) != null) {
                String[] application = line.split(";");
                if ((studentName).equals(application[1]) && application[0].equals("Ongoing")) {
                    stringBuilder.append(status).append(";").append(application[1]).append(";").append(application[2]).append(";").append(application[3]).append(";").append(application[4]).append(";").append(reason).append("\n");
                }else{
                    stringBuilder.append(line).append("\n");
                }
            }
            reader.close();
            FileWriter writer = new FileWriter(studentApplicationFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            success = false;
        }
        return success;
    }
    
    public boolean changeApplicationStatusWithRN(String status, String roomNumber, String reason){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentApplicationFile));
            while ((line = reader.readLine()) != null) {
                String[] application = line.split(";");
                if ((roomNumber).equals(application[2]) && application[0].equals("Ongoing")) {
                    stringBuilder.append(status).append(";").append(application[1]).append(";").append(application[2]).append(";").append(application[3]).append(";").append(application[4]).append(";").append(reason).append("\n");
                }else{
                    stringBuilder.append(line).append("\n");
                }
            }
            reader.close();
            FileWriter writer = new FileWriter(studentApplicationFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            success = false;
        }
        return success;
    }
    
    public ArrayList<String> accessAllOngoingRoomNumber(){
        ArrayList<String> AllOngoingRoomNumber = new ArrayList<String>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentApplicationFile));
            while ((line = reader.readLine()) != null) {
                String[] application = line.split(";");
                if(application[0].equals("Ongoing"))
                    AllOngoingRoomNumber.add(application[2]);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return AllOngoingRoomNumber;
    }
    
    public ArrayList<String> accessAllOngoingStudent(){
        ArrayList<String> AllOngoingStudentName = new ArrayList<String>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentApplicationFile));
            while ((line = reader.readLine()) != null) {
                String[] application = line.split(";");
                if(application[0].equals("Ongoing"))
                    AllOngoingStudentName.add(application[1]);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return AllOngoingStudentName;
    }
    
    @Override
    public boolean generateReport(){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        stringBuilder.append("Room Application Record\n\n").append("Generated by ").append(getCurrentDateTime()).append("\n\n").append(String.format("%-10s", "Status")).append(String.format("%-20s", "Student Name")).append(String.format("%-13s", "Room Number")).append(String.format("%-15s", "Booking Date")).append(String.format("%-10s", "Duration")).append("Reason").append("\n");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentApplicationFile));
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(";");
                stringBuilder.append(String.format("%-10s", record[0])).append(String.format("%-20s", record[1])).append(String.format("%-13s", record[2])).append(String.format("%-15s", record[3])).append(String.format("%-10s", record[4])).append(record[5]).append("\n");
            }
            reader.close();
            FileWriter writer = new FileWriter(reportFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            success = false;
        }
        return success;
    }

    public String getStatus() {
        return status;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getDuration() {
        return duration;
    }
}
