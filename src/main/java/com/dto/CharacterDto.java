package com.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data // Creates getters, setters, tostring, equals & hashcode
@Document(value = "characters") // Maps the class to the specified collection
@RequiredArgsConstructor
public class CharacterDto {
    @Id // ??
    private String id;
    private String name;
    private Integer level;
    private Integer gold;
    private Integer silver;
    private Integer copper;
}