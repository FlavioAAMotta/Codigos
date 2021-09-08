public class CalculadoraPrincipal {
    public static void main(String[] args) {
        Calculadora teste = new Calculadora();
        Calculadora teste2 = new Calculadora();
        Calculadora teste3 = new Calculadora();
        //Método para realizar leitura dos valores desejados para a operação
        teste.capturaInfos();
        teste2.capturaInfos();
        teste3.capturaInfos();

        //Método para mostrar o calculo dos valores selecionados em capturaInfos.
        teste.mostra();
        teste2.mostra();
        teste3.mostra();
    }
}
