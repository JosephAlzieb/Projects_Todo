package de.hhu.projectstodo.domain;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name="Project")
public record Project(
        @Id
        Integer id,
        String title,
        String typ,
        String color,
        String description,
        int days,
        double price,
        @DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)
        LocalDateTime launchDate){

    public Project {
    }

    }
