public class Principal {
    public static void main(String[] args) {
        Quadrado teste = new Quadrado(5);
        System.out.print("A área do " + teste.getNomeFigura());
        System.out.println(" é: " + teste.getArea());
        System.out.print("E o perímetro do " + teste.getNomeFigura());
        System.out.print(" é: " + teste.getPerimetro());
    }
}
