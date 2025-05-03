package Map.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.PrimitiveIterator;

public class Estoqueprodutos {
    // atributo

    private Map<Long, Produto> estoqueProdutosMap;

    public Estoqueprodutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adiconarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod,new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (! estoqueProdutosMap.isEmpty()){

            for (Produto p: estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        Estoqueprodutos estoque = new Estoqueprodutos();
        estoque.exibirProduto();

        estoque.adiconarProduto(1L, "Produto A", 10, 5.0);
        estoque.adiconarProduto(2L, "Produto B", 5, 10.0);
        estoque.adiconarProduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProduto();

        System.out.println("Valor Total de estooque:  R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais barato " + estoque.obterProdutoMaisCaro());


    }
}
