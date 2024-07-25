package org.example.repo;

import org.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> users = new ArrayList<>();
    public User addUser(User user) {
        users.add(user);
        return user;
    }
}
