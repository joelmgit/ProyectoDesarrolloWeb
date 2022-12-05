/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.entity.UserStats;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author joelm
 */
@Service
public interface IUserStatsService{
    public List<UserStats> getAllUserStats();
    public List<UserStats> getUserStatsByRoleName(String roleName);
}
