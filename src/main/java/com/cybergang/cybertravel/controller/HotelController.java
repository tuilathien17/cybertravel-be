package com.cybergang.cybertravel.controller;

import com.cybergang.cybertravel.model.Hotel;
import com.cybergang.cybertravel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return new ResponseEntity<>(service.findAllHotels(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Hotel> createNewHotel(@RequestBody Hotel hotel) {
        service.addHotel(hotel);
        return new ResponseEntity<>(hotel, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable("id") String id) {
        return new ResponseEntity<>(service.findHotelById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel) {
        service.updateHotel(hotel);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<Hotel> deleteHotel(@PathVariable("id") String id) {
        Hotel hotel = service.findHotelById(id);
        service.removeHotelById(id);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }
}
