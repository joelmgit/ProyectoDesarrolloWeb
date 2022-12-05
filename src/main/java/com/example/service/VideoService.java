/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.entity.Video;
import com.example.repository.VideoRepository;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<Video> getVideosByCategory(long id) {

        return (List<Video>)videoRepository.findByCategoryId(id);

    }

    @Override
    public void saveVideo(Video video) {
        videoRepository.save(video);
    }

    public void updateVideo(Video video) {

        Optional<Video> optionalVideo = videoRepository.findById(video.getId());
        Video videToUpdate = optionalVideo.get();

        videToUpdate.setAuthor(video.getAuthor());
        videToUpdate.setCategory(video.getCategory());
        videToUpdate.setDescription(video.getDescription());
        videToUpdate.setName(video.getName());
        videToUpdate.setVideo_source(video.getVideo_source());

        videoRepository.save(videToUpdate);
    }


    @Override
    public void deleteVideo(long id) {
        videoRepository.deleteById(id);
    }

}
