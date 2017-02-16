/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

import java.io.IOException;
import java.sql.*;

/**
 *
 * @author visio
 */
public class JDBC {

    private String username = "root";
    private String password = "1212312121";
    private String connect = "jdbc:mysql://127.0.0.1:3306/monopony";
    private Statement stmd = null;

    public JDBC() throws SQLException {
        Connection conn = DriverManager.getConnection(connect, username, password);
        System.out.println("Connected");
        stmd = (Statement) conn.createStatement();
    }

    public ResultSet query(String col, String table, String exten) throws SQLException {
        String statement = "SELECT " + col + " FROM " + table + " " + exten + ";";
        ResultSet result = stmd.executeQuery(statement);
        return result;
    }

    public void execute(String table, String value, String exten) throws SQLException {
        String statement = "INSERT INTO " + table + exten + " VALUES " + value + ";";
        stmd.execute(statement);
    }

    public void close() throws SQLException {
        stmd.close();
    }

    public static void main(String[] args) throws IOException, SQLException {
        // TODO code application logic here
        JDBC test = new JDBC();
        test.execute("user", "(\"Charnchyyy\",1415)", "(username, password)"); //ใส่ user
        ResultSet user = test.query("password", "user", "WHERE username LIKE \"treesakul\""); //ดึง password จาก user
        while (user.next()) {
            System.out.println(user.getString(1));
        }
        test.close();
    }

}
