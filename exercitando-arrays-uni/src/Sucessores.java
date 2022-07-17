import java.util.Random;

public class Sucessores {

    public static void main(String[] args) {

        Random randon = new Random();
        int[] vetor = new int[20];
        int numeroAleatorio = 0;

        for (int i = 0; i < vetor.length; i++) {
            numeroAleatorio = randon.nextInt(100);
            vetor[i] = numeroAleatorio;
        }
        System.out.println("Números Aleatorio: ");
        for (int aleatorio : vetor) {
            System.out.print(aleatorio + " ");
        }
        System.out.println("\nAntecessores: ");
        for (int aleatorio : vetor) {
            System.out.print(aleatorio - 1 + " ");
        }
        System.out.println("\nSucessores: ");
        for (int aleatorio : vetor) {
            System.out.print(aleatorio + 1 + " ");
        }
    }
}
