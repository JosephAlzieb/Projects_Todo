package de.hhu.projectstodo.domain;


import org.springframework.data.annotation.Id;

public record Unternehmen (@Id Integer id, String name, String vertreter) {
}

//import javax.persistence.Id;