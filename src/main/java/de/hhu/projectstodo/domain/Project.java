package de.hhu.projectstodo.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.time.LocalDateTime;

public record Project(
        @Id
        Long id,
        String title,
        String type,
        String color,
        String description,
        Integer days,
        Double price,
        Boolean featured,
        @DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)
        LocalDateTime launchDate){

    public Project {
    }
}
