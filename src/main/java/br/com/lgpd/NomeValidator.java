package br.com.lgpd;

public class NomeValidator {

    public boolean validar(String nome) {
        if (nome == null) return false;

        nome = nome.trim();

        if (nome.isEmpty()) return false;

        if (nome.length() < 2 || nome.length() > 100)
            return false;

        if (nome.contains("  "))
            return false;

        return nome.matches(
                "^[A-Za-zÀ-ÿ]+(?:[ '-][A-Za-zÀ-ÿ]+)*$");
    }
}