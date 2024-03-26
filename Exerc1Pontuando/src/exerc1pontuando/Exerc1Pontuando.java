package exerc1pontuando;

import java.util.Scanner;

public class Exerc1Pontuando {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o nome do aluno
        System.out.println("Informe o nome do aluno:");
        String nome = scanner.nextLine();

        // Chama o método lerNota para obter a primeira e a segunda nota do aluno
        double nota1 = lerNota("primeira");
        double nota2 = lerNota("segunda");

        // Calcula a média das duas notas
        double media = calcularMedia(nota1, nota2);

        // Exibe a média calculada
        System.out.println("Média: " + media);

        // Verifica se a média é maior ou igual a 7.0 e exibe uma mensagem de aprovação ou reprovação
        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
    }

    // Método para ler uma nota do usuário
    public static double lerNota(String ordem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a " + ordem + " nota:");
        return scanner.nextDouble(); // Retorna a nota lida
    }

    // Método para calcular a média de duas notas
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2; // Retorna a média das duas notas
    }
}