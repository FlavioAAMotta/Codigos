package revisao;

import java.util.Random;

public class Perguntas {
    String[] perguntas;
    boolean[] usados;

    public Perguntas(String disciplina){
        if(disciplina.equals("2")){
            usados = new boolean[18];
            perguntas = new String[18];
            perguntas[0] = "Qual a diferença entre objeto e classe?";
            perguntas[1] = "Porque algumas linguagens não aceitam herança multipla?";
            perguntas[2] = "O que é uma classe abstrata e pra que usamos?";
            perguntas[3] = "Porque usar métodos estáticos?";
            perguntas[4] = "Qual o conceito de herança na orientação a objetos?";
            perguntas[5] = "Qual a importância de um diagrama de classe?";
            perguntas[6] = "Como funcionam gets e sets?";
            perguntas[7] = "Qual a vantagem de sobrescrever o método toString em um objeto?";
            perguntas[8] = "Qual a vantagem de sobrescrever o método equals em um objeto?";
            perguntas[9] = "Qual a importância de requisitos de sistema?";
            perguntas[10] = "Como funciona método construtor?";
            perguntas[11] = "O que é sobrecarga de método?";
            perguntas[12] = "Dê um exemplo de herança em objetos,";
            perguntas[13] = "O que são requisitos funcionais e não funcionais?";
            perguntas[14] = "Defina abstração em orientação a objetos";
            perguntas[15] = "O que é reuso em orientação a objetos?";
            perguntas[16] = "O que é encapsulamento em OO?";
            perguntas[17] = "O que é coesão em OO?";
        }
        else if (disciplina.equals("1")){
            usados = new boolean[9];
            perguntas = new String[9];
            perguntas[0] = "Como funciona o envio de parametros através do form?";
            perguntas[1] = "Qual a diferença entre include, require, include_once, require_once? Quando usar cada um?";
            perguntas[2] = "Como funciona o foreach? Dê um exemplo de uso";
            perguntas[3] = "Detalhe os diferentes tipos de ordenação em PHP (sort, ksort, asort e suas variações)";
            perguntas[4] = "Como funciona explode e implode? Dê um exemplo";
            perguntas[5] = "Dê um exemplo de classe com atributos e métodos em OO";
            perguntas[6] = "Quais são os passos para realizar uma requisição de página web? Como funciona servidor local?";
            perguntas[7] = "Como fuciona os diferentes níveis de acesso (public, private, protected)?";
            perguntas[8] = "Explique as diferentes formas de abrir um arquivo em PHP e dê um exemplo de uso mais vantajoso para cada um";
        }
    }

    public String getPergunta(int numAlunos){
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(numAlunos);
        while(usados[valor]){
            valor = aleatorio.nextInt(numAlunos);
        }
        usados[valor] = true;
        return perguntas[valor];
    }
}
