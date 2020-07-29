package com.example.demo;

import com.example.demo.user.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class LoginService {

    public int getUsers(List<User> list,String email,String password) {

        for (User user : list) {
            if (email.equalsIgnoreCase(user.getUsername()) && password.equalsIgnoreCase(user.getPassword())) {

                return user.getId();
            }
        }
        return 0;
    }

}
