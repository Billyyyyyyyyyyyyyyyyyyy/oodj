package assignment;

import java.io.*;
import java.util.ArrayList;

public class Admin extends User implements FileLocation{
    private int adminID;
    private String adminEmail;
    
    public Admin(String adminName){
        super(adminName);
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(adminFile));
            while ((line = reader.readLine()) != null) {
                String[] admin = line.split(";");
                if (adminName.equals(admin[1])) {
                    adminID = Integer.parseInt(admin[0]);
                    adminEmail = admin[2];
                    break;
                }
            }
            reader.close();
            BufferedReader reader2 = new BufferedReader(new FileReader(userFile));
            while ((line = reader2.readLine()) != null) {
                String[] admin = line.split(";");
                if (adminName.equals(admin[0])) {
                    password = admin[1];
                    break;
                }
            }
            reader2.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public Admin(){
        
    }
    
    public boolean addNewAdmin(){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(userFile));
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            reader.close();
            BufferedReader reader2 = new BufferedReader(new FileReader(adminFile));
            while ((line = reader2.readLine()) != null) {
                stringBuilder2.append(line).append("\n");
            }
            reader2.close();
            stringBuilder.append(username).append(";").append(password).append(";").append("Admin");
            stringBuilder2.append(adminID).append(";").append(username).append(";").append(adminEmail);
            FileWriter writer = new FileWriter(userFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            FileWriter writer2 = new FileWriter(adminFile);
            BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);
            bufferedWriter2.write(stringBuilder2.toString());
            bufferedWriter2.close();
            success = true;
        } catch (IOException e) {
            success = false;
        }
        return success;
    }
    
    public boolean editAdminProfile(String currentAdminName){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(userFile));
            while ((line = reader.readLine()) != null) {
                String[] user = line.split(";");
                if(currentAdminName.equals(user[0]))
                    stringBuilder.append(username).append(";").append(password).append(";").append("Admin").append("\n");
                else
                    stringBuilder.append(line).append("\n");
            }
            reader.close();
            BufferedReader reader2 = new BufferedReader(new FileReader(adminFile));
            while ((line = reader2.readLine()) != null) {
                String[] admin = line.split(";");
                if(currentAdminName.equals(admin[1]))
                    stringBuilder2.append(admin[0]).append(";").append(username).append(";").append(adminEmail).append("\n");
                else
                    stringBuilder2.append(line).append("\n");
            }
            reader2.close();
            FileWriter writer = new FileWriter(userFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            FileWriter writer2 = new FileWriter(adminFile);
            BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);
            bufferedWriter2.write(stringBuilder2.toString());
            bufferedWriter2.close();
            success = true;
        } catch (IOException e) {
            success = false;
        }
        return success;
    }
    
    public ArrayList<String> accessAllAdminName(){
        ArrayList<String> allAdminName = new ArrayList<String>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(adminFile));
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(";");
                allAdminName.add(record[1]);
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("Error, " + ex);
        }
        return allAdminName;
    }
    
    public ArrayList<String> accessAllAdminEmail(){
        ArrayList<String> allAdminEmail = new ArrayList<String>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(adminFile));
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(";");
                allAdminEmail.add(record[2]);
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("Error, " + ex);
        }
        return allAdminEmail;
    }
    
    public ArrayList<String> accessAllAdminID(){
        ArrayList<String> allAdminID = new ArrayList<String>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(adminFile));
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(";");
                allAdminID.add(record[0]);
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("Error, " + ex);
        }
        return allAdminID;
    }
    
    public boolean generateAdminList(){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        stringBuilder.append("Admin List\n\n").append("Generated by ").append(getCurrentDateTime()).append("\n\n").append(String.format("%-12s", "Admin ID")).append(String.format("%-20s", "Admin Name")).append("Email Address").append("\n");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(adminFile));
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(";");
                stringBuilder.append(String.format("%-12s", record[0])).append(String.format("%-20s", record[1])).append(record[2]).append("\n");;
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
    
    public int getAdminID() {
        return adminID;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }
}
