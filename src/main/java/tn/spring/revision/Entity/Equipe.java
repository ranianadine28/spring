package tn.spring.revision.Entity;

import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name="")
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau Niveau;
    @OneToOne
    private DetailEquipe DetailEquipe;
    @ManyToMany(cascade =CascadeType.ALL)
    private Set<Etudiant> etudiants;

}
