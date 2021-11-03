package revisao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Revisao {
    public static ArrayList<String> lerAlunos(){
        Scanner in = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        int opcao = -1;
        while(opcao == -1){
            System.out.println("Digite o nome do aluno, digite 0 para encerrar");
            String digitado = in.nextLine();
            if(digitado.equals("0")){
                opcao = 0;
                continue;
            }
            alunos.add(digitado);
        }
        in.close();
        return alunos;
    }

    /*public static void verificarTamanhos(int tamanho){

    }*/

    public static void definirPerguntas(ArrayList<String> alunos, String disciplina){
        int tamanho = alunos.size();
        Perguntas perguntas = new Perguntas(disciplina);
        if(tamanho > 18){
            int excedente = tamanho - 18;
            System.out.println("Teremos " + tamanho + " alunos para 18 perguntas");
            Random aleatorio = new Random();
            for (int i = 0; i < excedente; i++) {
                int sorteadoDuplaUm = aleatorio.nextInt(alunos.size());
                int sorteadoDuplaDois = aleatorio.nextInt(alunos.size());
                while (sorteadoDuplaDois == sorteadoDuplaUm) {
                    sorteadoDuplaDois = aleatorio.nextInt(alunos.size());
                }    
                String alunoUm = alunos.get(sorteadoDuplaUm);
                String alunoDois = alunos.get(sorteadoDuplaDois);
                if(sorteadoDuplaUm > sorteadoDuplaDois){
                    alunos.remove(sorteadoDuplaUm);
                    alunos.remove(sorteadoDuplaDois);
                }else{
                    alunos.remove(sorteadoDuplaDois);
                    alunos.remove(sorteadoDuplaUm);
                }
                String novaPergunta = perguntas.getPergunta(alunos.size());
                System.out.println(alunoUm + " e " + alunoDois + ": "+ novaPergunta);
            }
            for (int i = 0; i < alunos.size(); i++){
                String novaPergunta = perguntas.getPergunta(alunos.size());
                System.out.println(alunos.get(i) + ": " + novaPergunta);
            }
        }else{
            for (int i = 0; i < tamanho; i++){
                String novaPergunta = perguntas.getPergunta(alunos.size());
                System.out.println(alunos.get(i) + ": " + novaPergunta);
            }

        }
    }

    public static String getDisciplina(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a disciplina?");
        System.out.println("1 - PHP");
        System.out.println("2 - OO");
        String opt = teclado.nextLine();
        return opt;
    }

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        String disciplina = getDisciplina();
        alunos = lerAlunos();    
        definirPerguntas(alunos, disciplina);
    }
}
