package com.vastika.uis.util;

public class QueryUtil {
    public static  final String SAVE_SQL="insert into user_table(user_name,password,mobile_no,salary,dob,active)values(?,?,?,?,?,?) ";
    public static  final String UPDATE_SQL="update user_table set user_name=?,password=?,mobile_no=?,salary=?,dob=?,active=? where id=? ";
    public static  final String DELETE_SQL="delete from user_table where id=? ";
    public static  final String GET_BY_ID_SQL="select * from user_table where id=? ";
    public static  final String LIST_SQL="select * from user_table";

}
