import java.sql.*;
class OracleCon{
public static void main(String args[]){
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@https://livesql.oracle.com/apex/f?p=590:24:52740311731:::24:P24_SESSION_ID:232624917839105925556124048487455802111&cs=3wTu6v1O9x8rg3MwHsag5xMY7fJz13pPwW1ZE8zGa2ltJsp5t6ksOiMgGiKKN4OF4j5o2pe1VG8XddSRwhwaZRg:xe","system"'oracle");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select*from employee");
while(rs.next())
System.out.println(rs.getln(1)+" "+rs.getString(2)+" "+rs.getString(3));
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}
