package Model;

import java.util.ArrayList;

/**
 * Classe que representa uma comanda.
 *
 * @author Laura Möller
 */
public class Comanda {

    /**
     * Variável de Instância que armazena o número da comanda.
     */
    private int numeroComanda;

    /**
     * Variável de Instância que armazena o contador global das comandas.
     */
    private static int contador = 1;

    /**
     * Variável de Instância que armazena os produtos do objeto comanda.
     */
    private ArrayList<ItemComanda> produtosComanda;

    /**
     * Construtor da classe que inicializa a variável de instância que armazena
     * os produtos da comanda.
     */
    public Comanda() {
        produtosComanda = new ArrayList<>();
    }

    /**
     * Método que define o número da comanda com base no contador global. Além
     * disso, também atualiza o contador.
     */
    public void setNumeroComanda() {
        this.numeroComanda = contador;
        this.contador++;
    }

    /**
     * Método que acessa a variável de intstância que armazena o número da
     * comanda.
     *
     * @return número da comanda.
     */
    public int getNumeroComanda() {
        return numeroComanda;
    }

    /**
     * Método que acessa a variável de instância que armazena os produtos da
     * comanda.
     *
     * @return ArrayList com todos os produtos da comanda.
     */
    public ArrayList<ItemComanda> getProdutosComanda() {
        return produtosComanda;
    }

    /**
     * Método que adiciona um produto a comanda pelo número do produto.
     *
     * @param numero número do produto.
     * @param quantidade quantidade desejada do produto.
     * @param estoque produtos cadastrados.
     * @throws IllegalArgumentException caso tente adicionar um produto não
     * cadastrado.
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
     * Método que calcula o valor total da comanda até o momento.
     *
     * @return valor da comanda.
     */
    public double calcularTotal() {
        double total = 0;
        for (ItemComanda item : produtosComanda) {
            if (item.getProduto() != null) {
                total += item.getQuantidade() * item.getProduto().getValor();
            }
        }
        return total;
    }

    /**
     * Método que lista os itens da comanda.
     *
     * @return itens da comanda e o valor total.
     */
    public String listaDeProdutos() throws IllegalArgumentException {
        if (getProdutosComanda() == null) {
            return ("Não há produto na comanda");
        }

        String lista = "";
        for (ItemComanda item : produtosComanda) {
            lista += "- " + item.getProduto().getNomeProduto() + " - quantidade: " + item.getQuantidade();
            lista += "\n";
        }

        lista += "Total da Comanda = " + calcularTotal();
        return lista;
    }

}
