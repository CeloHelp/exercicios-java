package estruturadedados;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int [5];
        int [] numeros2 = new int [5];

        System.out.println("Digite 5 números: ");
        for(int i=0;i<numeros.length;i++){
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Digite uma constante Multiplicativa: ");
        int constMultiplicativa = scanner.nextInt();

        scanner.close();

        for(int i=0;i<numeros.length;i++){
            numeros2[i] = numeros[i] * constMultiplicativa;

            System.out.println("Original: " + numeros[i] + "\t→ Modificado: " + numeros2[i]);

        }
    }
}
