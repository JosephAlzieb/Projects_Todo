package de.hhu.projectstodo.repositories;

import de.hhu.projectstodo.domain.Project;

import java.util.List;

public interface ProjectRepository {
    List<Project> getAllProjects();
    void saveProject (Project project);
    }
