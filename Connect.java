import java.sql.*;



public class Connect extends Interface {
    public static void main(String[]args){
    try {
        Connection connect_DB = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login", "root", "");
        Statement statement_DB = connect_DB.createStatement();
        ResultSet resultSet_DB = statement_DB.executeQuery("select * from users");
        while (resultSet_DB.next()) {
            System.out.println(resultSet_DB.getString("username"));
             }
        }  catch (Exception e){
        e.printStackTrace();
    }
    }



}
