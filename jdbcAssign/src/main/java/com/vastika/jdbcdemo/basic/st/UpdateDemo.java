package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo
{
    public static final String SQL="update user_tbl set user_name='krishna',password='abcd@123' where id=3";

    public static void main(String[] args) {

        try (

                Statement st = DbUtil.getConnection().createStatement();
        ){
            //4. execute the query
            st.executeUpdate(SQL);
            System.out.println("Data updated");
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
