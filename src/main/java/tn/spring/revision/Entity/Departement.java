package tn.spring.revision.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="T_Departement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Departement implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="")
    private String nomDepart;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departement")
    private Set<Etudiant> etudiants;



}
