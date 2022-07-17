package br.com.model;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Integer a;

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número de 1 a 10 para ver a tabuada: ");
        a = scan.nextInt();
        System.out.println("Tabuada de " + a + ": ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + (a * i));
        }

    }
}
