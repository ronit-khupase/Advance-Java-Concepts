package jdbc;

import core.PracticeModule;

import java.sql.*;

public class JdbcPractice implements PracticeModule {

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    @Override
    public void run() throws SQLException {
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded Successfully!");

            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "Ronit@986";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Create Table Student");
            String sql = "create table if not exists student(sno int, sname varchar(20))";
            pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
            System.out.println("Table Created Successfully!");

            System.out.println("Enter Details in Table: ");
            sql = "insert into student values (?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,1);
            pstmt.setString(2,"Ronit");
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row inserted");

            System.out.println("Retrieve All Records: ");
            sql = "SELECT * FROM student";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt("sno")+" "+ rs.getString("sname"));
            }

            System.out.println("Find Student By sno");
            sql = "SELECT * FROM student where sno = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,2);
            rs = pstmt.executeQuery();
            if (rs.next())
                System.out.println(rs.getInt("sno")+" "+ rs.getString("sname"));
            else
                System.out.println("Student Not Found!");

            System.out.println("Update Student");
            sql = "UPDATE student SET sname = ? WHERE sno = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"Kartik");
            pstmt.setInt(2,2);
            int n = pstmt.executeUpdate();
            System.out.println(n+" Rows Updated!");


            System.out.println("Delete Student Record : ");
            sql = "DELETE FROM student WHERE sno = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,2);
            n = pstmt.executeUpdate();
            System.out.println(n+" Rows Deleted!");

        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Close Connections");
            con.close();
            pstmt.close();
            rs.close();
        }
    }
}