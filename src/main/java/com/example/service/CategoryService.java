/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.entity.Category;
import com.example.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Joel Mora
 */
public class CategoryService implements ICategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return (List<Category>)categoryRepository.findAll();
    }

    @Override
    public Category getcategoryById(long id) {
        return categoryRepository.findById(id).orElse(null);
    }
    

    
}
