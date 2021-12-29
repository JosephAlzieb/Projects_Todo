package de.hhu.projectstodo.domain;

import javax.persistence.Id;

public record Unternehmen (@Id Integer id, String name, String vertreter) {

    public Unternehmen {
    }

}
