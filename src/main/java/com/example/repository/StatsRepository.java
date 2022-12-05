/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.repository;

import com.example.entity.VideoStats;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joelm
 */
@Repository
public interface StatsRepository extends CrudRepository<VideoStats,Long> {
    public List<VideoStats> findByCategoryName(String category);
}
