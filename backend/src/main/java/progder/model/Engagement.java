package progder.model;

import lombok.Data;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "engagementMapping",
        classes = @ConstructorResult(
                targetClass = progder.dto.EngagementDto.class,
                columns = {
                        @ColumnResult(name = "id", type = Long.class),
                }
        )
)
@Entity
@Data
public class Engagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recruiter_id", referencedColumnName = "id")
    private Recruiter recruiter;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;

    @Column(name = "state")
    private String state;
}
