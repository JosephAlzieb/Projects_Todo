package de.hhu.projectstodo.domain;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Id;

@Table("Unternehmen")
public record Unternehmen (@Id Integer id, String name, String vertreter) {

    public Unternehmen {
    }
}
