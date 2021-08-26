import java.util.Random;
public class PortaDosDesesperados{
    boolean[] portas;

    PortaDosDesesperados(){
        portas = new boolean[3];
        portas[0] = true;
        portas[1] = false;
        portas[2] = false;
    }

    public boolean semTroca(){
        Random gerador = new Random();
        int escolha = Math.abs(gerador.nextInt() % 3);
        return portas[escolha];
    }

    public boolean comTroca(){
        Random gerador = new Random();
        int escolha = Math.abs(gerador.nextInt() % 3);
        int novaEscolha = -1;
        boolean gorilaSetado = false;
        for (int i = 0; i < portas.length; i++) {
            if(i != escolha && portas[i] == false && !gorilaSetado) {
                gorilaSetado = true;
            }
            else if(i != escolha){
                novaEscolha = i;
            }
        }
        return portas[novaEscolha];
    }
}