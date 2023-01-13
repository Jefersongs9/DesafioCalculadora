package org.example.simples;

import org.example.SelecionarOperacao;
import org.example.galosina.Gasolina;
import org.example.imc.Imc;
import org.example.imposto.Imposto;

import java.util.Scanner;

public class FuncaoOperacao {

    public static void simples () {

        System.out.println( "Escolha uma das seguintes operações: dividir, multiplicar, somar ou subtrair.");

        Scanner escolhendooperacao = new Scanner(System.in);

        String operacaoescolhida = escolhendooperacao.next();

        switch (operacaoescolhida){
            case "dividir": dividir();
            break;
            case "multiplicar": multiplicar();
            break;
            case "somar": somar();
            break;
            case "subtrair": subtrair();
            break;

            default:
                System.out.println("Ops! algo deu errado. Escolha uma dentre as seguintes operações: dividir, multiplicar, somar, subtrair");
        }

    };

        public static void dividir() {


            Scanner ScannerCapturaEntradaDoUsuario = new Scanner(System.in);

            System.out.println("Informe o primeiro numero");
            long num1 = ScannerCapturaEntradaDoUsuario.nextInt();

            System.out.println("Informe o segundo numero");
            long num2 = ScannerCapturaEntradaDoUsuario.nextInt();

            long resultado = num1 / num2;
            System.out.println("Seu resultado é " + resultado);

        }

        public static void multiplicar() {

            Scanner ScannerCapturaEntradaDoUsuario = new Scanner(System.in);

            System.out.println("Informe o primeiro numero");
            long num1 = ScannerCapturaEntradaDoUsuario.nextInt();

            System.out.println("Informe o segundo numero");
            long num2 = ScannerCapturaEntradaDoUsuario.nextInt();

            long resultado = num1 * num2;
            System.out.println("Seu resultado é " + resultado);

        }

        public static void somar() {


            Scanner ScannerCapturaEntradaDoUsuario = new Scanner(System.in);

            System.out.println("Quantos números você deseja somar");

            System.out.println("Informe o primeiro numero");
            long num1 = ScannerCapturaEntradaDoUsuario.nextInt();

            System.out.println("Informe o segundo numero");
            long num2 = ScannerCapturaEntradaDoUsuario.nextInt();

            long resultado = num1 + num2;
            System.out.println("Seu resultado é " + resultado);

        }

        public static void subtrair() {

            Scanner ScannerCapturaEntradaDoUsuario = new Scanner(System.in);

            System.out.println("Informe o primeiro numero");
            long num1 = ScannerCapturaEntradaDoUsuario.nextInt();

            System.out.println("Informe o segundo numero");
            long num2 = ScannerCapturaEntradaDoUsuario.nextInt();

            long resultado = num1 - num2;
            System.out.println("Seu resultado é " + resultado);

        }
    }


