package com.example.service;

import com.example.entity.StreamingUser;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IStreamingUserService {
    List<StreamingUser> getAllUsers();
    StreamingUser getUserById(long id);
    StreamingUser findByUsername(String username);
    void saveUser(StreamingUser user);
    void delete(long id);
}