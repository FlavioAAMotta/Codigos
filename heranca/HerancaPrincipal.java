package heranca;

public class HerancaPrincipal {
    public static void main(String[] args) {
        Paciente hospitalizado = new Paciente();
        Medico anestesista = new Medico();
        hospitalizado.nome = "Flávio";
        anestesista.imprimeDados();
        hospitalizado.imprimeDados();   
        int numero = 4;
        double a = numero;
    }
}
