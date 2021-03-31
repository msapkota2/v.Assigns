package org.example;

public class MySqlDao implements Dao
{
    public void saveUser(User user)
    {
        System.out.println("User info is saved in mysql");
    }

}
