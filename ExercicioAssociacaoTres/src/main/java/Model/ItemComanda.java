package Model;

/**
 * Método intermediário que armazena o item adicionado na comanda e a quantidade.
 * @author Laura Möller
 */
public class ItemComanda {

    /**
     * Variável de instância que mantém o produto adicionado.
     */
    private Produto produto;
    /**
     * Variável de instância que contém a quantidade dos produtos.
     */
    private int quantidade;

    /**
     * Construtor da classe que define que o objeto deve conter um produto e sua quantidade.
     * @param produto produto.
     * @param quantidade quantidade do produto.
     */
    public ItemComanda(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Erro: a quantidade deve ser maior que zero.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Método que acessa o produto.
     * @return produto.
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Método que acessa a quantidade do produto.
     * @return quantido do produto.
     */
    public int getQuantidade() {
        return quantidade;
    }
}
