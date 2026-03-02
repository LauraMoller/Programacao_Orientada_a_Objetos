package Model;

/**
 * Classe que representa uma conta de água.
 *
 * @author Laura Möller
 */
public class ContaAgua implements Pagavel {

    /**
     * Variável de Instância que armazena a quantidade de água gasta para
     * conta.
     */
    private int metrosCubicos;
    /**
     * Variável de instância que armazena o preço do metro cúbico da água.
     */
    private double precoMetroCubico;

    /**
     * Construtor da classe que define o valor do metro cúbico e a quantidade de
     * metros cúbicos.
     *
     * @param metrosCubicos metros cúbicos de água consumidos.
     * @param precoMetroCubico preço por metro cúbico.
     * @throws IllegalArgumentException validações dos setters utilizados.
     */
    public ContaAgua(int metrosCubicos, double precoMetroCubico) throws IllegalArgumentException {
        setMetrosCubicos(metrosCubicos);
        setPrecoMetroCubico(precoMetroCubico);
    }

    /**
     * Método que acessa a variável de instância que armazena a quantidade de
     * metros cúbicos de água.
     *
     * @param metrosCubicos quantidade de metros cúbicos.
     * @throws IllegalArgumentException caso a quantidade de metros cúbicos seja
     * menor ou igual a zero.
     */
    public void setMetrosCubicos(int metrosCubicos) throws IllegalArgumentException {
        if (metrosCubicos <= 0) {
            throw new IllegalArgumentException("Erro: a quantidade de métros cúbicos não pode ser menor ou igual a zero.");
        }
        this.metrosCubicos = metrosCubicos;
    }

    /**
     * Método que acessa a variável de instância que armazena a quantidade de
     * metros cúbicos de água.
     *
     * @return quantidade de metros cúbicos de água.
     */
    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    /**
     * Método que acessa a variável de instância que armazena o preço do metro
     * cúbico de água.
     *
     * @param precoMetroCubico preço do metro cúbico.
     * @throws IllegalArgumentException caso o preço seja um valor negativo.
     */
    public void setPrecoMetroCubico(double precoMetroCubico) throws IllegalArgumentException {
        if (precoMetroCubico < 0) {
            throw new IllegalArgumentException("Erro: o preço do metro cúbico não pode ser negativo.");
        }
        this.precoMetroCubico = precoMetroCubico;
    }

    /**
     * Método implementado da interface Pagavel que calcula o valor a se pegar
     * pela conta.
     *
     * @return valor a pagar.
     */
    @Override
    public double calcularValorPagar() {
        return metrosCubicos * precoMetroCubico;
    }

}
