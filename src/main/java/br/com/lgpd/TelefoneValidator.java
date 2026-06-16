package br.com.lgpd;

public class TelefoneValidator {

    public boolean validar(String telefone) {

        if (telefone == null)
            return false;

        telefone = telefone.replaceAll("\\D", "");

        if (!(telefone.length() == 10 || telefone.length() == 11))
            return false;

        if (telefone.matches("(\\d)\\1+"))
            return false;

        int ddd = Integer.parseInt(
                telefone.substring(0, 2));

        if (ddd < 11 || ddd > 99)
            return false;

        char terceiroDigito = telefone.charAt(2);

        if (telefone.length() == 11)
            return terceiroDigito == '9';

        return terceiroDigito >= '2'
                && terceiroDigito <= '5';
    }
}