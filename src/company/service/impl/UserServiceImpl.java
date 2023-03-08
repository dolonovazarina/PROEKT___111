package company.service.impl;

import company.MyException;
import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao ( );

    @Override
    public void addUser(User user) {
        userDao.getUsers ( ).add ( user );
        System.out.println ( user );
    }

    @Override
    public User findById(int id) {
        for (int i = 0; i < userDao.getUsers ( ).size ( ); i++) {
            if (userDao.getUsers ( ).get ( i ).getId ( ) == id) {
                return userDao.getUsers ( ).get ( i );
            }
        }
        throw new MyException ( "Kod иштебейт" );
    }

    @Override
    public void deleteUserById(int id) {
        int couter = 0;
        for (int i = 0; i < userDao.getUsers ( ).size ( ); i++) {
            if (userDao.getUsers ( ).get ( i ).getId ( ) == id) {
                userDao.getUsers ( ).remove ( userDao.getUsers ( ).get ( i ) );
            }
            else {
                couter++;
            }
        }
        if (couter == userDao.getUsers ( ).size ( )) {
            throw new MyException ( "jok" );
        }
        else {
            System.out.println ( "kod bar" );
        }
    }

    @Override
    public void getAllUser() {
        for (int i = 0; i < userDao.getUsers ( ).size ( ); i++) {
            System.out.println ( userDao.getUsers ( ).get ( i ) );

        }

    }

    @Override
    public void dellById(int id) {

    }

}
