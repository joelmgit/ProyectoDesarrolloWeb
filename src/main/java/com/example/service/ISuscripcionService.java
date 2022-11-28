package com.example.service;
import com.example.entity.Suscripcion;
import java.util.List;

public interface ISuscripcionService {
    public List<Suscripcion> getAllSuscripcion();
    public Suscripcion getSuscripcionById(long id);
    public void saveSuscripcion(Suscripcion suscripcion);
    public void delete(long id);
}

