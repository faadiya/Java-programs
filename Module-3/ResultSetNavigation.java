import java.sql.*;

class ResultSetNavigation{
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/student_db", "root", "password");

        Statement st = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);

        st.executeUpdate(
            "CREATE TABLE IF NOT EXISTS student5(id INT PRIMARY KEY, name VARCHAR(30))");

        st.executeUpdate("INSERT IGNORE INTO student5 VALUES(101,'Anu')");
        st.executeUpdate("INSERT IGNORE INTO student5 VALUES(102,'Fadiya')");
        st.executeUpdate("INSERT IGNORE INTO student5 VALUES(103,'Rahul')");

        ResultSet rs = st.executeQuery("SELECT * FROM student5 ORDER BY id");

        rs.next();
        System.out.println("Next: " + rs.getInt(1) + " " + rs.getString(2));

        rs.next();

        System.out.println("Next: " + rs.getInt(1) + " " + rs.getString(2));

        rs.previous();
        System.out.println("Previous: " + rs.getInt(1) + " " + rs.getString(2));

        rs.first();
        System.out.println("First: " + rs.getInt(1) + " " + rs.getString(2));

        rs.last();
        System.out.println("Last: " + rs.getInt(1) + " " + rs.getString(2));

        rs.absolute(2);
        System.out.println("Absolute(2): " + rs.getInt(1) + " " + rs.getString(2));

        con.close();
    }
}
