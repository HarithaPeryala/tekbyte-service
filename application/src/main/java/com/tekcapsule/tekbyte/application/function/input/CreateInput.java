package com.tekcapsule.tekbyte.application.function.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tekcapsule.tekbyte.domain.model.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class CreateInput {
    private String code;
    private String name;
    private Category category;
    private String summary;
    private String description;
    private String imageUrl;
    private List<String> aliases;
}