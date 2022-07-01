package com.repository;

import com.dto.CharacterDto;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CharacterRepository extends MongoRepository<CharacterDto, String> { // MongoRepository interface has all the functions for a CRUD application
}