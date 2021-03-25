package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo2 {

    public static final String SQL="delete from user_tbl where id=?";

    public static void main(String[] args) {

        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){
           ps.setInt(1,6);
            //4. execute the query
            ps.executeUpdate();
            System.out.println("Data deleted");
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
