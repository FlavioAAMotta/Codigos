package Aulas;

import java.util.Date;

public class RelatorioCliente{
    //...
    Cabecalho cabecalho;
    public byte[] pedidosCliente(String cpfCliente, String nomeCliente,
    String nomeUsuarioLogado, String matriculaUsuarioLogado, 
    Date dataInicial, Date dataFinal, String tipoRelatorio) {
    //Verificando o tipo de relatório
        if ("ANALITICO".equals(tipoRelatorio)) {
            this.cabecalho.setTitulo("Pedidos Cliente");
            this.cabecalho.setTipo("Analitico");
            this.cabecalho.setDataInicial(dataInicial);
            this.cabecalho.setDataFinal(dataFinal);
            this.cabecalho.setNomeCliente(nomeCliente);
            this.cabecalho.setCpfCliente(cpfCliente);
            Pedido[] pedidos = bancoDeDados.pesquisarPedidos(cpfCliente, dataInicial, dataFinal);
            for(int i = 0; i < pedidos.length; i++) {
                Pedido pedido = pedidos[i];
                this.conteudoAnalitico.setNomeProduto(pedido.getPotuto().getNome());
                this.conteudoAnalitico.setValorProduto(pedido.getProduto().getPreco());
            }
            double valorTotalPedidos = 0;
            for(int i = 0; i < pedidos.length; i++) {
                Produto produto = pedidos[i].getProduto();
                valorTotalPedidos = valorTotalPedidos + produto.getPreco();
            }
            this.resumo.setValorTotalPedidos(valorTotalPedidos);
            this.resumo.setTotalPedidos(produtos.length);
            this.rodape.setDataGeracao(new Date());
            this.rodape.setUsuarioImpressao(nomeUsuarioLogado);
            this.rodape.setMatriculaImpressao(matriculaUsuarioLogado);
            GeradorPDF geradorPDF = new GeradorPDF();
            return geradorPDF.gerarRelatorio(this.cabecalho, 
            this.conteudoAnalitico, this.resumo, this.rodape);
        } else if ("QUANTITATIVO".equals(tipoRelatorio)) {
            this.cabecalho.setTitulo("Pedidos Cliente");
            this.cabecalho.setTipo("Quantidativo");
            this.cabecalho.setDataInicial(dataInicial);
            this.cabecalho.setDataFinal(dataFinal);
            this.cabecalho.setNomeCliente(nomeCliente);
            this.cabecalho.setCpfCliente(cpfCliente);
            Pedido[] pedidos = bancoDeDados.pesquisarPedidos(cpfCliente);
            for(int i = 0; i < produtos.length; i++) {
                Produto produto = produtos[i];
                this.conteudoQuantitativo.setMes(pedido.getMes());
                this.conteudoQuantitativo.setQuantidadeComprada(pedido.getProduto().getQuantidade());
            }
            double valorTotalPedidos = 0;
            for(int i = 0; i < pedidos.length; i++) {
                Produto produto = pedidos[i].getProduto();
                valorTotalPedidos = valorTotalPedidos + produto.getPreco();
            }
            this.resumo.setValorTotalPedidos(valorTotalPedidos);
            this.resumo.setTotalPedidos(produtos.length);
            this.rodape.setDataGeracao(new Date());
            this.rodape.setUsuarioImpressao(nomeUsuarioLogado);
            this.rodape.setMatriculaImpressao(matriculaUsuarioLogado);
            GeradorPDF geradorPDF = new GeradorPDF();
            return geradorPDF.gerarRelatorio(this.cabecalho, this.conteudoQuantitativo, this.resumo, this.rodape);
        }
}
//...
}