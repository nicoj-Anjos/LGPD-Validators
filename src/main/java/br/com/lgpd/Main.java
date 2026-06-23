package br.com.lgpd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NomeValidator nomeValidator = new NomeValidator();
        EmailValidator emailValidator = new EmailValidator();
        TelefoneValidator telefoneValidator = new TelefoneValidator();

        System.out.println("=== Cadastro de Usuário ===");

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        boolean nomeValido = nomeValidator.validar(nome);
        boolean emailValido = emailValidator.validar(email);
        boolean telefoneValido = telefoneValidator.validar(telefone);

        System.out.println("\n=== Resultado das Validações ===");

        System.out.println("Nome: "
                + (nomeValido ? "VÁLIDO" : "INVÁLIDO"));

        System.out.println("E-mail: "
                + (emailValido ? "VÁLIDO" : "INVÁLIDO"));

        System.out.println("Telefone: "
                + (telefoneValido ? "VÁLIDO" : "INVÁLIDO"));

        if (nomeValido && emailValido && telefoneValido) {
            System.out.println("\nCadastro realizado com sucesso!");
        } else {
            System.out.println("\nCadastro não realizado.");
            System.out.println("Verifique os dados informados.");
        }

        scanner.close();
    }
}