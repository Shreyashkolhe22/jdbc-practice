//step1: import statement
import java.sql.*;
public class Jdbc_statement {
    public static void main(String[] args) throws SQLException {
        /*
        steps in jdbc
        1.import statement
        2.load and register drivers(this is optional now after a java 6 we don't have to do it)
        3.create a connection
        4.create a statement
        5.execute a statement
        6.process result
        7.close a connection
         */

        //defining url , user and pass for connection
        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String pass="9850";
        String sql="Select name from student where rollno=1";

        //step 2: creating a connection
        Connection con=DriverManager.getConnection(url,user,pass);
        System.out.println("connect");

        //step 3 : creating a statement
        Statement st=con.createStatement();

        //step 4 : Executing a statement
        ResultSet rs=st.executeQuery(sql);
        rs.next();

        //step 5 : Processing result
        String name=rs.getString("name");


        System.out.println("Name of student is : - "+name);

        //step 6 : close the connection
        con.close();
    }
}
