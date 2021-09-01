import java.util.Scanner;
public class Vetores {
    private int[] vetores;
    private Scanner keyboard;

    public void setVetores(int[] vetores) {
        this.vetores = vetores;
    }
    public int[] getVetores() {
        return vetores;
    }

    //Falta implementar
    private int somaDosValores(){
        int soma = 0;
        for (int i = 0; i < vetores.length; i++) {
            soma += vetores[i];
        }
        return soma;
    }

    public void entraValores(){
        keyboard = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int tamanho = keyboard.nextInt();
        vetores = new int[tamanho];

        for (int i = 0; i < vetores.length; i++) {
            System.out.println("Digite o valor da posicao " + i);
            vetores[i] = keyboard.nextInt();
        }
    }

    public void imprimeSoma(){
        int soma = somaDosValores();
        System.out.println("A soma dos valores do vetor é igual a: " + soma);
    }

    public void imprimeVetor(){
        System.out.print("Vetor: [");
        for (int i = 0; i < vetores.length; i++) {
            System.out.print(" " + vetores[i]);
        }
        System.out.print(" ]");
    }
}
