package br.com.lgpd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneValidatorTest {

    private final TelefoneValidator validator =
            new TelefoneValidator();

    @Test
    void deveAceitarCelularValido() {
        assertTrue(
                validator.validar("41999998888"));
    }

    @Test
    void deveAceitarTelefoneFixoValido() {
        assertTrue(
                validator.validar("4133334444"));
    }

    @Test
    void deveRejeitarTelefoneNulo() {
        assertFalse(
                validator.validar(null));
    }

    @Test
    void deveRejeitarDDDInvalido() {
        assertFalse(
                validator.validar("00999998888"));
    }

    @Test
    void deveRejeitarNumerosRepetidos() {
        assertFalse(
                validator.validar("11111111111"));
    }
}