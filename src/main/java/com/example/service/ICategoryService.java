/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.entity.Category;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joel Mora
 */
@Service
public interface ICategoryService {
    public List<Category> getAllCategories();
    public Category getCategoryById(long id);
}