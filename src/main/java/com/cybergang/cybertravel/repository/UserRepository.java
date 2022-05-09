package com.cybergang.cybertravel.repository;

import com.cybergang.cybertravel.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    User findById(String Id);
    void deleteById(String id);
    User findByEmail(String email);
    boolean existsByIdentification(String identification);
    boolean existsByEmail(String email);
}
