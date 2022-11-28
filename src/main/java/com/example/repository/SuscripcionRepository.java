package com.example.repository;
import com.example.entity.Suscripcion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface SuscripcionRepository extends CrudRepository<Suscripcion, Long>{
    
}

