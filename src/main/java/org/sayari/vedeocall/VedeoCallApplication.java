package org.sayari.vedeocall;

import org.sayari.vedeocall.model.User;
import org.sayari.vedeocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VedeoCallApplication {

    public static void main(String[] args) {
        SpringApplication.run(VedeoCallApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(UserService userService) {
//        return args -> {
//            try {
//                userService.register(User
//                        .builder()
//                        .username("mohamed")
//                        .email("mohamed@gmail.com")
//                        .password("123")
//                        .build());
//
//                userService.register(User
//                        .builder()
//                        .username("tbess")
//                        .email("tbessi@gmail.com")
//                        .password("456")
//                        .build());
//
//                userService.register(User
//                        .builder()
//                        .username("amin")
//                        .email("amin@gmail.com")
//                        .password("789")
//                        .build());
//
//            } catch (Exception e) {
//                // Handle exceptions here (e.g., log them)
//                e.printStackTrace();
//            }
//        };

}
