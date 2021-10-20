package one.digitalinnovation.personapi.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.LanguageLevel;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private LanguageLevel level;

    //@NotEmpty
    //@Size(min = 4, max = 14)
    private String language;
}
