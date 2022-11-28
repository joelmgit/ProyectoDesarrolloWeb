package com.example.service;
import com.example.entity.Suscripcion;
import com.example.repository.SuscripcionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuscripcionService implements ISuscripcionService{
    @Autowired
    private SuscripcionRepository suscripcionRepository;
    
    @Override
    public List<Suscripcion> getAllSuscripcion() {
        return (List<Suscripcion>) suscripcionRepository.findAll();
    }

    @Override
    public Suscripcion getSuscripcionById(long id) {
        return suscripcionRepository.findById(id).orElse(null);
    }

    @Override
    public void saveSuscripcion(Suscripcion suscripcion) {
        suscripcionRepository.save(suscripcion);
    }

    @Override
    public void delete(long id) {
        suscripcionRepository.deleteById(id);
    }
    
    
}

