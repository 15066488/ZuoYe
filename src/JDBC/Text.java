package JDBC;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Properties;

public class Text {
    public static void main(String[] args) throws Exception {
        //query();
        //update();
        //insert();
        //delete();
    }
    public static DruidDataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/druid.properties"));
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void query() throws Exception {
        DruidPooledConnection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT student.*,class.cname FROM student JOIN class ON student.classid=class.cid;");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Student sb = new Student();
            Student stuentBean = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
            stuentBean.show();
            Clazz classBean = new Clazz();
            classBean.setCid(rs.getInt(6));
            classBean.setCname(rs.getString(7));
            classBean.show();
        }
        ps.close();
        conn.close();
    }

    public static void update() throws Exception {
        DruidPooledConnection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("update student set name = ? where id = ? ");
        ps.setString(1, "黄晓飞");
        ps.setInt(2, 1);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("更改成功");
        }
        ps.close();
        conn.close();
    }

    public static void insert() {
        DruidPooledConnection conn = null;
        PreparedStatement ps = null;
        LocalDate now = LocalDate.now();
        try {
            conn = dataSource.getConnection();
            ps = conn.prepareStatement("INSERT student (id,name,sex,age,birthday,classid) values (?,?,?,?,?,?);");
            ps.setInt(1, 4);
            ps.setString(2, "四黄");
            ps.setString(3, "女");
            ps.setString(4, "34");
            ps.setString(5, String.valueOf(now));
            ps.setInt(6, 2);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("插入成功");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void delete() {
        DruidPooledConnection conn = null;
        PreparedStatement ps = null;
        try {
            conn = dataSource.getConnection();
            ps = conn.prepareStatement("delete from student where id=?");
            ps.setInt(1, 2);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("删除成功");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
