package de.hhu.projectstodo.config;

import de.hhu.projectstodo.repositories.ProjectRepository;
import de.hhu.projectstodo.repositories.UnternehmenRepository;
import de.hhu.projectstodo.services.ProjectService;
import de.hhu.projectstodo.services.UnternehmenService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public UnternehmenService unternehmenService(UnternehmenRepository unternehmenRepository){
        return new UnternehmenService(unternehmenRepository);
    }

    @Bean
    public ProjectService projectService(ProjectRepository projectRepository){
        return new ProjectService(projectRepository);
    }

}
