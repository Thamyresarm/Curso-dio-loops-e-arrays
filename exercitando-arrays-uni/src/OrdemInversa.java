import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {

        int tamanho;
        int i = 0;
        int qtdconsoantes = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu vetor: ");
        tamanho = scan.nextInt();
        Integer[] vetor = new Integer[tamanho];

        do {
            System.out.println("Digite o elemento da " + (i + 1) + "º do vetor: ");
            vetor[i] = scan.nextInt();
            i++;

        } while (i < tamanho);

        System.out.println("Seu vetor: ");
        for (i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nVetor invertido: ");

        i = vetor.length - 1;
        while (i >= 0) {
            System.out.print(vetor[i] + " ");
            i--;
        }
    }

}