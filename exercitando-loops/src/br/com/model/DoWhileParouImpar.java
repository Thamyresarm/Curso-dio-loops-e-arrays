package br.com.model;

import java.util.Scanner;

public class DoWhileParouImpar {

    public static void main(String[] args) {

        int qtdnumeros;
        int i = 0;
        int numero;
        int qtdpares = 0, qtdimpares = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        qtdnumeros = scan.nextInt();

        do {
            i++;
            System.out.println("Digite o número " + i + ":");
            numero = scan.nextInt();

            if (numero % 2 == 0) qtdpares++;
            else qtdimpares++;

        } while (i < qtdnumeros);
        System.out.println("Total de pares: " + qtdpares);
        System.out.println("Total de impares: " + qtdimpares);
    }
}
