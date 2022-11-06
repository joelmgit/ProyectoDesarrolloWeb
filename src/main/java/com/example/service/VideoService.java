/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.entity.Video;
import com.example.repository.VideoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joel Mora
 */
@Service
public class VideoService implements IVideoService{

    @Autowired
    private VideoRepository videoRepository;
    
    @Override
    public List<Video> getAllVideos() {
        return (List<Video>)videoRepository.findAll();
    }

    @Override
    public Video getVideoById(long id) {
        return videoRepository.findById(id).orElse(null);
    }
    
    @Override
    public List<Video> getVideosByCategory(String category) {
        
        return (List<Video>)videoRepository.finfByCategoryNameAll(category);
        
//        List<Video> allVideos = (List<Video>)videoRepository.findAll();
//        ArrayList <Video> filteredList = new ArrayList();
//        for(Video video : allVideos){
//            if(video.getCategory().getName().equals(category)){
//                filteredList.add(video);
//            }
//        }
//        return filteredList;
    }

    @Override
    public void saveVideo(Video video) {
        videoRepository.save(video);
    }

    @Override
    public void deleteVideo(long id) {
        videoRepository.deleteById(id);
    }
     
}
