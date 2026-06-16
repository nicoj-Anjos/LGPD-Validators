package br.com.lgpd;

public class EmailValidator {

    public boolean validar(String email) {

        if (email == null)
            return false;

        email = email.trim();

        if (email.isEmpty())
            return false;

        if (email.length() < 6 || email.length() > 254)
            return false;

        if (email.contains(".."))
            return false;

        return email.matches(
                "^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)+$");
    }
}