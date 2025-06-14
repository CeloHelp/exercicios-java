package estruturadedados;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
            int [] numeros = new int[10];

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite 10 números: ");

            for (int i = 0; i <numeros.length ; i++) {
                numeros[i] = scanner.nextInt();
            }

            scanner.close();

        System.out.println("O indíce ao contrário fica: ");


            for (int i = 9; i>=0;i--){
                System.out.println(numeros[i]);
            }












    }
}
