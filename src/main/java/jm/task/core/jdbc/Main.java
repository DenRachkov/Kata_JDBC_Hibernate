package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Denis", "Ivanov", (byte) 20);
        userService.saveUser("Ivan", "Pupkin", (byte) 25);
        userService.saveUser("Sergei", "Petrov", (byte) 31);
        userService.saveUser("Petr", "Kruglov", (byte) 38);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
