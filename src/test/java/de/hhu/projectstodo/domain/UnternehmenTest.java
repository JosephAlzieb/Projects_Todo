package de.hhu.projectstodo.domain;

import de.hhu.projectstodo.services.UnternehmenService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnternehmenTest {
    UnternehmenService service = new UnternehmenService();

    @Test
    @DisplayName("Object erstellen")
    void test_1(){
        Unternehmen unternehmen = new Unternehmen(1, "u1", "joe");
        assertThat(unternehmen).isNotNull();
    }

}
