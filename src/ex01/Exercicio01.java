package ex01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        System.out.println("Digite o número 1: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite o Número 2: ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.printf("O maior número é: %.2f", num1);
        } else {
            System.out.printf("O maior número é: %.2f", num2);
        }

    }
}
