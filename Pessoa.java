public class Pessoa {
    /*
    ***************TIPOS PRIMITIVOS***************
    Tipos de numeros: int double float long short
    Tipos de caracteres: String char
    Tipos booleanos: boolean
    */
    public String nome;
    public String sobrenome;
    private double altura;
    private double peso;
    private String endereco;
    private double dinheiroNaConta;
    private int estoque;

    public String getNome(){
        return nome;
    }

    public double getAltura(){
        return altura;
    }

    public void setNome(String nome){
        System.out.println("nome do parametro: " + nome);
        System.out.println("nome da classe: " + this.nome);  
        this.nome = nome;
    }
    
    //Metodo construtor
    public Pessoa(String nome){
        this.nome = nome;
    }

    public void imprimeSaldo(){
        System.out.println("Seu saldo atual é de: " + dinheiroNaConta);
        System.out.println("Seu estoque atual é de: " + estoque);
    }

    public void realizarVenda(int valor){
        if(estoque > 0){
            dinheiroNaConta += valor;
            estoque--;
        }else{
            System.out.println("Sem estoque, favor sair para compras");
        }
    }

    public void cadastrarCompra(int valor){
        if(valor > dinheiroNaConta){
            System.out.println("Pare de gastar o que não tem");
        }else{
            dinheiroNaConta -= valor;
            estoque++;
        }
    }

    private double calculaIMC(){
            return peso / (Math.pow(altura, 2));
    }

    @Override
    public String toString(){
        return this.nome + this.sobrenome;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Pessoa){
            Pessoa p = (Pessoa) obj;
            return this.nome.equals(p.getNome());
        }
        return false;
    }
}
