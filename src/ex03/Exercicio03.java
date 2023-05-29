package ex03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("Boas vindas ao Simulador de Aprovação");
        System.out.println("-------------------------------------");

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        while (nota1 < 0 || nota1 > 10){
            System.out.println("Nota inválida!");
            System.out.println("Digite a primeira nota: ");
            nota1 = sc.nextDouble();
        }
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 10){
            System.out.println("Nota inválida!");
            System.out.println("Digite a primeira nota: ");
            nota2 = sc.nextDouble();
        }


        double media = (nota1 + nota2) / 2;

        System.out.println("*************************");
        if (media == 10){
            System.out.println("Você foi aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }
        System.out.println("*************************");
    }
}
