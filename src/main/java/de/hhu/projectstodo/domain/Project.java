package de.hhu.projectstodo.domain;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Project")
public class Project {

    @Id
    private Integer id;
    private String title;
    private String type;
    private String color;
    private String description;
    private int days;
    private double price;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime launchDate;
    private Set<UnternehmenRef> unternehmen = new HashSet<>();


    public Project() {
    }

}
