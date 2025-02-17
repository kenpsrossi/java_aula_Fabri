package java_Fabbri;

import java.util.Scanner;

public class Calculadora_IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, vamos calcular seu IMC!");
        
        // Solicitar entrada do usuário
        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        // Calcular o IMC
        double imc = peso / (altura * altura);

        // Exiber o resultado
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
       
        // Fecha o scanner
        sc.close();
   

    }

   
}

	
