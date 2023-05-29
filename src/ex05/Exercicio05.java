package ex05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Boas-vindas ao seu Dia da Semana");
        System.out.println("--------------------------------");

        System.out.println("Digite um número de 1 a 7: ");
        int num = sc.nextInt();

        while ((num < 1) || (num > 7)){
            System.out.println("Valor inválido!");
            System.out.println("Digite um número de 1 a 7: ");
            num = sc.nextInt();
        }

        String dia = "";
        switch (num){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia ="Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
        }

        System.out.println("---------------------------");
        System.out.println("O dia da semana é: " + dia);




    }
}
