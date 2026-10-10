import java.sql.*;

class DatabaseMetadata{
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/student_db", "root", "password");

        DatabaseMetaData dm = con.getMetaData();

        System.out.println("Database Name: " + dm.getDatabaseProductName());
        System.out.println("Database Version: " + dm.getDatabaseProductVersion());
        System.out.println("Driver Name: " + dm.getDriverName());
        System.out.println("Driver Version: " + dm.getDriverVersion());
        System.out.println("Supports Transactions: " + dm.supportsTransactions());

        ResultSet rs = dm.getTables("student_db", null, "%", new String[]{"TABLE"});

        System.out.println("Available Tables:");

        while (rs.next())
            System.out.println(rs.getString("TABLE_NAME"));

        con.close();
    }
}
