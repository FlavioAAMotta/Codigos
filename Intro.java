import java.util.Scanner;
public class Intro{
   
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double valorSomado = Operacoes.soma(4,2);
        int a = 5;
        double b = 5.9;
        double c = 4.9;
        double d = 3.9;
        double aCast = (double) a;
        int bCast = (int) b;
        int cCast = (int) c;
        int dCast = (int) d;
        System.out.println("int antes do cast: " + a + " int depois do cast: " + aCast);
        System.out.println("soma double antes do cast: " + (b+c+d) + " soma double depois do cast: " + (bCast+cCast+dCast));
        /*
        
        System.out.println("digite algo");
        keyboard.next();
        Pessoa cliente = new Pessoa("caio");
        cliente.sobrenome =" Dias";
        Pessoa clienteDois = new Pessoa("caio");
        clienteDois.sobrenome =" Garcia";

        if(cliente.equals(clienteDois)){
            System.out.println("Nomes iguais");
            System.out.println(cliente);
            System.out.println(clienteDois);
        }else{
            System.out.println("Nomes diferentes");
            System.out.println(cliente);
            System.out.println(clienteDois);
        }

        cliente.setNome("Caio");
        cliente.sobrenome = "Dias";  
        //cliente.altura = 1.14;
        //cliente.peso = 42;

        System.out.println("Flávio");
        System.out.println(5);*/
    }
}