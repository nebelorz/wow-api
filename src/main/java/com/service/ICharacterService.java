package com.service;


import java.util.List;
import java.util.Optional;

import com.dto.CharacterDto;


public interface ICharacterService {
    void save(CharacterDto character);
    void deleteById(String id);
    List<CharacterDto> findAll();
    Optional<CharacterDto> findById(String id);

}
