package com.example.repository;

import com.example.entity.StreamingUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamingUserRepository extends CrudRepository<StreamingUser,Long> {
    StreamingUser findByUsername(String username);
}