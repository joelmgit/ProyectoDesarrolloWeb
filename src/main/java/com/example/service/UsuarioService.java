/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacos
 */
@Service
public class UsuarioService implements UserDetailsService{
    @Autowired
    public IUserService userService;
    
    @Override
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
        User user = this.userService.findByName(username);
        Usuarioprincipal usuarioPrincipal = new Usuarioprincipal(user);
        return usuarioPrincipal;
                
    }    
}
