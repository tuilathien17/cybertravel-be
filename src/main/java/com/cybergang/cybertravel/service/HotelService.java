package com.cybergang.cybertravel.service;

import com.cybergang.cybertravel.model.Hotel;
import com.cybergang.cybertravel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository repository;

    public List<Hotel> findAllHotels() {
        return repository.findAll();
    }

    public void addHotel(Hotel hotel) {
        repository.insert(hotel);
    }

    public Hotel findHotelById(String id) {
        return repository.findById(id);
    }

    public void updateHotel(Hotel hotel) {
        repository.save(hotel);
    }

    public void removeHotelById(String id) {
        repository.deleteById(id);
    }
}
