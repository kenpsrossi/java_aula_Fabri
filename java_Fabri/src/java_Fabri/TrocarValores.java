package java_Fabri;

import java.util.Scanner;

public class TrocarValores {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        System.out.println("Olá, vamos trocar os valores!");


        // Solicitando os valores ao usuário
        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        // Exibindo os valores antes da troca
        System.out.println("\nAntes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Trocando os valores sem usar uma terceira variável
        A = A + B;
        B = A - B;
        A = A - B;

        // Exibindo os valores após a troca
        System.out.println("\nDepois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        sc.close();
    }
}
