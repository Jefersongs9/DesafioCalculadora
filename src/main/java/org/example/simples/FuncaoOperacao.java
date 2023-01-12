package org.example.simples;

import java.util.Scanner;

public class FuncaoOperacao {

        Scanner ScannerCapturaEntradaDoUsuario = new Scanner(System.in);

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


