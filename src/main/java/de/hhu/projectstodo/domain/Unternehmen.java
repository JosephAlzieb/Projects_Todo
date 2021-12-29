package de.hhu.projectstodo.domain;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="untenehmen")
public record Unternehmen (@Id Integer id, String name, String vertreter) {

    public Unternehmen {
    }

}
