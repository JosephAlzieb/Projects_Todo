package de.hhu.projectstodo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjektTest {

    @Test
    @DisplayName("Object erstellen")
    void test_1(){
//        LocalDateTime d1 = LocalDateTime.of(2021, 1, 3, 1, 12);
        Project project= new Project("p1","any","red","any",5,10000, "2020-12-12 12:00");
        assertThat(project).isNotNull();
    }
}
