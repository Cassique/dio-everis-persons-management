package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CourseType {

    COLLEGE("College"),
    FREE("Free"),
    CERTIFICATION("Certification"),
    POSTGRADUATE("Postgraduate");
    
    private final String description;
}

