package case2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class newFetch {



public static void main(String[] args) throws ClassNotFoundException, SQLException{

//String url = "jdbc:postgresql://localhost:5433/coviddata";
//String username = "postgres";
//String password = "postgres";
Class.forName("org.postgresql.Driver");

Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/coviddata","postgres","postgres");

PreparedStatement stmt = conn.prepareStatement("SELECT location, "
+ "Count(total_cases ) FROM latestdata "
+ "WHERE total_cases> 1000 GROUP BY location,total_cases ORDER BY total_cases;");

ResultSet result=stmt.executeQuery();
while (result.next()) {
System.out.println(result.getString(1)
+ " " + result.getString(2)
// + " " + result.getString(3)
// + " " + result.getString(4)
// + " " + result.getString(5)
// + " " + result.getString(6)
);
}
conn.close();
}
}