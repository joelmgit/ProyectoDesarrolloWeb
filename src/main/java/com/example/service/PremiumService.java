package com.example.service;
import com.example.entity.Premium;
import com.example.repository.PremiumRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PremiumService implements IPremiumService{
    @Autowired
    private PremiumRepository premiumRepository;

    @Override
    public List<Premium> getAllPremium() {
        return (List<Premium>) premiumRepository.findAll();
    }

    @Override
    public Premium getPremiumById(long id) {
        return premiumRepository.findById(id).orElse(null);
    }

    @Override
    public void savePremium(Premium premium) {
        premiumRepository.save(premium);
    }

    @Override
    public void delete(long id) {
        premiumRepository.deleteById(id);
    }
    
    
}

