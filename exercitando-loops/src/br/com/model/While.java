package br.com.model;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        String nome;
        Integer idade;
        Integer nota;
        Integer fim;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do aluno ou 0 para finalizar: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Digite a idade do aluno ou 0 para finalizar:: ");
            idade = scan.nextInt();
            if (idade == 0)
                break;

            System.out.println("Digite a nota do aluno (de 0 a 10): ");
            nota = scan.nextInt();

            while (nota > 10 || nota < 0){
                    System.out.println("Nota inválida, digite uma nota válida: ");
                    nota = scan.nextInt();
            }
            System.out.println(nome + " tem " + idade + " anos e sua Nota foi " + nota);
        }


    }

}
