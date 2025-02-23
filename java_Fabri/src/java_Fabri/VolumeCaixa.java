package java_Fabri;

import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, vamos calcular o volume da caixa! ");

        
        System.out.print("Digite o comprimento da caixa (cm): ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite a largura da caixa (cm): ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura da caixa (cm): ");
        double altura = sc.nextDouble();

        // Calculando o volume da caixa
        double volume = comprimento * largura * altura;

        // Exibindo o resultado
        System.out.printf("O volume da caixa é: %.2f cm³\n", volume);

        sc.close();
    }
}
