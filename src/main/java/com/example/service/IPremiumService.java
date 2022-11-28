package com.example.service;
import com.example.entity.Premium;
import java.util.List;

public interface IPremiumService {
    public List<Premium> getAllPremium();
    public Premium getPremiumById(long id);
    public void savePremium(Premium premium);
    public void delete(long id);
}