package com.cybergang.cybertravel.service;

import com.cybergang.cybertravel.model.Tour;
import com.cybergang.cybertravel.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TourService {
    @Autowired
    private TourRepository repository;

    public List<Tour> findAllTours() {
        return repository.findAll();
    }

    public void addTour(Tour tour) {
        tour.setCreateAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")));
        tour.setUpdateAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")));
        repository.insert(tour);
    }

    public Tour findTourById(String id) {
        return repository.findById(id);
    }

    public void updateTour(Tour tour) {
        tour.setUpdateAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")));
        repository.save(tour);
    }

    public void removeTourById(String id) {
        repository.deleteById(id);
    }
}
