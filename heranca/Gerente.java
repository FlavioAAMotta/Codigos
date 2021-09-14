package heranca;

public class Gerente extends Funcionario{
    String CRA;
    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.RG);
        System.out.println(this.sexo);
        System.out.println(this.CRA);
        System.out.println(this.dataAdmissao);
    }
    public void liberarPagamento(){

    }
}
