package de.hhu.projectstodo.db;

import de.hhu.projectstodo.domain.Unternehmen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UnternehmenRepositoryDao extends CrudRepository<Unternehmen,Integer> {

    List<Unternehmen> findAll();
}
