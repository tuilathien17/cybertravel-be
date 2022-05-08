package com.cybergang.cybertravel.repository;

import com.cybergang.cybertravel.model.Tour;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends MongoRepository<Tour, Integer> {
    Tour findById(String Id);
    void deleteById(String id);
}
