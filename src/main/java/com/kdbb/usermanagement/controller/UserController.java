package com.kdbb.usermanagement.controller;

import com.kdbb.usermanagement.model.User;
import com.kdbb.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.nonNull;

@Controller
@RequestMapping(path = "kdbb-user-account/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        try {
            User createUser = userService.save(user);
            return new ResponseEntity<>(createUser, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(path = "/user")
    public @ResponseBody
    Iterable<User> listUser(){
        return userService.list();
    }

    @GetMapping(path = "/user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Long userId){
        User getuser = userService.getUser(userId);
        if(nonNull(getuser)){
            return new ResponseEntity<>(getuser, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path = "/user/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User user) {
        try {
            User updatedUser = null;
            updatedUser = userService.update(userId, user);
            if (nonNull(updatedUser)) {
                return new ResponseEntity<>(updatedUser, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

        @DeleteMapping(path = "/user/{userId}")
        public ResponseEntity<User> deleteUser (@PathVariable Long userId){
            User deleteUser = userService.deleteUser(userId);
            if (nonNull(deleteUser)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }

