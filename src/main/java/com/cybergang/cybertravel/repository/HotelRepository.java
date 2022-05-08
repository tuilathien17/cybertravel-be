package com.cybergang.cybertravel.repository;

import com.cybergang.cybertravel.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, Integer> {
    Hotel findById(String id);
    void deleteById(String id);
}
