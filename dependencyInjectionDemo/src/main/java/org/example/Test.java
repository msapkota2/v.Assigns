package org.example;

public class Test {
    public static void main(String[] args) {
        User user = new User(new MySqlDao());
        user.saveUser();
    }
}
