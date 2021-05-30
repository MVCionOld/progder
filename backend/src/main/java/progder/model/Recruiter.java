package progder.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
        name = "recruiterMapping",
        classes = @ConstructorResult(
                targetClass = progder.dto.RecruiterDto.class,
                columns = {
                        @ColumnResult(name = "id", type = Long.class),
                        @ColumnResult(name = "username", type = String.class),
                        @ColumnResult(name = "email", type = String.class),
                        @ColumnResult(name = "firstName", type = String.class),
                        @ColumnResult(name = "lastName", type = String.class),
                        @ColumnResult(name = "companyName", type = String.class),
                }
        )
)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @JsonIgnore
    private String password;

    @Column(name = "companyName")
    private String companyName;
}
