package com.tekcapsule.tekbyte.application.function.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class SearchByCategoryInput {
    private String category;
    private String topicCode;
}
