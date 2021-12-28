package de.hhu.projectstodo.repositories;

import de.hhu.projectstodo.domain.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Long, Project> {
    List<Project> findAllById(Long id);
}
