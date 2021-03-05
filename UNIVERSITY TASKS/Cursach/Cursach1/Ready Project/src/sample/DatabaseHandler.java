package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DatabaseHandler extends configs {
    Connection dbConnection;

    // postgresql://postgres:1@localhost/postgres
    public Connection getDbConnection() throws ClassNotFoundException, SQLException { // класс нужен для соединения с сервером
        String connectionString = "jdbc:postgresql://127.0.0.1:5432/NONE?currentSchema=users";


        Class.forName("org.postgresql.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);


        return dbConnection;
    }

    public void SignIpUser (User user){
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME + "," + Const. USERS_USERNAME +","+ Const.USERS_PASSWORD + "," + Const.USERS_LOCATION + "," + Const.USERS_GENDER + ")" + "VALUES(?,?,?,?,?,?)";


        try {
            PreparedStatement prSt =getDbConnection().prepareStatement(insert); // из - за знаков вопросов в конце, мы юзаем это
            prSt.setString(1, user.getFirstName());
            prSt.setString(2, user.getLastname());
            prSt.setString(3, user.getUsername());
            prSt.setString(4 , user.getPassword());
            prSt.setString(5 , user.getLocation());
            prSt.setString(6 , user.getGender());
            prSt.executeUpdate(); // выполнить sql действие

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet GetUser (User user) {
        ResultSet resSet = null;

        String select = "SELECT * FROM "+ Const.USER_TABLE + " WHERE " + Const.USERS_USERNAME + "=? AND " + Const.USERS_PASSWORD + "=?";


        try {
            PreparedStatement prSt =getDbConnection().prepareStatement(select); // из - за знаков вопросов в конце, мы юзаем это
            prSt.setString(1, user.getUsername());
            prSt.setString(2, user.getPassword());

            resSet=prSt.executeQuery(); // Получить данные из бд

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }
}
