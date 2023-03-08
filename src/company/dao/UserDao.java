package company.dao;

import company.model.User;


import javax.naming.Name;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UserDao {
    private List<User> users = new ArrayList<> ( );

    public List<User> getUsers() {
        return users;
    }


    public void setUsers(List<User> users) {
        this.users = users;
    }


    public Calendar getUserList() {
        return (Calendar) users;
    }

}

