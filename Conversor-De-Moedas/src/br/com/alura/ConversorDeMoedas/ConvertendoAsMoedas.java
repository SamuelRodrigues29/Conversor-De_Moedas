package br.com.alura.ConversorDeMoedas;
import br.com.alura.ConversorDeMoedas.ChamandoApi;

import java.util.Scanner;

public class ConvertendoAsMoedas {
    private static double dolarParaRealBrasileiro;
    private static double dolarParaPesoArgentino;
    private static double dolarParaPesoColombiano;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opção de conversão:");
        System.out.println("1. USD para ARS");
        System.out.println("2. USD para COP");
        System.out.println("3. USD para BRL");
        System.out.println("4. ARS para USD");
        System.out.println("5. COP para USD");
        System.out.println("6. BRL para USD");

        int opcao = scanner.nextInt();

        // Solicita a quantidade a ser convertida
        System.out.println("Digite a quantidade a ser convertida:");
        double quantidade = scanner.nextDouble();

        // Realiza a conversão com base na opção escolhida
        double quantidadeConvertida = 0;

        switch (opcao) { 
            case 1:
                // USD para ARS
                quantidadeConvertida = quantidade * dolarParaPesoArgentino;
                System.out.printf("%.2f USD convertidos para ARS: %.2f ARS\n", quantidade, quantidadeConvertida);
                break;

            case 2: 
                // USD para COP
                quantidadeConvertida = quantidade * dolarParaPesoColombiano;
                System.out.printf("%.2f USD convertidos para COP: %.2f COP\n", quantidade, quantidadeConvertida);
                break;

            case 3:
                // USD para BRL                
                quantidadeConvertida = quantidade * dolarParaRealBrasileiro;
                System.out.printf("%.2f USD convertidos para BRL: %.2f BRL\n", quantidade, quantidadeConvertida);
                break;

            case 4:
                // ARS para USD
                quantidadeConvertida = quantidade / dolarParaPesoArgentino;
                System.out.printf("%.2f ARS convertidos para USD: %.2f USD\n", quantidade, quantidadeConvertida);
                break;

            case 5:
                // COP para USD
                quantidadeConvertida = quantidade / dolarParaPesoColombiano;
                System.out.printf("%.2f COP convertidos para USD: %.2f USD\n", quantidade, quantidadeConvertida);
                break;

            case 6:
                // BRL para USD
                quantidadeConvertida = quantidade / dolarParaRealBrasileiro;
                System.out.printf("%.2f BRL convertidos para USD: %.2f USD\n", quantidade, quantidadeConvertida);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }


    }
}