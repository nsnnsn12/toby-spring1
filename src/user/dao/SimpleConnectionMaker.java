package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker implements ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException{
        Class.forName ("org.h2.Driver");
        Connection c = DriverManager.getConnection("jdbc:h2:~/toby", "sa","");
        return c;
    }
}
