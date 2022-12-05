/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.entity.Video;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joel Mora
 */
@Service
public interface IVideoService {
    public List<Video> getAllVideos();
    public Video getVideoById(long id);
    public List<Video> getVideosByCategory(long id);
    public void saveVideo(Video video);
    public void deleteVideo(long id);
    public void updateVideo(Video video);
}