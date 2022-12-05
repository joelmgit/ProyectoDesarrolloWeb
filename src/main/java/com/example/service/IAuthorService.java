/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.entity.Author;
import org.springframework.stereotype.Service;

/**
 *
 * @author joelm
 */
@Service
public interface IAuthorService {
    public Author saveAuthor(Author author);
}
