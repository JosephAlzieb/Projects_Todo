package de.hhu.projectstodo.db;

import de.hhu.projectstodo.domain.Unternehmen;
import org.springframework.data.repository.CrudRepository;

public interface UnternehmenRepositoryDao extends CrudRepository<Unternehmen,Integer> {
}
