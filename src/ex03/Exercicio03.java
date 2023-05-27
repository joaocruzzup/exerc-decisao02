package ex03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Você foi aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }
    }
}
