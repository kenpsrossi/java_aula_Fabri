package java_Fabbri;

import java.util.Scanner;

public class Volume_Lata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar ao usuário o raio
        System.out.println("Olá, Vamos calcular o volume da lata de óleo!");
        System.out.println("Digite o raio da lata de óleo (cm): ");
        double raio = sc.nextDouble();
        
        // Solicitar a altura da lata
        System.out.print("Digite a altura da lata de óleo (cm): ");
        double altura = sc.nextDouble();
        
        // Calcular o volume da lata
        double volume = 3.14159 * Math.pow(raio, 2) * altura;
        
        // Exiber o resultado
        System.out.printf("O volume da lata de óleo é: %.2f cm³\n", volume);
        
        sc.close();
    }
}

