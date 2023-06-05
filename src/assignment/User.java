package assignment;

import java.util.ArrayList;
import java.io.*;

public class User extends Report implements FileLocation{
    protected String username;
    protected String password;
    private String role;
    
    public User(String email, int a){
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(adminFile));
            while ((line = reader.readLine()) != null) {
                String[] admin = line.split(";");
                if (email.equals(admin[2])) {
                    username = admin[1];
                    role = "Admin";
                    break;
                }
            }
            reader.close();
            if(username == null){
                BufferedReader reader2 = new BufferedReader(new FileReader(studentFile));
                while ((line = reader2.readLine()) != null) {
                    String[] student = line.split(";");
                    if (email.equals(student[2])) {
                        username = student[0];
                        role = "Student";
                        break;
                    }
                }
                reader2.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void addUserToFile(User newUser){
        String username = newUser.getUsername();
        String password = newUser.getPassword();
        String role = newUser.getRole();
        
        String newRecordString = username + ";" + password + ";" + role;
        FileIO.addRecordToFile(newRecordString, userFile);
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(String username){
        this.username = username;
    }
    
    public User(){
    }
    
    public boolean Login(){
        boolean exist = false;
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(userFile));
            while ((line = reader.readLine()) != null) {
                String[] user = line.split(";");
                if (username.equals(user[0]) && password.equals(user[1])) {
                    role = user[2];
                    exist = true;
                    break;
                }
            }
            reader.close();
        } catch (IOException e) {
            exist = false;
        }
        return exist;
    }
    
    public void writeLoginRecord(){
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(loginRecordFile));
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            reader.close();
            stringBuilder.append(username).append(";").append(role).append(";").append(getCurrentDateTime());
            FileWriter writer = new FileWriter(loginRecordFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            
        }
    }
    
    public boolean resetPassword(){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(userFile));
            while ((line = reader.readLine()) != null) {
                String[] user = line.split(";");
                if ((username).equals(user[0])) {
                    stringBuilder.append(user[0]).append(";").append(password).append(";").append(user[2]).append("\n");
                }else
                    stringBuilder.append(line).append("\n");
            }
            reader.close();
            FileWriter writer = new FileWriter(userFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            success = false;
        }
        return success;
    }
    
    public ArrayList<String> accessAllStudentName(){
        ArrayList<String> allStudentName = new ArrayList<String>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(userFile));
            while ((line = reader.readLine()) != null) {
                String[] user = line.split(";");
                if(user[2].equals("Student"))
                    allStudentName.add(user[0]);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return allStudentName;
    }
    
    @Override
    public boolean generateReport(){
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        stringBuilder.append("User Login Record\n\n").append("Generated by ").append(getCurrentDateTime()).append("\n\n").append(String.format("%-20s", "Username")).append(String.format("%-10s", "Role")).append(String.format("%-20s", "Date & Time")).append("\n");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(loginRecordFile));
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(";");
                stringBuilder.append(String.format("%-20s", record[0])).append(String.format("%-10s", record[1])).append(String.format("%-20s", record[2])).append("\n");
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

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setRole(String role){
        this.role = role;
    }
}
