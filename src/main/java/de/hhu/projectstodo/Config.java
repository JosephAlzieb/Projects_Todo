package de.hhu.projectstodo;

import de.hhu.projectstodo.repositories.UnternehmenRepository;
import de.hhu.projectstodo.services.UnternehmenService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public UnternehmenService unternehmenService(UnternehmenRepository unternehmenRepository){
        return new UnternehmenService(unternehmenRepository);
    }

}
