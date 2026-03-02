package Model;

/**
 * Classe que representa uma conta de mensalidade de ensino.
 *
 * @author Laura Möller
 */
public class MensalidadeEnsino implements Pagavel {

    /**
     * Vairável de instância que armazena o número de créditos cobrados na
     * conta.
     */
    private int nrCreditos;
    /**
     * Variável de Instância que o preço do crédito.
     */
    private double precoCredito;

    /**
     * Construtor da classe que define a necessidade de um preço de crétido e
     * uma quantidade de crédtios consumidos/utilizados.
     *
     * @param nrCreditos número de créditos.
     * @param precoCredito preço de créditos.
     * @throws IllegalArgumentException validações dos setters utilizados.
     */
    public MensalidadeEnsino(int nrCreditos, double precoCredito) throws IllegalArgumentException {
        setNrCreditos(nrCreditos);
        setPrecoCredito(precoCredito);
    }

    /**
     * Método que acessa a variável de instância que armazena a quantidade de
     * créditos consumidos.
     *
     * @return quantidade de crédtios.
     */
    public int getNrCreditos() {
        return nrCreditos;
    }

    /**
     * Método que acessa a variável de instância que armazena a quantidade de
     * créditos consumidos.
     *
     * @param nrCreditos número de créditos que deseja atribuir a conta.
     * @throws IllegalArgumentException caso o número de créditos seja negativo.
     */
    public void setNrCreditos(int nrCreditos) throws IllegalArgumentException {
        if (nrCreditos < 0) {
            throw new IllegalArgumentException("Erro: quantidade de créditos inválida.");
        }
        this.nrCreditos = nrCreditos;
    }

    /**
     * Método que acessa a variável de instância que armazena o preço do
     * crédito.
     *
     * @return preço do crédito.
     */
    public double getPrecoCredito() {
        return precoCredito;
    }

    /**
     * Método que acessa a variável de instância que armazena o preço do
     * crédito.
     *
     * @param precoCredito preço de crédito desejado.
     * @throws IllegalArgumentException caso o preço seja menor ou igual a zero.
     */
    public void setPrecoCredito(double precoCredito) throws IllegalArgumentException {
        if (precoCredito <= 0) {
            throw new IllegalArgumentException("Erro: preço do crédito é inválido.");
        }
        this.precoCredito = precoCredito;
    }

    /**
     * Método implementado da interface Pagavel que retorna o valor da conta.
     *
     * @return valor a pagar.
     */
    @Override
    public double calcularValorPagar() {
        return nrCreditos * precoCredito;
    }

}
