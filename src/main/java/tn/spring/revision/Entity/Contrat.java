package tn.spring.revision.Entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode


public class Contrat implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Temporal(TemporalType.DATE)
    private Date DateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date DateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite Specialite;
    @Column(name="")
    private boolean archive;
    @ManyToOne
    private Etudiant etudiant;





}
