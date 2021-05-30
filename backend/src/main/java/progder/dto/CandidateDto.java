package progder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDto {
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String personalInfo;
    private String personalInfoExtended;
    private String skillsInfo;
    private String skillsInfoExtended;
    private String wishesInfo;
    private String wishesInfoExtended;
    private String extraInfo;
    private String extraInfoExtended;
}
