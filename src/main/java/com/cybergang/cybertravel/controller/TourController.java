package com.cybergang.cybertravel.controller;

import com.cybergang.cybertravel.model.Tour;
import com.cybergang.cybertravel.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tour")
public class TourController {
    @Autowired
    private TourService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Tour>> getAllTours() {
        return new ResponseEntity<>(service.findAllTours(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Tour> createNewTour(@RequestBody Tour tour) {
        service.addTour(tour);
        return new ResponseEntity<>(tour, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Tour> getUserById(@PathVariable("id") String id) {
        return new ResponseEntity<>(service.findTourById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Tour> updateTour(@RequestBody Tour tour) {
        service.updateTour(tour);
        return new ResponseEntity<>(tour, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<Tour> deleteTour(@PathVariable("id") String id) {
        Tour tour = service.findTourById(id);
        service.removeTourById(id);
        return new ResponseEntity<>(tour, HttpStatus.OK);
    }
}
