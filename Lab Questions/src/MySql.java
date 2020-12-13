import java.sql.*;
import java.util.*;

public class MySql
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            String name;
            int rollno;
            double cgpa;

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab?characterEncoding=latin1","root","password");
            Statement stmt = con.createStatement();

            System.out.println("Enter the number of Students");
            int n=sc.nextInt();

            for(int i=0;i<n;i++)
            {
                sc.nextLine();
                System.out.println("\nEnter the name");
                name = sc.nextLine();
                System.out.println("Enter the rollno");
                rollno = sc.nextInt();
                System.out.println("Enter the CGPA");
                cgpa = sc.nextDouble();
                String sql = "insert into Student values ("+rollno+",'"+name+"',"+cgpa+");";
                stmt.executeUpdate(sql);
            }

            System.out.println("\nStudents with CGPA greater than 7:");
            System.out.println("\nRoll No\t\tName\t\tCGPA");
            ResultSet rs = stmt.executeQuery("select * from Student where cgpa>7;");
            while(rs.next())
                System.out.println(rs.getInt(1)+"\t\t\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
            con.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}