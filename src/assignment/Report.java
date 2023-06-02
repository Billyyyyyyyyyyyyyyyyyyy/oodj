package assignment;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Report {
    public String getReportTitle(){
        String title, line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dtang\\Desktop\\Year 2 Sem 1\\OODJ\\Assignment\\data\\Report.txt"));
            while ((line = reader.readLine()) != null) {
                title = line;
                reader.close();
                return title;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return "";
    }
    
    public String getCurrentDateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateTime = LocalDateTime.now().format(formatter);
        return dateTime;
    }
    
    public abstract boolean generateReport();
}
