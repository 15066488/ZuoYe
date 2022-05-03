package DOm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo0429 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/qingqiao?serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, username, password);
        String sql="select * from courses";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+resultSet.getString(2)+resultSet.getInt(3));

        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
