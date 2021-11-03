public class Triangulo implements IFiguraGeometrica {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int base;
    private int altura;

    public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC){
        this.altura = altura;
        this.base = base;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public String getNomeFigura() {
        return "Triangulo";
    }

    @Override
    public int getArea(){
        int area = (base*altura)/2;
        return area;
    }

    @Override
    public int getPerimetro(){
        int perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
}
