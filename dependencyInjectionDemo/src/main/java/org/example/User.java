package org.example;

public class User
{
       Dao dao;
        //constructor
       public User(Dao dao)
       {
           this.dao=dao;
       }
/*
    Or setter Dao
       public void setDao(Dao dao)
       {
           this.dao=dao;
       }
*/

        public void saveUser()
        {
            dao.saveUser(this);
        }
}
