package de.hhu.projectstodo.services;

import de.hhu.projectstodo.db.UnternehmenRepositoryImpl;
import de.hhu.projectstodo.domain.Unternehmen;

import java.util.List;

public class UnternehmenService {


    private UnternehmenRepositoryImpl repo;

    List<Unternehmen> getUnternehmen() {
        return repo.getAllUnternehmen();
    }

    void saveUnternehmen(Unternehmen unternehmen){
        repo.saveUnternehmen(unternehmen);
    }
}
