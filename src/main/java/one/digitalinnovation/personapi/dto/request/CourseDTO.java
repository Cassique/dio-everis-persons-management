package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.CourseType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private CourseType type;

    @NotEmpty
    @Size(min = 4, max = 14)
    private String name;
    
    
    @NotNull
    @Size(min = 1, max = 5)
    private Integer workLoad;
    
    @NotEmpty
    @Size(min = 3, max = 14)
    private String educationInstitute;
}

