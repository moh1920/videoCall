package org.sayari.vedeocall.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sayari.vedeocall.model.User;
import org.sayari.vedeocall.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@Slf4j
public class UserController {



    @Autowired
    private UserService userService ;

    @PostMapping("/register")
    public void register(@RequestBody User user){
        userService.register(user);
    }



    @PostMapping("/login")
    public @ResponseBody User  login(@RequestBody  User  user) {
     return userService.login(user);
    }


    @PostMapping("/logout")
    public void logout(@RequestParam String email) {
       userService.logout(email);
    }


    @GetMapping("/findAll")
    public @ResponseBody List<User> findAllUsers(){
        return userService.getAllUser();
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception ex){
        ex.printStackTrace();
        return ResponseEntity.status(INTERNAL_SERVER_ERROR)
                .body(ex.getMessage());
    }




}
