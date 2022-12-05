/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.entity.Author;
import com.example.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author joelm
 */
@Service
public class AuthorService implements IAuthorService{
    
    @Autowired
    private AuthorRepository authorRepository;
    
    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }
}
