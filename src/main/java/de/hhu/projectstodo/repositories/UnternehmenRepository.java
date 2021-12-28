package de.hhu.projectstodo.repositories;

import de.hhu.projectstodo.domain.Unternehmen;
import org.springframework.data.repository.CrudRepository;

public interface UnternehmenRepository extends CrudRepository<Long, Unternehmen> {
}
