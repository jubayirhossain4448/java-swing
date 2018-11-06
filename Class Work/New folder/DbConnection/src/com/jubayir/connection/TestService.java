package com.jubayir.connection;

import static com.jubayir.connection.TestService.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestService {

    static Connection conn = DbConnection.getConnection("xe", "hr", "hr");

    public static void getEmployeeList() {
        try {
            // String sql = "select * from employees";

            PreparedStatement ps = conn.prepareCall("select * from emp");
        } catch (SQLException ex) {
            Logger.getLogger(TestService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void updateEmployee(){
        try {
            PreparedStatement ps = conn.prepareStatement("update employees set first_name = 'Bangladesh' where employee_id = 100");
            int i = ps.executeUpdate();
            System.out.println(i + " Data has been updated");
        } catch (SQLException ex) {
            Logger.getLogger(TestService.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}

