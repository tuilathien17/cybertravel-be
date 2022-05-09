package com.cybergang.cybertravel.controller;

import com.cybergang.cybertravel.model.Place;
import com.cybergang.cybertravel.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/place")
public class PlaceController {
    @Autowired
    private PlaceService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Place>> getAllPlaces() {
        return new ResponseEntity<>(service.findAllPlaces(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Place> createNewPlace(@RequestBody Place place) {
        service.addPlace(place);
        return new ResponseEntity<>(place, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Place> getPlaceById(@PathVariable("id") String id) {
        return new ResponseEntity<>(service.findPlaceById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Place> updatePlace(@RequestBody Place place) {
        service.updatePlace(place);
        return new ResponseEntity<>(place, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<Place> deletePlace(@PathVariable("id") String id) {
        Place place = service.findPlaceById(id);
        service.removePlaceById(id);
        return new ResponseEntity<>(place, HttpStatus.OK);
    }
}
