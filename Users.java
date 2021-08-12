import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {
    public static void user() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/log1", "root", "123");
            Statement state = (Statement) connect.createStatement();
            ResultSet resultSet = ((java.sql.Statement) state).executeQuery("select * from users");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }

        }catch (Exception e ) {
            e.printStackTrace();
        }



        }

    }

