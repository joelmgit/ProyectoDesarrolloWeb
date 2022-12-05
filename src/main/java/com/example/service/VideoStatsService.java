/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;


import com.example.entity.VideoStats;
import com.example.repository.StatsRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joelm
 */
@Service
public class VideoStatsService implements IVideoStatsService{
    
    @Autowired
    private StatsRepository statsRepository;
    
    @Override
    public List<VideoStats> getAllVideoStats(){
        return (List<VideoStats>)statsRepository.findAll();
    }
    
    @Override
    public List<VideoStats> getVideoStatsByCategoryName(String category){
        return (List<VideoStats>)statsRepository.findByCategoryName(category);
    }
}
