package java_Fabbri;

import java.util.Scanner;

public class Celsius_Para_Fahrenheit {

	public Celsius_Para_Fahrenheit() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Solicitar a Temperatura em Celsius
		System.out.println ("Olá, Vamos Converter Celsius para Fahrenheit!");
		System.out.println ("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		//Transformar Celsius em Fahrenheit
		double fahrenheit = celsius * 9 / 5 + 32;
		
		 // Exibe o resultado
        System.out.printf("A temperatura em Fahrenheit é: %.2f\n", fahrenheit);

        // Fecha o scanner
        sc.close();
		

	}

}
