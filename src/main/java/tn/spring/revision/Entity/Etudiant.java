package tn.spring.revision.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="T_Etudiant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="")
    private String prenomE;
    @Column(name="")
    private String nomE;
    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL)
    private Set<Equipe> equipes;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "etudiant")
    private Set<Contrat> contrats;
    @ManyToOne
    private Departement departement;



}
