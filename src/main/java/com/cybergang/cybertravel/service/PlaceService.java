package com.cybergang.cybertravel.service;

import com.cybergang.cybertravel.model.Place;
import com.cybergang.cybertravel.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    @Autowired
    private PlaceRepository repository;

    public List<Place> findAllPlaces() {
        return repository.findAll();
    }

    public void addPlace(Place place) {
        repository.insert(place);
    }

    public Place findPlaceById(String id) {
        return repository.findById(id);
    }

    public void updatePlace(Place place) {
        repository.save(place);
    }

    public void removePlaceById(String id) {
        repository.deleteById(id);
    }
}
