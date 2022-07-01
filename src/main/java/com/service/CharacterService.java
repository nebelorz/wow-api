package com.service;

import java.util.List;
import java.util.Optional;

import com.dto.CharacterDto;
import com.repository.CharacterRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CharacterService implements ICharacterService {
    private final CharacterRepository characterRepository;


    // Save also updates the object, so there's no need to create an update method
    @Override
    public void save (CharacterDto character) {
        characterRepository.save(character); // save method extends from MongoRepository
    }

    @Override
    public List<CharacterDto> findAll() {
        return characterRepository.findAll();
    }

    @Override
    public Optional<CharacterDto> findById(String id) {
        return characterRepository.findById(id);
    }

    @Override
    public void deleteById (String id) {
        characterRepository.deleteById(id);
    }





























    /* Service antiguo usando List
    private List<CharacterDto> characterDtoList = new ArrayList<>();

    @Override
    public List<CharacterDto> getCharacterDtoList() {
        log.info("Returning character list");
        return this.characterDtoList;
    }

    @Override
    public List<CharacterDto> addCharacter(CharacterDto characterToAdd) {
       this.characterDtoList.add(characterToAdd);
       log.info("created character with name {}", characterToAdd.getName());
       return this.characterDtoList;
    }

    @Override
    public CharacterDto updateCharacter(CharacterDto characterToUpdate) {
        for (var i = 0; i < characterDtoList.size(); i++) {
            var characterInList = characterDtoList.get(i);
            if (characterToUpdate.getName().equals(characterInList.getName())) {
                characterDtoList.set(i, characterToUpdate);
            }
        }
        return characterToUpdate;
    }

    */
}
