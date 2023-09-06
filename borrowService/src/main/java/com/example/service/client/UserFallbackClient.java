package com.example.service.client;

import com.example.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackClient implements UserClient{
    @Override
    public User findUserById(int uid) {
        User user=new User();
        user.setName("补救措施");
        return new User();
    }
}
