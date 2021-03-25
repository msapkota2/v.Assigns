package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo
{
    public static final String SQL="insert into user_tbl(user_name,password)values('sita','cc@123')";

    public static void main(String[] args) {

        try (

               Statement st = DbUtil.getConnection().createStatement();
        ){
            //4. execute the query
            st.executeUpdate(SQL);
            System.out.println("Data inserted");
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                //5. close the connection
//                con.close();
//                st.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }
}