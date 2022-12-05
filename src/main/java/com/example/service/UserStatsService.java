/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;


import com.example.entity.UserStats;
import com.example.repository.UserStatsRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joelm
 */
@Service
public class UserStatsService implements IUserStatsService{
    
    @Autowired
    private UserStatsRepository userStatsRepository;
    
    public List<UserStats> getAllUserStats(){
        return (List<UserStats>)userStatsRepository.findAll();
    }
    
    public List<UserStats> getUserStatsByRoleName(String roleName){
        return (List<UserStats>)userStatsRepository.findByRoleName(roleName);
    }
}
