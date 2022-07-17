import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {
        int tamanho;
        int i = 0;
        int qtdconsoantes = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu vetor: ");
        tamanho = scan.nextInt();
        String[] vetor = new String[tamanho];
        String[] consoantes = new String[tamanho];

        do {
            System.out.println("Digite o elemento da " + (i + 1) + "º do vetor: ");
            vetor[i] = scan.next();
            i++;
        } while (i < tamanho);

        System.out.println("Seu vetor Original: ");
        for (i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        i = 0;
        do {
            if (!(vetor[i].equalsIgnoreCase("a") |
                    vetor[i].equalsIgnoreCase("e") |
                    vetor[i].equalsIgnoreCase("i") |
                    vetor[i].equalsIgnoreCase("o") |
                    vetor[i].equalsIgnoreCase("u"))) {
                consoantes[qtdconsoantes] = vetor[i];
                qtdconsoantes++;
            }
            i++;
        } while (i < consoantes.length);

        System.out.print("\nVocê digitou " + qtdconsoantes + " consoantes. Seu vetor de consoantes: ");

        for (i = 0; i < qtdconsoantes; i++) {
            System.out.print(consoantes[i] + " ");
        }

    /*    for (String consoante : consoantes) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }

     */
    }
}
