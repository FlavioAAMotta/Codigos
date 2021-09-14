package heranca;

public class Medico extends Funcionario{
    String CRM;
    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.RG);
        System.out.println(this.sexo);
        System.out.println(this.CRM);
        System.out.println(this.dataAdmissao);
    }

    public void operar(){

    }
}
