package org.sayari.vedeocall.user;

import org.sayari.vedeocall.model.User;
import org.sayari.vedeocall.reposetry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;


    public void register(User user) {
        user.setStatus("online");
        userRepo.save(user);
    }

    public User login(User user) {
        User cUser = userRepo.findByEmail(user.getEmail());
        if (cUser == null) {
            throw new RuntimeException("User not found");
        }else {
            if (!cUser.getPassword().equals(user.getPassword())) {
                throw new RuntimeException("Password incorrect");
            }
            cUser.setStatus("online");
            userRepo.save(cUser);
            return cUser;
        }
    }

    public void logout(String email) {
        User cUser = userRepo.findByEmail(email);
        if (cUser == null) {
            throw new RuntimeException("User not found");
        }
        cUser.setStatus("offline");
        userRepo.save(cUser);
    }


    public List<User> getAllUser() {
           return userRepo.findAll();
    }
}