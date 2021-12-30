package de.hhu.projectstodo.repositories;

import de.hhu.projectstodo.domain.Unternehmen;

import java.util.List;

public interface UnternehmenRepository {

    List<Unternehmen> getAllUnternehmen();
    void saveUnternehmen (Unternehmen unternehmen);
    Unternehmen findUnternehmenById(int id);
}
