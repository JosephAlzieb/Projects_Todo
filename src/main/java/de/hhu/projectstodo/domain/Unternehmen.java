package de.hhu.projectstodo.domain;

import javax.persistence.Id;

public record Unternehmen (@Id Long id, String name, String vertreter) {

    public Unternehmen {
    }
}
