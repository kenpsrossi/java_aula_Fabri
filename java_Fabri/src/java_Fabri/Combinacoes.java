package java_Fabri;

import java.util.Scanner;

public class Combinacoes {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        System.out.println("Olá, vamos observar as combinações! ");

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = sc.nextInt();

        System.out.print("Digite o valor de D: ");
        int D = sc.nextInt();

        // Exibindo os resultados das combinações
        System.out.println("\nResultados das adições:");
        System.out.println("A + B = " + (A + B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A + D = " + (A + D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B + D = " + (B + D));
        System.out.println("C + D = " + (C + D));

        System.out.println("\nResultados das multiplicações:");
        System.out.println("A * B = " + (A * B));
        System.out.println("A * C = " + (A * C));
        System.out.println("A * D = " + (A * D));
        System.out.println("B * C = " + (B * C));
        System.out.println("B * D = " + (B * D));
        System.out.println("C * D = " + (C * D));

        sc.close();
    }
}
