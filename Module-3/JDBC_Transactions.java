import java.sql.*;

class JDBC_Transactions {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/student_db", "root", "password");

        try {
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement(
                "UPDATE bank SET balance=balance-1000 WHERE id=1 AND balance>=1000");

            int a = ps.executeUpdate();

            ps = con.prepareStatement(
                "UPDATE bank SET balance=balance+1000 WHERE id=2");

            int b = ps.executeUpdate();

            if (a == 1 && b == 1) {
                con.commit();
                System.out.println("Money transferred successfully!");
            } else {
                con.rollback();
                System.out.println("Transfer failed. Transaction rolled back.");
            }

        } catch (SQLException e) {
            con.rollback();
            System.out.println("Error! Transaction rolled back.");
        }

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM bank");

        while (rs.next())
            System.out.println(rs.getInt(1) + " " +
                rs.getString(2) + " " + rs.getInt(3));

        con.close();
    }
}
