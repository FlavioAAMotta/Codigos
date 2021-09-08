import java.util.Scanner;
public class Calculadora{
    private int valorA;
    private int valorB;
    private char op;
    private Scanner keyboard;

    public int getValorA(){
        return valorA;
    }
    public int getValorB(){
        return valorB;
    }
    public char getOp(){
        return op;
    }
    public void setValorA(int valorA){
        this.valorA = valorA;
    }

    public void setValorA(int valorA, int valorDois){
        this.valorA = valorA + valorDois;
    }

    public void setValorA(String valorA){
        if(valorA.equals("Cinco")){
            this.valorA = 5;    
        }
        else {
            this.valorA = 0;
        }
    }

    public void setValorB(int valorB){
        this.valorB = valorB;
    }
    public void setOp(char op){
        this.op = op;
    }

    private int soma(){
        return this.valorA + this.valorB;
    }
    private int multiplicacao(){
        int retorno = 0;
        for (int i = 0; i < valorA; i++) {
            retorno += valorB;
        }
        return retorno;
    }
    private int subtracao(){
        return this.valorA - this.valorB;
    }
    private double divisao(){
        return this.valorA / this.valorB;
    }
    private boolean testarValor(int valorX){
        if(valorX < -50 || valorX > 50){
            return false;
        }else{
            return true;
        }
    }

    private boolean testeOperador(char sinal){
        if(sinal == '+') return true;
        if(sinal == '*') return true;
        if(sinal == '-') return true;
        if(sinal == '/') return true;
        return false;
    }

    public void mostra(){
        System.out.println(valorA + " " + op + " " + valorB + " = " + calcula());
    }

    private double calcula(){
        if(op == '+')return soma();
        else if(op== '-') return subtracao();
        else if(op== '*') return multiplicacao();
        else if(op== '/' && valorB != 0) return divisao();
        else{
            System.out.println("Não é possível dividir por 0!");
            return 0;
        }
    }

    public void capturaInfos(){
        keyboard = new Scanner(System.in);
        valorA = -51;
        valorB = -51;
        op = 'a';
        while(!testarValor(valorA)){
            System.out.println("Digite o primeiro valor: ");
            valorA = keyboard.nextInt();
        }

        while(!testeOperador(op)){
            System.out.println("Digite a operacao: ");
            op = keyboard.next().charAt(0);
        }
        
        while(!testarValor(valorB)){
            System.out.println("Digite o segundo valor: ");
            valorB = keyboard.nextInt();
        }        
    }
}