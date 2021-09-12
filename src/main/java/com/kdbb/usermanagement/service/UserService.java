package com.kdbb.usermanagement.service;

import com.kdbb.usermanagement.model.User;
import com.kdbb.usermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;


    public User save(User user) throws Exception{
        return userRepository.save(user);
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User update(Long userId, User user) throws Exception {
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isPresent()){
            user.setId(userId);
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public User getUser(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null);
    }

    public User deleteUser(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()){
            User deleteUser = userOptional.get();
            userRepository.deleteById(deleteUser.getId());
            return deleteUser;
        } else {
            return null;
        }
    }

}
