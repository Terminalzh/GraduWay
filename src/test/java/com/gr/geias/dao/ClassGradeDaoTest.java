package com.gr.geias.dao;


import org.junit.Test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020-03-06 09:36
 */

public class ClassGradeDaoTest {

    @Test
    public void insertClazz() throws ClassNotFoundException, SQLException {
        String sql = "insert into graduateemploymentinfo.clazz (class_name, specialty_id, create_time, admin_id) values (?,?,?,?);";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/graduateemploymentinfo", "root", "1111");
        PreparedStatement statement = connection.prepareStatement(sql);
        String specialty_name = "财管";
        String specialty_id = "82";
        String admin_id = "47";
        for (int i = 1; i <= 3; i++) {
            String class_name = specialty_name + "1910" + i;
            statement.setString(1, class_name);
            statement.setString(2, specialty_id);
            statement.setDate(3, new java.sql.Date(new Date().getTime()));
            statement.setString(4, admin_id);
            statement.executeUpdate();
        }
    }

    @Test
    public void insertPerson() throws ClassNotFoundException, SQLException {



        String sql = "insert into graduateemploymentinfo.employment_information" +
                "(" +
                "student_num," +
                " name," +
                " class_id," +
                " area_id," +
                " unit_id," +
                " salary," +
                " employment_way_id," +
                " msg," +
                " create_time," +
                " gender," +
                " college_id," +
                " specialty_id" +
                ") VALUE (?,?,?,?,?,?,?,?,?,?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/graduateemploymentinfo", "root", "1111");
        PreparedStatement statement = connection.prepareStatement(sql);
        String specialty_name = "财管";
        String specialty_id = "82";
        String admin_id = "47";
        for (int i = 1; i <= 3; i++) {
            String class_name = specialty_name + "1910" + i;
            statement.setString(1, class_name);
            statement.setString(2, specialty_id);
            statement.setDate(3, new java.sql.Date(new Date().getTime()));
            statement.setString(4, admin_id);
            statement.executeUpdate();
        }
    }

    @Test
    public void testDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
