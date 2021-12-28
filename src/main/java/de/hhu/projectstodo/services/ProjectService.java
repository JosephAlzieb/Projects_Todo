package de.hhu.projectstodo.services;

import de.hhu.projectstodo.db.ProjectRepositoryImpl;
import de.hhu.projectstodo.domain.Project;
import de.hhu.projectstodo.repositories.ProjectRepository;

import java.util.List;


public class ProjectService {

    private ProjectRepositoryImpl repo;

    List<Project> getProjects() {
        return repo.getAllProjects();
    }

    void saveProject(Project project){
        repo.saveProject(project);
    }
}
