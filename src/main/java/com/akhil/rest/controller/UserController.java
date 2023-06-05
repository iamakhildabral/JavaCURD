package com.akhil.rest.controller;

import com.akhil.rest.model.User;
import com.akhil.rest.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/")
    public String homePage(){
        return "Welcome";
    }

    @GetMapping("view")
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        try {
            userRepo.save(user);
            return "User Saved successfully";
        }catch (Exception e){
            return "There was an error saving your user :";
        }

    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable Long id,@RequestBody User user){

            try {
                User tempUser = userRepo.findById(id).get();
                tempUser.setFirstName(user.getFirstName());
                tempUser.setLastName(user.getLastName());
                tempUser.setAge(user.getAge());
                tempUser.setOccupation(user.getOccupation());
                userRepo.save(tempUser);
                return "user updated successfully";
            }catch (Exception e){
                return "There is an error updating your user :";
            }
    }

    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable Long id){

        try{
            User tempUser = userRepo.findById(id).orElse(null);
            if (tempUser==null){
                return "User does not exist";
            }
            //delete the record
            userRepo.delete(tempUser);
            return "User delete successfully";

        }catch (Exception e){
            return "There is an error deleting your user :";
        }
    }


}
