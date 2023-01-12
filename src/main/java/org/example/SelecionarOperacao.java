package org.example;

import org.example.galosina.Gasolina;
import org.example.imposto.Imposto;

import java.util.Scanner;

public class SelecionarOperacao {

    public static void operacao () {

        System.out.println ("Digite o número de qual das calculadoras você irá utilizar:");
        System.out.println("1 para imposto de renda ");
        System.out.println("2 para calculadora de gasolina ");
        System.out.println("3 para calculadora de IMC");
        System.out.println("4 para calculadora de subtração, adição, multiplicação ou adição");

        Scanner opcaocalc = new Scanner(System.in);
        int calc = opcaocalc.nextInt();

        switch (calc) {

            case 1: Imposto.impostoRenda();
            break;
            case 2: Gasolina.gasolina();
            break;
        }

    }
}
