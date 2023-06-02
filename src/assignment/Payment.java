package assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Payment extends Report implements FileLocation{
    private String studentName;
    private int total;
    private String date;
    
    public Payment(){
        
    }
    
    public ArrayList<String> accessAllMonthYear(String mode, String Year){
        ArrayList<String> allMonthYear = new ArrayList<String>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(paymentFile));
            while ((line = reader.readLine()) != null) {
                String[] payment = line.split(";");
                String[] dates = payment[2].split("/");
                if(mode.equals("Month")){
                    if(!allMonthYear.contains(dates[1]) && (Year.equals(dates[2]) || Year.equals("All")))
                        allMonthYear.add(dates[1]);
                }else{
                    if(!allMonthYear.contains(dates[2]))
                        allMonthYear.add(dates[2]);
                }
            }
            reader.close();
            Collections.sort(allMonthYear);
        } catch (IOException e) {   
            JOptionPane.showMessageDialog(null, "Failed access to file.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
        return allMonthYear;
    }
    
    public boolean generateReport(String Year, String Month){
        String[] monthName = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        ArrayList<String> allMonthYear = new ArrayList<String>();
        ArrayList<String> allDates = new ArrayList<String>();
        boolean success;
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        stringBuilder.append("Monthly Income Report\n\n").append("Generated by ").append(getCurrentDateTime()).append("\n\n").append(String.format("%-18s", "")).append(String.format("%-20s", "Student Name")).append(String.format("%-10s", "Total")).append("Payment Date").append("\n");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(paymentFile));
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(";");
                allDates.add(record[2]);
            }
            reader.close();
            Collections.sort(allDates, dateComparator);
            for(String i : allDates){
                String[] dates = i.split("/");
                if(!allMonthYear.contains(dates[1] + "/" + dates[2]))
                    allMonthYear.add(dates[1] + "/" + dates[2]);
            }
            for(String i : allMonthYear){
                int total = 0;
                String[] toStringDates = i.split("/");
                if((toStringDates[0].equals(Month) || Month.equals("All")) && (toStringDates[1].equals(Year) || Year.equals("All"))){
                    stringBuilder.append("-".repeat(65)).append("\n").append(monthName[Integer.parseInt(toStringDates[0])]).append(" ").append(toStringDates[1]).append("\n");
                    for(String a : allDates){
                        String[] b = a.split("/");
                        if(i.equals(b[1] + "/" + b[2])){
                            BufferedReader reader2 = new BufferedReader(new FileReader(paymentFile));
                            while ((line = reader2.readLine()) != null) {
                                String[] record = line.split(";");
                                if(a.equals(record[2])){
                                    stringBuilder.append(String.format("%-18s", "")).append(String.format("%-20s", record[0])).append(String.format("%-10s", "RM" + record[1])).append(record[2]).append("\n");
                                    total += Integer.parseInt(record[1]);
                                }
                            }
                            reader2.close();
                        }
                    }
                    stringBuilder.append("\n").append(String.format("%-18s", "")).append(String.format("%-20s", "Total:")).append(String.format("%-10s", "RM" + total)).append("\n");
                }
            }
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
    
    @Override
    public boolean generateReport(){
        return true;
    }
    
    Comparator<String> dateComparator = new Comparator<String>() {
      @Override
      public int compare(String date1, String date2) {
        String[] parts1 = date1.split("/");
        String[] parts2 = date2.split("/");

        int day1 = Integer.parseInt(parts1[0]);
        int month1 = Integer.parseInt(parts1[1]);
        int year1 = Integer.parseInt(parts1[2]);
        int day2 = Integer.parseInt(parts2[0]);
        int month2 = Integer.parseInt(parts2[1]);
        int year2 = Integer.parseInt(parts2[2]);

        if (year1 < year2) {
          return -1;
        } else if (year1 > year2) {
          return 1;
        } else if (month1 < month2) {
          return -1;
        } else if (month1 > month2) {
          return 1;
        } else if (day1 < day2) {
          return -1;
        } else if (day1 > day2) {
          return 1;
        } else {
          return 0;
        }
      }
    };

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

}
