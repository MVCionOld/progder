package progder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import progder.model.Candidate;
import progder.model.Recruiter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EngagementDto {
    private Long id;
    private Recruiter recruiter;
    private Candidate candidate;
    private String state;
}
