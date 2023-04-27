package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserServiceImpl usi = new UserServiceImpl();

        usi.createUsersTable();
        usi.saveUser("Mo", "Salah", (byte) 30);
        usi.saveUser("Bobby", "Firmino", (byte) 31);
        usi.saveUser("Alisson", "Becker", (byte) 30);
        usi.saveUser("Darwin", "Nunez", (byte) 23);
        usi.getAllUsers().stream().forEach(System.out::println);
        usi.removeUserById(1);
        usi.getAllUsers().stream().forEach(System.out::println);
        usi.cleanUsersTable();
        usi.getAllUsers().stream().forEach(System.out::println);
        //usi.dropUsersTable();

    }
}
