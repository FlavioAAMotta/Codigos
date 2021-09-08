public class CalculadoraPrincipal {
    public static void main(String[] args) {
        Calculadora teste = new Calculadora();
        //Método para realizar leitura dos valores desejados para a operação
        teste.setValorA("Cinco");
        teste.setOp('+');
        teste.setValorB(7);
        //Método para mostrar o calculo dos valores selecionados em capturaInfos.
        teste.mostra();
        teste.setValorA(32);
        teste.mostra();
        teste.setValorA(15,12);
        teste.mostra();
    }
}
