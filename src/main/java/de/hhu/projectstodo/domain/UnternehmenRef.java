package de.hhu.projectstodo.domain;


import org.springframework.data.relational.core.mapping.Table;

@Table("project_unternehmen")
public class UnternehmenRef {
    private Integer unternehmenID;

    public Integer getUnternehmenID() {
        return unternehmenID;
    }

    public void setUnternehmenID(Integer unternehmenID) {
        this.unternehmenID = unternehmenID;
    }

    public UnternehmenRef(Integer unternehmenID) {
        this.unternehmenID = unternehmenID;
    }
}
