package progder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecruiterDto {
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String companyName;
}
