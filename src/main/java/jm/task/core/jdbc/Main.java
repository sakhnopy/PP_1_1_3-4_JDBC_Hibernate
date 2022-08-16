package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;



public class Main {
        public static void main(String[] args) {
            Util.getConnection();
            UserDao userDao = new UserDaoJDBCImpl();
            userDao.createUsersTable();
            userDao.saveUser("Name1", "LastName1", (byte) 20);
            userDao.saveUser("Name1", "LastName1", (byte) 20);
            userDao.saveUser("Name1", "LastName1", (byte) 20);
            userDao.saveUser("Name1", "LastName1", (byte) 20);
            userDao.removeUserById(3);
            userDao.getAllUsers();
            userDao.cleanUsersTable();
            userDao.getAllUsers();





    }
}
