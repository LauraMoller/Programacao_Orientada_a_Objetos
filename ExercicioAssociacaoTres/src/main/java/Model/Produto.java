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
     * Variável de instância que armazena o valor unitário do produto.
     */
    private double valor;
    /**
     * Variável de instância que armazena o número do produto.
     */
    private int numProduto;
    /**
     * Variável de instância que armazena um contador global que serve para
     * gerar números sequênciais para a variável numProduto (número do produto).
     */
    private static int contador = 1;

    /**
     * Construtor da classe que define um objeto com nome e valor.
     *
     * @param nomeProduto nome do produto.
     * @param valor valor unitário do produto.
     */
    public Produto(String nomeProduto, double valor) {
        setNomeProduto(nomeProduto);
        setValor(valor);
        setNumProduto();
    }

    /**
     * Método que define o valor da variável nomeProduto (nome do produto).
     *
     * @param nomeProduto nome do produto.
     * @throws IllegalArgumentException quando o nome do produto informado está
     * em branco.
     */
    public void setNomeProduto(String nomeProduto) throws IllegalArgumentException {
        if (nomeProduto.isBlank()) {
            throw new IllegalArgumentException("Erro: nome escolhido para o produto é inválido.");
        }

        this.nomeProduto = nomeProduto;
    }

    /**
     * Método que acessa a variável de instância nomeProduto.
     *
     * @return nome do produto.
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Método que define o valor da variável de instância valor.
     *
     * @param valor valor unitário do produto.
     */
    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: valor escolhido para o produto é inválido (negativo ou igual a zero).");
        }

        this.valor = valor;
    }

    /**
     * Método que acessa a variável de instância valor.
     *
     * @return valor unitário do produto.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método que acessa a variável de instância numProduto.
     *
     * @return número de registro do produto.
     */
    public int getNumProduto() {
        return numProduto;
    }

    /**
     * Método que define o valor do númerdo do produto com base no contadore e
     * também atualizando o contador.
     */
    public void setNumProduto() {
        this.numProduto = getContador();
        this.contador++;
    }

    /**
     * Método que acessa a variável contador.
     *
     * @return contador.
     */
    public int getContador() {
        return contador;
    }
}
