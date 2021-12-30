package de.hhu.projectstodo.db;

import de.hhu.projectstodo.domain.Project;
import de.hhu.projectstodo.repositories.ProjectRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProjectRepositoryImpl implements ProjectRepository {


    private ProjectRepositoryDao repositoryDao;

    public ProjectRepositoryImpl(ProjectRepositoryDao repositoryDao) {
        this.repositoryDao = repositoryDao;
    }

    @Override
    public List<Project> getAllProjects() {
        return repositoryDao.findAll();
    }

    @Override
    public void saveProject(Project project) {
        repositoryDao.save(project);
    }

    @Override
    public Project findProjectById(int id) {
        return repositoryDao.findById(id).get();
    }
}
