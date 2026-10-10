import java.sql.*;

class jdbc2 {
public static void main(String[] args) throws Exception {

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/student_db", "root", "password");

    Statement st = con.createStatement();

    st.executeUpdate("CREATE TABLE IF NOT EXISTS student(id INT PRIMARY KEY, name VARCHAR(30))");

    // INSERT
    st.executeUpdate("INSERT INTO student VALUES(101,'Anu')");
    System.out.println("After Insertion:");
    ResultSet rs = st.executeQuery("SELECT * FROM student");
    while (rs.next())
        System.out.println(rs.getInt(1) + " " + rs.getString(2));

    // UPDATE
    st.executeUpdate("UPDATE student SET name='Fadiya' WHERE id=101");
    System.out.println("After Update:");
    rs = st.executeQuery("SELECT * FROM student");
    while (rs.next())
        System.out.println(rs.getInt(1) + " " + rs.getString(2));

    // DELETE
    st.executeUpdate("DELETE FROM student WHERE id=101");
    System.out.println(" Deleted successfully");
    
    con.close();
}

}
