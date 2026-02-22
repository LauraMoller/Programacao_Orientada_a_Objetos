package Model;

/**
 * Classe cujo objeto representa um produto.
 *
 * @author Laura Möller
 */
public class Produto {

    /**
     * Variável de instância que armazena o nome do produto.
     */
    private String nomeProduto;

    /**
     * Variável de instância que armazena o valor do produto.
     */
    private double valor;

    /**
     * Variável de instância que armazena o número do produto.
     */
    private int numProduto;

    /**
     * Variável de instância que armazena o contador global dos produtos.
     */
    private static int contador = 1;

    /**
     * Construtor do método que permite criar um objeto com nome e valor.
     *
     * @param nomeProduto nome do produto.
     * @param valor valor do produto.
     */
    public Produto(String nomeProduto, double valor) {
        setNomeProduto(nomeProduto);
        setValor(valor);
        setNumProduto();
    }

    /**
     * Construtor da classe que permite criar um objeto secundário para realizar
     * uma busca por exemplo, evitando que o contador seja prejudicado.
     *
     * @param nomeProduto nome do produto.
     * @param num número do produto.
     */
    public Produto(String nomeProduto, int num) {
        setNomeProduto(nomeProduto);
        this.numProduto = num;
    }

    /**
     * Construtor da classe que permite definir um número para o produto para
     * realizar uma busca, por exemplo.
     *
     * @param numProduto número do produto.
     */
    public Produto(int numProduto) {
        this.numProduto = numProduto;
    }

    /**
     * Método que acessa a variável de instância que armazena o nome do produto.
     *
     * @param nomeProduto nome do produto.
     * @throws IllegalArgumentException caso o nome informado seja vazio.
     */
    public void setNomeProduto(String nomeProduto) throws IllegalArgumentException {
        if (nomeProduto.isBlank()) {
            throw new IllegalArgumentException("Erro: nome escolhido para o produto é inválido.");
        }

        this.nomeProduto = nomeProduto;
    }

    /**
     * Método que acessa a variável de instância que armazena o nome do produto.
     *
     * @return nome do produto.
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do
     * produto.
     *
     * @param valor valor desejado para o produto.
     */
    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Erro: valor escolhido para o produto é inválido (negativo ou igual a zero).");
        }

        this.valor = valor;
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do
     * produto.
     *
     * @return valor do produto.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método que acessa a variável de instância que armazena o número do
     * produto.
     *
     * @return número do produto.
     */
    public int getNumProduto() {
        return numProduto;
    }

    /**
     * Método que acessa a variável de instância que armazena o número do
     * produto.
     */
    public void setNumProduto() {
        this.numProduto = getContador();
        this.contador++;
    }

    /**
     * Método que acessa a variável de instância que armazena o contador.
     *
     * @return valor atual do contador.
     */
    public int getContador() {
        return contador;
    }
}
