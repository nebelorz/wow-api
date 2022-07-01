package com.controller;

import java.util.List;

import com.dto.CharacterDto;
import com.service.ICharacterService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {
    private ICharacterService characterService;

    // Create
    @PostMapping // manages post requests
    public void save(@RequestBody CharacterDto character) {
        characterService.save(character);
    }

    // Read
    @GetMapping
    public List<CharacterDto> findAll() {
        return characterService.findAll();
    }

    // Read
    @GetMapping("/{id}")
    public CharacterDto findById(@PathVariable String id) { // @PathVariable to set the ID into the request
        return characterService.findById(id).get();
    }

    // Update
    @PutMapping()
    public void update(@RequestBody CharacterDto character) {
        characterService.save(character); // same as doing a create request
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        characterService.deleteById(id);
    }

}
