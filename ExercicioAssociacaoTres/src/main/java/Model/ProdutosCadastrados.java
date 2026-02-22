package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe que faz o papel de armazenar e manipular os produtos cadastrados no
 * sistema.
 *
 * @author Laura Möller
 */
public class ProdutosCadastrados {

    /**
     * Variável de Instância que armazena os produtos cadastrados.
     */
    private ArrayList<Produto> produtosCadastrados;

    /**
     * Construtor da classe que inicializa a variável de instância que contém os
     * produtos cadastrados.
     */
    public ProdutosCadastrados() {
        produtosCadastrados = new ArrayList<>();
    }

    /**
     * Método que cadastra um produto.
     *
     * @param p produto que deseja cadastrar.
     * @throws IllegalArgumentException caso o produto seja nulo ou já esteja
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
     * Método que verifica se um produto está cadastrado com base no nome e/ou
     * número dele.
     *
     * @param p produto que deseja verificar.
     * @return produto, se encontrado, ou nulo.
     * @throws IllegalArgumentException caso o produto informado para procura
     * seja nulo.
     */
    public Produto verificarProdutoCadastrado(Produto p) throws IllegalArgumentException {
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
     * Método que remove um produto cadastrado.
     *
     * @param p produto que deseja remover.
     * @throws IllegalArgumentException caso o produto não esteja sequer
     * cadastrado.
     */
    public void removerProduto(Produto p) throws IllegalArgumentException {
        Produto produtoEhCadastrado = verificarProdutoCadastrado(p);
        if (produtoEhCadastrado == null) {
            throw new IllegalArgumentException("Erro: não é possível apagar um produto não cadastrado.");
        }
        this.produtosCadastrados.remove(produtoEhCadastrado);
    }

    /**
     * Método para alterar o valor unitário de um produto cadastrado.
     *
     * @param p produto informado.
     * @throws IllegalArgumentException caso o produto não esteja cadastrado ou
     * nenhum valor novo seja informado.
     */
    public void alterarValorDeProduto(Produto p) throws IllegalArgumentException {
        Produto produtoEhCadastrado = verificarProdutoCadastrado(p);
        if (produtoEhCadastrado == null) {
            throw new IllegalArgumentException("Erro: não é possível alterar o valor de um produto não cadastrado.");
        }
        String valorInformado = JOptionPane.showInputDialog(
                null,
                "Digite o novo valor para o produto:",
                "Alterar Valor",
                JOptionPane.QUESTION_MESSAGE
        );
        if (valorInformado.isBlank()) {
            throw new IllegalArgumentException("Erro: é preciso informar um valor novo.");

        }

        double valorNovo = Double.parseDouble(valorInformado);
        produtoEhCadastrado.setValor(valorNovo);
    }

    /**
     * Método para alterar o nome de um produto já cadastrado.
     *
     * @param p produto informado.
     * @throws IllegalArgumentException Caso o produto informado não esteja
     * cadastrado.
     */
    public void alterarNomeDeProduto(Produto p) throws IllegalArgumentException {
        Produto produtoEhCadastrado = verificarProdutoCadastrado(p);
        if (produtoEhCadastrado == null) {
            throw new IllegalArgumentException("Erro: não é possível alterar o nome de um produto não cadastrado.");
        }
        String nomeNovo = JOptionPane.showInputDialog(
                null,
                "Digite o novo nome para o produto:",
                "Alterar nome",
                JOptionPane.QUESTION_MESSAGE
        );
        produtoEhCadastrado.setNomeProduto(nomeNovo);
    }

    /**
     * Método que acessa a variável de instância que armazena os produtos
     * cadastrados.
     *
     * @return ArrayList com todos os produtos cadastrados.
     */
    public ArrayList<Produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }
}
