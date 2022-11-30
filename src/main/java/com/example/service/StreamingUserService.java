package com.example.service;

import com.example.entity.StreamingUser;
import com.example.repository.StreamingUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamingUserService implements IStreamingUserService {

    @Autowired
    private StreamingUserRepository userRepository;

    @Override
    public List<StreamingUser> getAllUsers() {
        return (List<StreamingUser>)userRepository.findAll();
    }

    @Override
    public StreamingUser getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public StreamingUser findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(StreamingUser user) {
        userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}