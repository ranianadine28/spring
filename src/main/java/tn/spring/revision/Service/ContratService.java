package tn.spring.revision.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.revision.Repository.IContratRepository;

@Service
public class ContratService implements IContratService{
    @Autowired
    private IContratRepository ContratRepository;
    public ContratService(){

    }
}
