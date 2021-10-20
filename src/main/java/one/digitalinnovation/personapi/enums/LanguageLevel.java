package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LanguageLevel {

    BASIC("Basic"),
    INTERMEDIARY("Intermediary"),
    ADVANCED("Advanced"),
    FLUENT("Fluent");
    
    private final String description;
}
