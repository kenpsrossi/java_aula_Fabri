package java_Fabbri;

import java.util.Scanner;

public class Fahrenheit_Para_Celsius {

	public Fahrenheit_Para_Celsius() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Solicitar a Temperatura em Fahrenheit
		System.out.println("Olá, Vamos converter Fahrenheit em Celsius!");
		System.out.println("Digite a Temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		//converter 
		double celsius = ((fahrenheit - 32) *5)/9;
		
		System.out.printf("A Temperatura em Celsius é: %.1f\n" , celsius);
		
		sc.close();

	}

}
