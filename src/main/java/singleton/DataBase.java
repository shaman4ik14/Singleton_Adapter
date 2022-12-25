package singleton;

import java.sql.*;

public class DataBase {
    private static DataBase connection;
    private static java.sql.Connection dbConnection;

    private static void Connect() throws SQLException {
        dbConnection = DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\ksham\\Desktop\\db\\contacts.db");
    }

    public void executeQuery(String query) throws SQLException {
        Statement statement = dbConnection.createStatement();
        statement.executeUpdate(query);
    }

    public static DataBase getConnection() throws SQLException {
        if (connection == null){
            connection = new DataBase();
            Connect();
            String sql = "create table users (name varchar(25), email varchar(35), age varchar(20))";
            Statement statement = dbConnection.createStatement();
            statement.executeUpdate(sql);
        }
        return  connection;
    }

    public void tableInfo() throws SQLException {
        String sql = "select rowid, * from users";
        Statement statement = dbConnection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while(result.next()){
            int rowId = result.getInt("rowid");
            String name = result.getString("name");
            String email = result.getString("email");
            int age = result.getInt("age");
            System.out.println(rowId + " | " + name + " | " + email + " | " + age);

        }
    }

}
