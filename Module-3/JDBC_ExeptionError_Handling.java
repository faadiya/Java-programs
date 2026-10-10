import java.sql.*;
import java.util.Scanner;

class JDBC_ExeptionError_Handling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS student10(" +
                "id INT PRIMARY KEY, name VARCHAR(30))");

            System.out.print("Enter student ID: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter an integer ID.");
                return;
            }

            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student10 VALUES(?,?)");

            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Record inserted successfully!");

            try {
                st.executeQuery("SELEC * FROM student10");
            } catch (SQLException e) {
                System.out.println("Invalid SQL query!");
            }

            con.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Duplicate student ID!");

        } catch (SQLSyntaxErrorException e) {
            System.out.println("SQL syntax error!");

        } catch (SQLException e) {
            System.out.println("Database connection or operation failed!");
        }

        sc.close();
    }
}
