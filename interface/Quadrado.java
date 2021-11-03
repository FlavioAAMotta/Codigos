public class Quadrado implements IFiguraGeometrica{
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public int getArea(){
        int area = lado * lado;
        return area;
    }

    @Override
    public int getPerimetro(){
        int perimetro = lado * 4;
        return perimetro;
    }
}
