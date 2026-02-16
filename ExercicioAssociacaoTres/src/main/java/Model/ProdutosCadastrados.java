package Model;

import java.util.ArrayList;

/**
 * Classe que faz o papel de armazenar e manipular os produtos cadastrados no
 * sistema.
 *
 * @author Laura Möller
 */
public class ProdutosCadastrados {

    /**
     * Variável de instância que armazena os produtos cadastrados.
     */
    private ArrayList<Produto> produtosCadastrados;

    /**
     * Construtor da classe que inicializa a variável de instância
     * produtosCadastrados.
     */
    public ProdutosCadastrados() {
        produtosCadastrados = new ArrayList<>();
    }

    /**
     * Método que cadastra produtos.
     *
     * @param p produto que deseja cadastrar.
     * @throws IllegalArgumentException quando o produto é nulo ou já está
     * cadastrado.
     */
    public void adicionarProduto(Produto p) throws IllegalArgumentException {
        if (p == null) {
            throw new IllegalArgumentException("Erro: não é possível cadastrar o produto, pois é nulo.");
        }
        Produto produtoEhCadastrado = verificarProdutoCadastrado(p);
        if (produtoEhCadastrado != null) {
            throw new IllegalArgumentException("Erro: produto já cadastrado no invetário.");
        }
        produtosCadastrados.add(p);
    }

    /**
     * Método que verifica se um produto já está cadastrado.
     *
     * @param p produto que deseja verificar.
     * @return produto se foi encontrado ou nulo caso não seja encontrado.
     * @throws IllegalArgumentException quando o produto que está tentando
     * procurar é nulo.
     */
    private Produto verificarProdutoCadastrado(Produto p) throws IllegalArgumentException {
        if (p == null) {
            throw new IllegalArgumentException("Erro: não é possível verificar um produto nulo.");
        }
        for (Produto prod : produtosCadastrados) {
            if ((prod.getNomeProduto().equals(p.getNomeProduto()) || (prod.getNumProduto() == p.getNumProduto()))) {
                return prod;
            }
        }
        return null;
    }

    /**
     * Método que apaga um produto cadastrado.
     *
     * @param p produto que deseja remover.
     * @throws IllegalArgumentException quando o produto que deseja apagar não
     * está cadastrado.
     */
    public void removerProduto(Produto p) throws IllegalArgumentException {
        Produto produtoEhCadastrado = verificarProdutoCadastrado(p);
        if (produtoEhCadastrado == null) {
            throw new IllegalArgumentException("Erro: não é possível apagar um produto não cadastrado.");
        }
        this.produtosCadastrados.remove(produtoEhCadastrado);
    }

    /**
     * Método que altera o valor de um produto já cadastrado.
     *
     * @param p produto que deseja alterar o valor.
     * @param valor valor novo.
     * @throws IllegalArgumentException quando o produto não está cadastrado.
     */
    public void alterarValorDeProduto(Produto p, double valor) throws IllegalArgumentException {
        Produto produtoEhCadastrado = verificarProdutoCadastrado(p);
        if (produtoEhCadastrado == null) {
            throw new IllegalArgumentException("Erro: não é possível alterar o valor de um produto não cadastrado.");
        }
        produtoEhCadastrado.setValor(valor);
    }

    /**
     * Método que altera o nome de um produto cadastrado.
     *
     * @param p produto que deseja alterar o nome.
     * @param nomeNovo novo nome.
     * @throws IllegalArgumentException quando o produto não está cadastrado.
     */
    public void alterarNomeDeProduto(Produto p, String nomeNovo) throws IllegalArgumentException {
        Produto produtoEhCadastrado = verificarProdutoCadastrado(p);
        if (produtoEhCadastrado == null) {
            throw new IllegalArgumentException("Erro: não é possível alterar o nome de um produto não cadastrado.");
        }
        produtoEhCadastrado.setNomeProduto(nomeNovo);
    }

    /**
     * Método que acessa os produtos cadastrados.
     *
     * @return produtos cadastrados.
     */
    public ArrayList<Produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }
}
