package com.example.demo.mock;

import static org.mockito.Mockito.doNothing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.repository.IUserRepository;
import com.example.demo.service.impl.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
@ActiveProfiles("test")
public class UserServiceMockTest {

    @Mock
    private IUserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void testMockRemoveUser() {
        doNothing().when(userRepository);
    }
}
