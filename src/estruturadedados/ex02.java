package estruturadedados;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        int constMultiplicativa;

        int [] numeros = new int[5];

        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite 5 números: ");

        for (int i = 0; i <numeros.length ; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Digite  uma constante multiplicativa: ");
        constMultiplicativa = scanner.nextInt();

        scanner.close();


        System.out.println(" O vetor multiplicado por "  +  constMultiplicativa + " Fica: ");




        for (int i = 0 ; i <numeros.length ; i++) {
            numeros[i] = constMultiplicativa*numeros[i];

            System.out.println(numeros[i] + " ");
        }



    }
}
