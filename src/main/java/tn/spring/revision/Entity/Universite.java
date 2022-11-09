package tn.spring.revision.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="T_Universite")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Universite implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="")
    private String nomUniv;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;
}
