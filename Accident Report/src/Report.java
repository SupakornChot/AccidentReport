import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Report {

    
    public static void main(String[] args) {
        try {
            Connection conn = MyDBConnect.connectForme();
            Statement statement = conn.createStatement();
  
            String srtSQL1 = "INSERT INTO Accident VALUES(1,'CB2',96,'IT',1,'2','Car hit')";
            statement.executeUpdate(srtSQL1);
            ResultSet rs= statement.executeQuery("SELECT* FROM Accident");
            
            while(rs.next()){
                System.out.println(rs.getInt("accidentId")+"\t");
                System.out.println(rs.getString("location")+"\t");
                System.out.println(rs.getInt("userId"));
                System.out.println(rs.getString("relateddepartment")+"\t");
                System.out.println(rs.getInt("status")+"\t");
                System.out.println(rs.getString("typeId")+"\t");
                System.out.println(rs.getString("Detail")+"\t");
            }
            
            conn.close();
        } catch (SQLException ex) {
            System.out.println("!!!"+ex.getMessage());
        }
        /*User u1[] = new User[3];
        u1[0]= new User("Supakorn",123);
        Accident a[]=new Accident[3];
        a[0] = new Accident("ขาหัก","CB2","0815657901",u1[0]);
        a[1] = new Accident("ขาก","CB2","015657901",u1[0]);
        a[2] = new Accident("ขาหัก","CB2","0815657901",u1[0]);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
    }
    
}