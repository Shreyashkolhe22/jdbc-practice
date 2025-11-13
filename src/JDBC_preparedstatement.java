import java.sql.*;
import java.util.Scanner;

public class JDBC_preparedstatement {
    public static void main(String[] args) throws SQLException {

        //use prepared statement in this code


        // Getting data from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number: ");
        int roll = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();


        //defining url , user and pass for connection
        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String pass="9850";
        String sql= "Insert into student values(?,?,?)";

        //creating connecting
        Connection con=DriverManager.getConnection(url,user,pass);

        //create a preparedstatement
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1,roll);
        ps.setString(2,name);
        ps.setInt(3,marks);

        ps.execute();

        //closing
        ps.close();
        con.close();


    }
}
