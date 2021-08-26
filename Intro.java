import java.util.Scanner;
public class Intro{
   
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        Pessoa cliente = new Pessoa("caio");
        
        cliente.setNome("Caio");
        cliente.sobrenome = "Dias";  
        //cliente.altura = 1.14;
        //cliente.peso = 42;

        System.out.println(cliente.getNome());
        System.out.println(cliente.nome);
    }
}