package de.hhu.projectstodo.db;

import de.hhu.projectstodo.domain.Unternehmen;
import de.hhu.projectstodo.repositories.UnternehmenRepository;

import java.util.List;

public class UnternehmenRepositoryImpl implements UnternehmenRepository {

    private UnternehmenRepositoryDao repositoryDao;

    public UnternehmenRepositoryImpl(UnternehmenRepositoryDao repositoryDao) {
        this.repositoryDao = repositoryDao;
    }

    @Override
    public List<Unternehmen> getAllUnternehmen() {
        return repositoryDao.findAll();
    }

    @Override
    public void saveUnternehmen(Unternehmen unternehmen) {
        repositoryDao.save(unternehmen);
    }
}
