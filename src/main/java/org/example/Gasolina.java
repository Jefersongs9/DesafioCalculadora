package org.example;

public class Imposto {
    public static void impostoRenda () {

        System.out.println("Digite seu salário bruto mensal: ");

        Scanner digiteosalario = new Scanner(System.in);

        double salario = digiteosalario.nextInt();


        if ( salario < 1903.98) {
            System.out.println("Você está isento de imposto de renda");
        }
        else if (salario >=1903.98 && salario <2826.65){

            double imposto = salario * 0.075;

            double salariodeduzido = salario - imposto;

            System.out.printf("Você pagará de imposto %.2f e receberá o salário líquido de %.2f", imposto, salariodeduzido);

        }

    }
}
