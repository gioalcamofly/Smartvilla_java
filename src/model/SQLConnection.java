package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnection {
    public Connection connection;
    
    public SQLConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:/home/giovanni/Documentos/ITQ/users");
    }
    
    public void getUsers() throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM USERS";
        ResultSet rs = statement.executeQuery(query);
        
        while (rs.next()) {
            System.out.println("SQL email = " + rs.getString(2));
        }
    }
    
    public void setUser(Person person) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO USERS (email, password, name, surname, last_visit) " + "VALUES ('" + person.getEmail() + "', '"
        + person.getPassword() + "', '" + person.getUsername() + "', '" + person.getSurname() + "', '" + person.getLastVisit() + "');");
    }
    
    public void deleteAll() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM USERS");
    }
    
}
