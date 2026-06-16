package br.com.lgpd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    private final EmailValidator validator =
            new EmailValidator();

    @Test
    void deveAceitarEmailValido() {
        assertTrue(
                validator.validar("joao@email.com"));
    }

    @Test
    void deveRejeitarEmailSemArroba() {
        assertFalse(
                validator.validar("joaoemail.com"));
    }

    @Test
    void deveRejeitarEmailNulo() {
        assertFalse(
                validator.validar(null));
    }

    @Test
    void deveRejeitarEmailComDoisPontosSeguidos() {
        assertFalse(
                validator.validar("joao..teste@email.com"));
    }
}