package com.example.service;

import com.example.entity.StreamingUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    public IStreamingUserService streamingUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        StreamingUser user = this.streamingUserService.findByUsername(username);
        return new Userprincipal(user);
    }
}