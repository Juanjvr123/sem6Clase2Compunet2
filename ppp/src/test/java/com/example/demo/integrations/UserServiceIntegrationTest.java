package com.example.demo.integrations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.IRoleRepository;
import com.example.demo.service.IUserService;

@SpringBootTest
@ActiveProfiles("test")
public class UserServiceIntegrationTest {

    @Autowired
    private IRoleRepository roleRepository;
    @Autowired
    private IUserService userService;

    private User buildValidUser(String name, String email) {
        User user = new User();
        user.setUsername(name);
        user.setEmail(email);
        user.setPasswordHash("password123");
        user.setCreatedAt(Timestamp.valueOf("2025-3-11 10:10:10"));
        Role role = new Role();
        role.setName("newRole");
        role.setDescription("description");
        Role roleSaved = roleRepository.save(role);
        user.setRole(roleSaved);
        return user;
    }

    @Test
    public void testRemoveUser() {
        User userToRemove = this.buildValidUser("userToRemove", "user@gmail.com");
        User userSaved = userService.save(userToRemove);
        userService.remove(userSaved.getId());
        assertThrows(RuntimeException.class, () -> userService.findById(userSaved.getId()));
    }

    @Test
    public void testPagination() {
        User user1 = this.buildValidUser("user1", "user1@gmail.com");
        User user2 = this.buildValidUser("user2", "user2@gmail.com");
        User userToTest1 = userService.save(user1);
        User userToTest2 = userService.save(user2);

        List<User> page1 = userService.getAllUsers(0, 1);
        assertNotNull(page1);
        assertEquals(1, page1.size());
        assertEquals(userToTest2.getId(), page1.get(0).getId());
    }
}
