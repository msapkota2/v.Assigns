package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo2 {
    //public static final String SQL="select * from user_tbl";
    public static final String SQL="select * from user_tbl where user_name=? and password=?";

    public static void main(String[] args) {

        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){
            ps.setString(1,"ramesh");
            ps.setString(2,"hello123123");
            ResultSet rs= ps.executeQuery();
            while(rs.next())
            {
                System.out.println("===============");
                System.out.println("Id is "+rs.getInt("id"));
                System.out.println("User Name is "+rs.getString("user_name"));
                System.out.println("Password is "+rs.getString("password"));
                System.out.println("===============");

            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
