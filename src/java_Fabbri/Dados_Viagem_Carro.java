package java_Fabbri;

import java.util.Scanner;

public class Dados_Viagem_Carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada de dados
        System.out.println("Olá, vamos obter os dados da viagem!");
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = sc.nextDouble();
        
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = sc.nextDouble();
        
        // Cálculo da distância percorrida
        double distancia = tempo * velocidade;
        
        // Cálculo do consumo de combustível
        double litrosUsados = distancia / 12;
        
        // Saída dos resultados
        System.out.println("\nResultados da viagem:");
        System.out.println("Velocidade Média: " + velocidade + " km/h");
        System.out.println("Tempo Gasto: " + tempo + " horas");
        System.out.println("Distância Percorrida: " + distancia + " km");
        System.out.println("Litros de Combustível Utilizados: " + litrosUsados + " L");
        
        sc.close();
    }
}
