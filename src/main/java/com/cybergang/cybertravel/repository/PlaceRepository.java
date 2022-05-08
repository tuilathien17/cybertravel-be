package com.cybergang.cybertravel.repository;

import com.cybergang.cybertravel.model.Place;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends MongoRepository<Place, Integer> {
    Place findById(String Id);
    void deleteById(String id);
}
