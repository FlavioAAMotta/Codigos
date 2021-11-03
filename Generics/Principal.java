public class Principal {
    
    public static void main(String[] args) {
        MeuTipo<Integer> numInt = new MeuTipo<>(5);
        MeuTipo<Double> numDbl = new MeuTipo<>(-5.0);
        //MeuTipo<Double> numDouble = new MeuTipo<>(5.5);

        System.out.println(numInt.absEqual(numDbl));
        //numDouble.mostrarTipo();
    }
}
