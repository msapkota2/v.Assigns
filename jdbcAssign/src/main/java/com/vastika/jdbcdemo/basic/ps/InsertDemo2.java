package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo2
{
    public static final String SQL="insert into user_tbl(user_name,password)values(?,?)";

    public static void main(String[] args) {

        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
                ){
            ps.setString(1,"raju");
            ps.setString(2,"abcd123123");
            //4. execute the query
            ps.executeUpdate();
            System.out.println("Data inserted");
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
