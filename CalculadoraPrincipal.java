public class CalculadoraPrincipal {
    public static void main(String[] args) {
        Calculadora teste = new Calculadora();
        //Método para realizar leitura dos valores desejados para a operação
        teste.capturaInfos();
        //Método para mostrar o calculo dos valores selecionados em capturaInfos.
        teste.mostra();
    }
}
