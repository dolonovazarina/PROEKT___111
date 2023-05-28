package company.service;

import company.model.User;

public interface UserService {

    void addUser (User user);
    User findById(int id) throws Exception;
    void deleteUserById(int id);
    void getAllUsers();
}
