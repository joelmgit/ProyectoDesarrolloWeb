/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;

import com.example.entity.Category;
import com.example.entity.Video;
import com.example.entity.VideoStats;
import com.example.entity.UserStats;
import com.example.service.ICategoryService;
import com.example.service.IVideoService;
import com.example.service.IVideoStatsService;
import com.example.service.IUserStatsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Joel Mora
 */
@Controller
public class VideoController {

    @Autowired
    private IVideoService videoService;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IVideoStatsService videoStatsService;

    @Autowired
    private IUserStatsService userStatsService;

    @GetMapping("/")
    public String index(Model model){
        List<Video> videosList = videoService.getAllVideos();
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("videosList", videosList);
        return "videos";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        return "contact";
    }

    @GetMapping("/video/{videoId}")
    public String video(@PathVariable("videoId") Long videoId, Model model){
        Video video = videoService.getVideoById(videoId);
        List<Video> relatedVideos = videoService.getVideosByCategory(video.getCategory().getId());
        model.addAttribute("relatedVideosList", relatedVideos);
        model.addAttribute("video", video);
        return "videoDetail";
    }

    @GetMapping("/categories/{id}")
    public String videosCategory(@PathVariable("id") long id, Model model){
        List<Video> videos = videoService.getVideosByCategory(id);
        Category categoryDetail = categoryService.getCategoryById(id);
        model.addAttribute("videosList", videos);
        model.addAttribute("category", categoryDetail);
        return "videoCategory";
    }

    @GetMapping("/add-video")
    public String addVideo(Model model){
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("video", new Video());
        model.addAttribute("categories", categories);
        return "addVideo";
    }

    @GetMapping("/edit-video/{id}")
    public String editVideo(@PathVariable("id") Long videoId, Model model){
        Video video = videoService.getVideoById(videoId);
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("video", video);
        model.addAttribute("categories", categories);
        return "editVideo";
    }

    @GetMapping("/stats")
    public String videosStats(Model model){
        List<VideoStats> videosStats = videoStatsService.getAllVideoStats();
        List<UserStats> userStats = userStatsService.getAllUserStats();


        model.addAttribute("videoStatsList", videosStats);
        model.addAttribute("userStatsList", userStats);
        return "stats";
    }

    @PostMapping("/save")
    public String saveVideo(@ModelAttribute Video video){
        if(video.getVideo_source().contains("watch?v=")){
            video.setVideo_source(video.getVideo_source().replace("watch?v=", "embed/"));
        }else{
            video.setVideo_source(video.getVideo_source().replace("youtu.be/", "www.youtube.com/embed/"));
        }
        videoService.saveVideo(video);
        return "redirect:/";
    }

    @GetMapping("/delete-video/{id}")
    public String deleteVideo(@PathVariable("id") Long videoId){
        videoService.deleteVideo(videoId);
        return "redirect:/";
    }

}