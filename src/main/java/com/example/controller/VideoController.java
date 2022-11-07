/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;

import com.example.entity.Category;
import com.example.entity.Video;
import com.example.service.ICategoryService;
import com.example.service.IVideoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    
    @GetMapping("/")
    public String index(Model model){
        List<Video> videosList = videoService.getAllVideos();
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("videosList", videosList);
        return "videos";
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
    
    @PostMapping("/save")
    public String saveVideo(@ModelAttribute Video video){
        videoService.saveVideo(video);
        return "redirect:/";
    }
    
    @GetMapping("/delete-video/{id}")
    public String deleteVideo(@PathVariable("id") Long videoId){
        videoService.deleteVideo(videoId);
        return "redirect:/";
    }
    
}