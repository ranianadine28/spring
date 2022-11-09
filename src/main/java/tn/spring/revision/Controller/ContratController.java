package tn.spring.revision.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.revision.Service.ContratService;

@RestController
public class ContratController {
@Autowired
    ContratService ServiceContrat;
    public ContratController(ContratService ServiceContrat){
        this.ServiceContrat=ServiceContrat;
    }

}
