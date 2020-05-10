package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    // Inicio do ciclo
    // Cria o testes
    // Vai ver o teste falhar
    // Implementar
    // Ver ser o teste passou
    // Refatorar
    // Roda o teste de novo
    // Reinicia o ciclo

    @Test
    void when_received_age_minor_than_16_returns_illegal_argument_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(16));
    }

    @Test
    void when_received_age_major_than_150_returns_illegal_argument_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(250));
    }

}