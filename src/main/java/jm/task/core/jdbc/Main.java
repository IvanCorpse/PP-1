package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService us = new UserServiceImpl();

        us.createUsersTable();
        us.saveUser("Mo", "Salah", (byte) 30);
        us.saveUser("Bobby", "Firmino", (byte) 31);
        us.saveUser("Alisson", "Becker", (byte) 30);
        us.saveUser("Darwin", "Nunez", (byte) 23);
        us.getAllUsers().forEach(System.out::println);
        us.removeUserById(4);
        us.getAllUsers().forEach(System.out::println);
        us.cleanUsersTable();
        us.getAllUsers().forEach(System.out::println);
        us.dropUsersTable();

//        Util.closeConnection();
        Util.closeSessionFactory();

    }
}
