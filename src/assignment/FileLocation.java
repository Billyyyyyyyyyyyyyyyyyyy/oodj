package assignment;

import java.io.File;
public interface FileLocation {
    public static final File adminFile = new File("data/Admin.txt");
    public static final File studentFile = new File("data/Student.txt");
    public static final File userFile = new File("data/User.txt");
    public static final File reportFile = new File("data/Report.txt");
    public static final File loginRecordFile = new File("data/LoginRecord.txt");
    public static final File studentApplicationFile = new File("data/StudentApplication.txt");
    public static final File paymentFile = new File("data/Payment.txt");
    public static final File roomInfoFile = new File("data/RoomInfo.txt");
}
