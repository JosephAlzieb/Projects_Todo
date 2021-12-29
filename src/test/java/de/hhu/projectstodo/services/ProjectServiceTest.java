package de.hhu.projectstodo.services;

import de.hhu.projectstodo.domain.Project;
import de.hhu.projectstodo.repositories.ProjectRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProjectServiceTest {

    ProjectRepository repo = mock(ProjectRepository.class);
    ProjectService service = new ProjectService(repo);

    @Test
    @DisplayName("Alle Unternehmen aus der DB holen, wenn es aber keine gibt")
    void test_1(){
        when(repo.getAllProjects()).thenReturn(Collections.emptyList());
        List<Project> projects = service.getProjects();
        assertThat(projects).hasSize(0);
    }

    @Test
    @DisplayName("Alle Unternehmen aus der DB holen")
    void test_2(){
        LocalDateTime d5=LocalDateTime.of(2010,12,02,12,00);
        Project p1 = new Project("p5","t5","red","d5",5,2200,d5);
        when(repo.getAllProjects()).thenReturn(List.of(p1));
        List<Project> projects = service.getProjects();
        assertThat(projects).hasSize(1);
        assertThat(projects.get(0).getTitle()).isEqualTo("p5");
    }
}
