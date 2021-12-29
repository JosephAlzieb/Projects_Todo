package de.hhu.projectstodo.services;

import de.hhu.projectstodo.db.ProjectRepositoryImpl;
import de.hhu.projectstodo.domain.Project;
import de.hhu.projectstodo.repositories.ProjectRepository;

import java.util.List;


public class ProjectService {

    private ProjectRepository repo;

    public ProjectService(ProjectRepository repo) {
        this.repo = repo;
    }

    public List<Project> getProjects() {
        return repo.getAllProjects();
    }

    public void saveProject(Project project){
        repo.saveProject(project);
    }
}
