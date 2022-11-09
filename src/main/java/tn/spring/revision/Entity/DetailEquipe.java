package tn.spring.revision.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="T_DetailEquipe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="")
    private Integer salle;
    @Column(name="")
    private String thematique;
    @OneToOne(mappedBy = "DetailEquipe")
    private Equipe equipe;




}
