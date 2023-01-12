package org.example.imc;
import java.io.PrintStream;
import java.util.Scanner;

public class Imc {

    public static void IMC() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade");
        double idade = sc.nextDouble();

        System.out.println("Digite seu peso");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        double IMC = peso/(altura*altura);

        PrintStream printf = System.out.printf("Voce, %s, que possue %.0f anos, esta com o imc de %.2f ", nome, idade, IMC);

        if (IMC<18.5)
            System.out.println (", e se enquadra na faixa de obesidade - MAGREZA");
        else
        if ((IMC>=18.5)&&(IMC<=24.9))
            System.out.println ("e se enquadra na faixa de obesidade - NORMAL");
        else
        if ((IMC>=25.0)&&(IMC<=29.9))
            System.out.println("e se enquadra na faixa de obesidade - SOBREPESO");
        else
        if ((IMC>=30.0)&&(IMC<=34.9))
            System.out.println("e se enquadra na faixa de obesidade - OBESIDADE I");
        else
        if ((IMC>=35.0)&&(IMC <=39.9))
            System.out.println (" e se enquadra na faixa de - OBESIDADE II");
        else
        if (IMC>=40)
            System.out.println ("e se enquadra na faixa de obesidade - OBESIDADE GRAVE");

    }

}
