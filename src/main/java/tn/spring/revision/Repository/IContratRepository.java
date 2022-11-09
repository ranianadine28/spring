package tn.spring.revision.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.revision.Entity.Contrat;

import java.util.List;

@Repository
public interface IContratRepository extends JpaRepository<Contrat,Long> {

    List<Contrat> findByEtudiantnomEContains(String nomE);




}
