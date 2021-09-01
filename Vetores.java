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

    //Metodo para realizar a soma de todos os valores do vetor
    private int somaDosValores(){
        int soma = 0;
        for (int i = 0; i < vetores.length; i++) {
            soma += vetores[i];
        }
        return soma;
    }

    //Metodo que lê o tamanho desejado e os valores do vetor
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

    //Método para imprimir a soma dos valores do vetor
    public void imprimeSoma(){
        int soma = somaDosValores();
        System.out.println("A soma dos valores do vetor é igual a: " + soma);
    }

    //Método que imprime os valores setados no vetor
    public void imprimeVetor(){
        System.out.print("Vetor: [");
        for (int i = 0; i < vetores.length; i++) {
            System.out.print(" " + vetores[i]);
        }
        System.out.print(" ]");
    }
}
