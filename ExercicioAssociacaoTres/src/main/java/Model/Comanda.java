package Model;

import java.util.ArrayList;

/**
 * Método que representa uma comanda.
 *
 * @author Laura Möller
 */
public class Comanda {

    /**
     * Variável de instância que armazena o número da comanda.
     */
    private int numeroComanda;
    /**
     * Variável de instância global que armazena um contador.
     */
    private static int contador = 1;
    /**
     * Variável de instância que armazena os produtos da comanda.
     */
    private ArrayList<ItemComanda> produtosComanda;

    /**
     * Construtor da classe que inicializa a variável de instância que armazena
     * os itens da comanda.
     */
    public Comanda() {
        produtosComanda = new ArrayList<>();
    }

    /**
     * Define o número da comanda conforme o valor do contador para que não
     * hajam comandas de números iguais.
     *
     */
    public void setNumeroComanda() {
        this.numeroComanda = contador;
        this.contador++;
    }

    /**
     * Método que acessa a variável de instância que armazena o número da
     * comanda.
     *
     * @return número da comanda.
     */
    public int getNumeroComanda() {
        return numeroComanda;
    }

    /**
     * Método que acessa os itens da comanda.
     *
     * @return itens da comanda.
     */
    public ArrayList<ItemComanda> getProdutosComanda() {
        return produtosComanda;
    }

    /**
     * Método que adiciona um item na comanda a partir do número do produto.
     *
     * @param numero número do produto.
     * @param quantidade quantidade do produto.
     * @param estoque itens cadastrados no sistema.
     * @throws IllegalArgumentException quando o produto não está cadastrado.
     */
    public void adicionarPorNumero(int numero, int quantidade, ProdutosCadastrados estoque) throws IllegalArgumentException {
        for (Produto p : estoque.getProdutosCadastrados()) {
            if (p.getNumProduto() == numero) {
                ItemComanda novoItem = new ItemComanda(p, quantidade);
                this.produtosComanda.add(novoItem);
                return;
            }
        }
        throw new IllegalArgumentException("Erro: produto com número " + numero + " não encontrado.");
    }

    /**
     * Método que cálcula o valor total da comanda.
     *
     * @return valor da comanda.
     */
    public double calcularTotal() {
        double total = 0;
        for (ItemComanda item : produtosComanda) {
            total += item.getQuantidade() * item.getProduto().getValor();
        }
        return total;
    }

}
