package de.hhu.projectstodo.db;

import de.hhu.projectstodo.domain.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepositoryDao extends CrudRepository<Project,Integer> {

    List<Project> findAll();
}
