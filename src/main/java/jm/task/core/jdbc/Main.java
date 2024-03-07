package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.dropUsersTable();
        userDao.createUsersTable();

        userDao.saveUser("Dima", "Serov", (byte) 21);
        userDao.saveUser("Ivan", "Malin", (byte) 22);
        userDao.saveUser("Igor", "Fedorov", (byte) 31);
        userDao.saveUser("Sasha", "Ivanov", (byte) 38);
        System.out.println(userDao.getAllUsers());
        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();

    }
}
