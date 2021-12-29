package de.hhu.projectstodo.services;

import de.hhu.projectstodo.domain.Unternehmen;
import de.hhu.projectstodo.repositories.UnternehmenRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UnternehmenServiceTset {

    UnternehmenRepository repo = mock(UnternehmenRepository.class);
    UnternehmenService service = new UnternehmenService(repo);

    @Test
    @DisplayName("Alle Unternehmen aus der DB holen, wenn es aber keine gibt")
    void test_1(){
        when(repo.getAllUnternehmen()).thenReturn(Collections.emptyList());
        List<Unternehmen> unternehmen = service.getUnternehmen();
        assertThat(unternehmen).hasSize(0);
    }

    @Test
    @DisplayName("Alle Unternehmen aus der DB holen")
    void test_2(){
        when(repo.getAllUnternehmen()).thenReturn(List.of(new Unternehmen(1,"u5","joe")));
        List<Unternehmen> unternehmen = service.getUnternehmen();
        assertThat(unternehmen).hasSize(1);
        assertThat(unternehmen.get(0).name()).isEqualTo("u5");
    }

}
