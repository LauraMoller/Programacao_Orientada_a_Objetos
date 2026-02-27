package Q2.Model;

/**
 * Classe que representa uma unidade de venda.
 *
 * @author Laura Möller
 */
public class Venda {

    /**
     * Variável de Instância que armazena o valor da venda.
     */
    private double valor;

    /**
     * Cosntrutor que define que a venda possui um valor.
     *
     * @param valor valor da venda.
     * @throws IllegalArgumentException validação do setter.
     */
    public Venda(double valor) throws IllegalArgumentException {
        setValor(valor);
    }

    /**
     * Método que acessa a variável de Instância que contém o valor da venda.
     *
     * @return valor da venda.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método que acessa a variável de Instância que contém o valor da venda.
     *
     * @param valor valor da venda.
     * @throws IllegalArgumentException caso o valor da venda seja menor ou
     * igual a zero.
     */
    public void setValor(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: uma venda não pode custar 0 ou menos reais.");
        }
        this.valor = valor;
    }
}
