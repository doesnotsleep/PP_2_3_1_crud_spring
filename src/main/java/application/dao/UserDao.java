package application.dao;

import application.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> getAllUsers();

    void userChange(User user, Long id);
}
