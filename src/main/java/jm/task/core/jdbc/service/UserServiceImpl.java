package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDaoJDBC = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDaoJDBC.createUsersTable();

    }

    public void dropUsersTable() {
        userDaoJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {

        userDaoJDBC.saveUser(name, lastName, age);
        System.out.println("User c именем - " + name + " добавлен в базу данных");

    }

    public void removeUserById(long id) {
        userDaoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = userDaoJDBC.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        return users;

    }

    public void cleanUsersTable() {
        userDaoJDBC.cleanUsersTable();

    }
}
