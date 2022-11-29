/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.entity.User;
import java.util.List;

/**
 *
 * @author jacos
 */
public interface IUserService {
    //comentario
    public List<User> getAllUser();
    public User getUserById(long id);
    public void saveUser(User user);
    public void delete (long id);
    public User findByName (String name);
    
}
