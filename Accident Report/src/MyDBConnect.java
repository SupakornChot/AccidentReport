
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDBConnect {
          public static Connection connectForme(){
                  Connection conn=null;
              try {
                  Class.forName("jdbc:derby://localhost:1527/AccidentReport [flook on FLOOK]");
                  
                conn=DriverManager.getConnection("jdbc:derby://localhost:1527/AccidentReport");
              } catch (ClassNotFoundException ex) {
                  
              } catch (SQLException ex) {
                  
              }
            return conn;
          }
            
}