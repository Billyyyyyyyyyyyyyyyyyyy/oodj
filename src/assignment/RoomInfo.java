package assignment;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RoomInfo extends Report implements FileLocation{
    private String roomNumber;
    private String roomType;
    private int spaceAvailable;
    private ArrayList<String> bookingStudent = new ArrayList<String>();
    private ArrayList<String> bookingDate = new ArrayList<String>();
    private ArrayList<String> duration = new ArrayList<String>();
    
    public RoomInfo(String roomNumber, String roomType){
        int space;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        spaceAvailable = getSpaceAvailable(roomType);
        bookingStudent.add("-");
        bookingDate.add("-");
        duration.add("-");
    }

    public static int getFeeByRoomType(String roomType) {
        if (roomType.equalsIgnoreCase("Single Room")) {
            return 250;
        }

        if (roomType.equalsIgnoreCase("Double Room")) {
            return 200;
        }


        // pending to do
        return 1000;
    }

    public static ArrayList<RoomInfo> filterAvailableRoomsByRoomType(String roomType) {
        ArrayList<RoomInfo> allRoomInfos = getAll();
        ArrayList<RoomInfo> filteredAllRoomInfos = new ArrayList<>();

        for (RoomInfo roomInfo : allRoomInfos) {
            if (roomInfo.getRoomType().equalsIgnoreCase(roomType)) {
                filteredAllRoomInfos.add(roomInfo);
            }
        }

        return filteredAllRoomInfos;
    }

    public static ArrayList<RoomInfo> getAll() {
        ArrayList<RoomInfo> allRoomInfo = new ArrayList<RoomInfo>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
            while ((line = reader.readLine()) != null) {
                String[] roomInfoString = line.split(";");
                RoomInfo roomInfo = new RoomInfo();
                roomInfo.setRoomNumber(roomInfoString[0]);
                roomInfo.setRoomType(roomInfoString[1]);
                roomInfo.setSpaceAvailable(Integer.parseInt(roomInfoString[2]));

                String studentName = roomInfoString[3];
                String bookingDate = roomInfoString[4];
                String bookingDuration = roomInfoString[5];
                if (!studentName.equals("-")) {
                    ArrayList<String> studentList = new ArrayList<String>();
                    studentList.add(studentName);
                    roomInfo.setBookingStudent(studentList);
                    ArrayList<String> bookingDateList = new ArrayList<String>();
                    bookingDateList.add(bookingDate);
                    roomInfo.setBookingDate(bookingDateList);
                    ArrayList<String> durationList = new ArrayList<String>();
                    durationList.add(bookingDuration);
                    roomInfo.setDuration(durationList);
                }

                allRoomInfo.add(roomInfo);
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed access to file.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        return allRoomInfo;
    }
    
    public RoomInfo(String roomNumber){
        this.roomNumber = roomNumber;
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
            while ((line = reader.readLine()) != null) {
                String[] room = line.split(";");
                if(room[0].equals(roomNumber)){
                    roomType = room[1];
                    spaceAvailable = Integer.parseInt(room[2]);
                    if(room.length - 6 == 0){
                        bookingStudent.add(room[3]);
                        bookingDate.add(room[4]);
                        duration.add(room[5]);
                    }else{
                        for(int i = 3; i < room.length; i=i+3){
                            bookingStudent.add(room[i]);
                            bookingDate.add(room[i+1]);
                            duration.add(room[i+2]);
                        }
                    }
                    break;
                }
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed access to file.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public RoomInfo(){
        
    }
    
    public ArrayList accessRoomNumber(){
        ArrayList<String> RoomNumber = new ArrayList<String>();
        RoomNumber.add("");
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
            while ((line = reader.readLine()) != null) {
                String[] room = line.split(";");
                RoomNumber.add(room[0]);
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed access to file.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
        return RoomNumber;
    }
    
    public ArrayList accessAllBookingStudent(){
        ArrayList<String> BookingStudent = new ArrayList<String>();
        BookingStudent.add("");
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
            while ((line = reader.readLine()) != null) {
                String[] room = line.split(";");
                if(!room[3].equals("-")){
                    for(int i = 3; i < room.length; i=i+3)
                        BookingStudent.add(room[i]);
                }
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed access to file.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
        return BookingStudent;
    }
    
    public boolean addNewRoom(){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            reader.close();
            stringBuilder.append(roomNumber).append(";").append(roomType).append(";").append(spaceAvailable).append(";").append(bookingStudent.get(0)).append(";").append(bookingDate.get(0)).append(";").append(duration.get(0));
            FileWriter writer = new FileWriter(roomInfoFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException e) {
            success = false;
        }
        return success;
    }
    
    public boolean deleteRoom(String roomNumber){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
            while ((line = reader.readLine()) != null) {
                String[] room = line.split(";");
                if (!(roomNumber).equals(room[0])){
                    stringBuilder.append(line).append("\n");
                }
            }
            reader.close();
            FileWriter writer = new FileWriter(roomInfoFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            success = false;
        }
        return success;
    }

    public boolean editRoom(String roomNumber){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
            while ((line = reader.readLine()) != null) {
                String[] room = line.split(";");
                if ((roomNumber).equals(room[0])) {
                    stringBuilder.append(this.roomNumber).append(";").append(roomType).append(";").append(spaceAvailable);
                    for (int i = 0; i < bookingStudent.size(); i++){
                        stringBuilder.append(";").append(bookingStudent.get(i)).append(";").append(bookingDate.get(i)).append(";").append(duration.get(i));
                    }
                    stringBuilder.append("\n");
                }else{
                    stringBuilder.append(line).append("\n");
                }
            }
            reader.close();
            FileWriter writer = new FileWriter(roomInfoFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            success = false;
        }
        return success;
    }
    
    public boolean editRoomPlus(String roomNumber){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
            while ((line = reader.readLine()) != null) {
                String[] room = line.split(";");
                if ((roomNumber).equals(room[0])) {
                    stringBuilder.append(this.roomNumber).append(";").append(roomType).append(";").append(getSpaceAvailable(roomType)).append(";-;-;-").append("\n");
                }else{
                    stringBuilder.append(line).append("\n");
                }
            }
            reader.close();
            FileWriter writer = new FileWriter(roomInfoFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            success = false;
        }
        return success;
    }
    
    public int getSpaceAvailable(String roomType){
        int space;
        switch(roomType) {
            case "Single Room":
                space = 1;
                break;
            case "Double Room":
                space = 2;
                break;
            case "Triple Room":
                space = 3;
                break;
            default:
                space = 4;
        }
        return space;
    }
    
    @Override
    public boolean generateReport(){
        String[] allRoomType = {"Single Room","Double Room","Triple Room","Quad Room"};
        int totalRoom = 0;
        int totalSpace = 0;
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        stringBuilder.append("Available Room Report\n\n").append("Generated by ").append(getCurrentDateTime()).append("\n\n").append(String.format("%-15s", "")).append(String.format("%-13s", "Room Number")).append(String.format("%-15s", "Room Type")).append("Space Available").append("\n\n");
        try {
            for(String x : allRoomType){
                int a = totalRoom;
                stringBuilder.append(x).append("\n");
                BufferedReader reader = new BufferedReader(new FileReader(roomInfoFile));
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(";");
                    if(Integer.parseInt(record[2]) != 0 && record[1].equals(x)){
                        stringBuilder.append(String.format("%-15s", "")).append(String.format("%-13s", record[0])).append(String.format("%-15s", record[1])).append(record[2]).append("\n");
                        totalRoom++;
                        totalSpace += Integer.parseInt(record[2]);
                    }
                }
                reader.close();
                if(a == totalRoom)
                    stringBuilder.append(String.format("%-15s", "")).append("None").append("\n\n");
                else
                    stringBuilder.append("\n");
            }
            stringBuilder.append("\n").append(String.format("%-15s", "Total:")).append(String.format("%-13s", "")).append(String.format("%-15s", totalRoom + " room(s)")).append(totalSpace).append(" space(s)").append("\n\n*For more room Information. Please proceed to the admin page.");
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
    
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getSpaceAvailable() {
        return spaceAvailable;
    }

     public ArrayList<String> getBookingStudent() {
        return bookingStudent;
    }
    
    public ArrayList<String> getBookingDate() {
        return bookingDate;
    }

    public ArrayList<String> getDuration() {
        return duration;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setSpaceAvailable(int spaceAvailable) {
        this.spaceAvailable = spaceAvailable;
    }

    public void setBookingStudent(ArrayList<String> bookingStudent) {
        this.bookingStudent = bookingStudent;
    }

    public void setBookingDate(ArrayList<String> bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setDuration(ArrayList<String> duration) {
        this.duration = duration;
    }
}
