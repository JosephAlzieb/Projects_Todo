package de.hhu.projectstodo.db;

import de.hhu.projectstodo.domain.Project;
import de.hhu.projectstodo.repositories.ProjectRepository;

import java.util.List;

public class ProjectRepositoryImpl implements ProjectRepository {

    private ProjectRepositoryDao repositoryDao;

    @Override
    public List<Project> getAllProjects() {
        return repositoryDao.findAll();
    }

    @Override
    public void saveProject(Project project) {
        repositoryDao.save(project);
    }
}
