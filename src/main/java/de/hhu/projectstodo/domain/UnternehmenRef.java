package de.hhu.projectstodo.domain;

import org.springframework.data.relational.core.mapping.Table;

@Table("project_unternehmen")
public record UnternehmenRef (Integer unternehmen){

}
