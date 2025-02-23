package java_Fabri;

import java.util.Scanner;

public class Prestacao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, vamos verificar as prestações! ");


        // Solicitando os valores ao usuário
        System.out.print("Digite o valor da prestação: ");
        double valor = sc.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mês): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite o tempo de atraso (em meses): ");
        int tempo = sc.nextInt();

        // Calculando a prestação em atraso
        double prestacao = valor + (valor * (taxa / 100) * tempo);

        // Exibindo o resultado
        System.out.printf("O valor da prestação em atraso é: R$ %.2f\n", prestacao);

        
        sc.close();
    }
}
