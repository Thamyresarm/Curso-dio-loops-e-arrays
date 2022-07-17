package br.com.model;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        double a;
        double maior = 0;
        double soma = 0;
        Double media;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            a = scan.nextInt();

            if (a > maior) {
                maior = a;
            }
            soma += a;
            ++i;
        } while (i < 5);

        media = soma / i;

        System.out.println("O maior número é: " + maior);
        System.out.println("A média número é: " + media);

    }
}
