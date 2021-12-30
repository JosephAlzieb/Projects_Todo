package de.hhu.projectstodo.services;

import de.hhu.projectstodo.db.UnternehmenRepositoryImpl;
import de.hhu.projectstodo.domain.Unternehmen;
import de.hhu.projectstodo.repositories.UnternehmenRepository;

import java.util.List;
public class UnternehmenService {

    private UnternehmenRepository repo;

    public UnternehmenService(UnternehmenRepository repo) {
        this.repo = repo;
    }

    public List<Unternehmen> getUnternehmen() {
        return repo.getAllUnternehmen();
    }

    public void saveUnternehmen(Unternehmen unternehmen){
        repo.saveUnternehmen(unternehmen);
    }

    public Unternehmen findUnternehmenById(int id){
        return repo.findUnternehmenById(id);
    }
}
