package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl us = new UserDaoJDBCImpl();
        List<User> list = new ArrayList<>();

        us.createUsersTable();
        us.createUsersTable();

        us.saveUser("Ruslan", "Kopaliani", (byte) 23);
        us.removeUserById(1);

        us.saveUser("Ruslan", "Kopaliani", (byte) 23);
        us.saveUser("Ruslan", "Kopaliani", (byte) 23);
        us.saveUser("Ruslan", "Kopaliani", (byte) 23);
        us.saveUser("Ruslan", "Kopaliani", (byte) 23);
        list = us.getAllUsers();
        System.out.println(list);

        us.cleanUsersTable();
        us.dropUsersTable();
        us.dropUsersTable();
    }
}
