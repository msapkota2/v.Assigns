package org.example;

public class OracleDao implements Dao {
    public void saveUser(User user)
    {
        System.out.println("User info is saved in mysql");
    }
}
