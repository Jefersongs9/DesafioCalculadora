package org.example.galosina;

import java.util.Scanner;
public class Gasolina {
    public static void gasolina () {

        Scanner sc = new Scanner(System.in);

        System.out.println("obs: Digite apenas numeros!");
        System.out.println("Quantos litros de gasolina o seu carro gasta por quilometro?");

        double kmPorLitro = sc.nextDouble();

        System.out.println("Quantos quilometros voce pretende percorrer?");

        double km = sc.nextDouble();

        System.out.println("Qual o valor atual da gasolina?");

        double valorDaGasolina = sc.nextDouble();

        double litroASeremUsados = km / kmPorLitro;

        double valorASerPago = valorDaGasolina * litroASeremUsados;

        System.out.printf("Voce precisara de %.1f litros de gasolina para percorrer %.1f quilometros e ira gastar um valor de R$ %.2f ", litroASeremUsados, km, valorASerPago);


        sc.close();

    }
}
