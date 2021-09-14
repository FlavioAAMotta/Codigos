package heranca;
import java.util.Date;
public class Paciente extends Pessoa{
    Date dataInternacao;
    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.sexo);
        System.out.println(this.RG);
        System.out.println(this.dataInternacao);
    }
}
