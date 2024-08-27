package org.sayari.vedeocall;

import org.junit.jupiter.api.Test;
import org.sayari.vedeocall.model.User;
import org.sayari.vedeocall.reposetry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class VedeoCallApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserRepo userRepo;
    @Test
    public void testFindByEmail() {
        User user = userRepo.findByEmail("mohamed@gmail.com");
        if (user != null) {
            System.out.println("valide");
        }
    }


}
