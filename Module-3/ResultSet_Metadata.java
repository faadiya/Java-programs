import java.sql.*;

class ResultSet_Metadata {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/student_db", "root", "password");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        ResultSetMetaData rm = rs.getMetaData();

        int count = rm.getColumnCount();

        System.out.println("Number of Columns: " + count);

        for (int i = 1; i <= count; i++) {
            System.out.println("Column Name: " + rm.getColumnName(i));
            System.out.println("Data Type: " + rm.getColumnTypeName(i));
            System.out.println("Column Size: " + rm.getColumnDisplaySize(i));
        }

        con.close();
    }
}
