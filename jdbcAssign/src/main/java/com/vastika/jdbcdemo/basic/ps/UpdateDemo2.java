package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo2 {
    public static final String SQL="update user_tbl set user_name=?,password=? where id=?";

    public static void main(String[] args) {

        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){
            ps.setString(1,"ramesh");
            ps.setString(2,"hello123123");
            ps.setInt(3,5);
            //4. execute the query
            ps.executeUpdate();
            System.out.println("Data updated");
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
