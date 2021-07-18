package com.abhishek.userservice.controller;

import com.abhishek.userservice.VO.ResponseTemplateVO;
import com.abhishek.userservice.entity.User;
import com.abhishek.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("save user controller");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("getUserWithDepartment controller");
        return userService.getUserWithDepartment(userId);
    }
}
