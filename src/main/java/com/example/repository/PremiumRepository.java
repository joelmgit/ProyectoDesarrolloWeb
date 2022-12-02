package com.example.repository;
import com.example.entity.Premium;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PremiumRepository extends CrudRepository<Premium, Long>{
    
}
