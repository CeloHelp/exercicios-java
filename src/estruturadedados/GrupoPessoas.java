package estruturadedados;

import java.util.ArrayList;
import java.util.Scanner;




public class GrupoPessoas {


    private final Pessoa[] pessoas;

    public void listarMulheres() {
        System.out.println("Lista de Mulheres:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.sexo.equalsIgnoreCase("F")) {
                System.out.println("Nome: " + pessoa.nome + ", Idade: " + pessoa.idade);
            }
        }
    }

    public GrupoPessoas(int quantidadePessoas, Scanner scanner) {
        this.pessoas = new Pessoa[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            String sexo;
            do {
                System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
                sexo = scanner.nextLine().toUpperCase();
            } while (!sexo.equals("M") && !sexo.equals("F"));

            int idade;
            do {
                System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
                idade = scanner.nextInt();
                scanner.nextLine();
            } while (idade <= 0);

            scanner.nextLine(); // Limpar o buffer do scanner
            this.pessoas[i] = new Pessoa(nome, sexo, idade);


        }




    }




    public  class Pessoa {
        private String nome;
        private String sexo;
        private int idade;

        public Pessoa(String nome, String sexo, int idade) {
            this.nome = nome;
            this.sexo = sexo;
            this.idade = idade;
        }
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine();

        GrupoPessoas grupo = new GrupoPessoas(quantidadePessoas, scanner);
        grupo.listarMulheres();

        scanner.close();

        if (quantidadePessoas >= 20) {
            System.out.println("Número máximo de pessoas atingido.");
        }

    }





}