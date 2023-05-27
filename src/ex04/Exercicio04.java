package ex04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        double salario = sc.nextDouble();
        double taxa;
        double aumento;
        double salarioAjustado;

        if (salario <= 280){
            taxa = 0.20;
        } else if (salario <= 700) {
            taxa = 0.15;
        } else if (salario <= 1500) {
            taxa = 0.10;
        } else {
            taxa = 0.05;
        }
        aumento = salario * taxa;
        salarioAjustado = salario + aumento;

        System.out.println("O seu salário antes era de: " + salario);
        System.out.printf("O percentual do seu aumento foi de: %.0f%% %n", taxa * 100);
        System.out.println("O valor do seu aumento foi de: " + aumento);
        System.out.println("O seu novo salário será de: " + salarioAjustado);
    }
}
