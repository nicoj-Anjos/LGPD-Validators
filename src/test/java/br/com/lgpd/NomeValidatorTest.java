package br.com.lgpd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NomeValidatorTest {

    private final NomeValidator validator =
            new NomeValidator();

    @Test
    void deveAceitarNomeValido() {
        assertFalse(
                validator.validar("João Silva"));
    }

    @Test
    void deveRejeitarNomeNulo() {
        assertFalse(
                validator.validar(null));
    }

    @Test
    void deveRejeitarNomeVazio() {
        assertFalse(
                validator.validar(""));
    }

    @Test
    void deveRejeitarNomeComNumeros() {
        assertFalse(
                validator.validar("Joao123"));
    }
}