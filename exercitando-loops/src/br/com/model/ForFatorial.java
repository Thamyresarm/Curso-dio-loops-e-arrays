package br.com.model;

import java.util.Scanner;

public class ForFatorial {
    public static void main(String[] args) {
        int a;
        int fatorial = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para exibir o fatorial: ");
        a = scan.nextInt();

        for (int i = a; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("O resultado de " + a + "! é " + fatorial);
    }
}
