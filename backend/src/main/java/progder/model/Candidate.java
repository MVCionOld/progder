package progder.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "candidateMapping",
        classes = @ConstructorResult(
                targetClass = progder.dto.CandidateDto.class,
                columns = {
                        @ColumnResult(name = "id", type = Long.class),
                        @ColumnResult(name = "username", type = String.class),
                        @ColumnResult(name = "email", type = String.class),
                        @ColumnResult(name = "firstName", type = String.class),
                        @ColumnResult(name = "lastName", type = String.class),
                        @ColumnResult(name = "personalInfo", type = String.class),
                        @ColumnResult(name = "personalInfoExtended", type = String.class),
                        @ColumnResult(name = "skillsInfo", type = String.class),
                        @ColumnResult(name = "skillsInfoExtended", type = String.class),
                        @ColumnResult(name = "wishesInfo", type = String.class),
                        @ColumnResult(name = "wishesInfoExtended", type = String.class),
                        @ColumnResult(name = "extraInfo", type = String.class),
                        @ColumnResult(name = "extraInfoExtended", type = String.class)
                }
        )
)
@Entity
@Data
public class Candidate {
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

    @Column(name = "personalInfo")
    private String personalInfo;

    @Column(name = "personalInfoExtended")
    private String personalInfoExtended;

    @Column(name = "skillsInfo")
    private String skillsInfo;

    @Column(name = "skillsInfoExtended")
    private String skillsInfoExtended;

    @Column(name = "wishesInfo")
    private String wishesInfo;

    @Column(name = "wishesInfoExtended")
    private String wishesInfoExtended;

    @Column(name = "extraInfo")
    private String extraInfo;

    @Column(name = "extraInfoExtended")
    private String extraInfoExtended;
}
