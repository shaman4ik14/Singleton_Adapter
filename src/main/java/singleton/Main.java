package singleton;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User("Kyrylo", "kyrylo.shamanskyi@ucu.edu.ua", 18);
        user.save();
        User user1 = new User("Oles", "dobosevych@ucu.edu.ua", 31);
        user1.save();
        user.getInfo();
    }
}
