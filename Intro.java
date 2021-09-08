import java.util.Scanner;
public class Intro{
   
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

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
        System.out.println(5);
    }
}