package Model;

/**
 * Classe que representa um investimento do tipo previdência privada.
 *
 * @author Laura Möller
 */
public class PrevidenciaPrivada extends Investimento {

    /**
     * Variável de instância que armazena o valor do investimento.
     */
    private double valor;

    /**
     * Método que realiza um investimento.
     */
    public void investir() {
        setSaldo(getSaldo() + valor);
    }

    /**
     * Método que acessa a variável de instância que contém o valor do
     * investimento.
     *
     * @param valor valor do investimento.
     * @throws IllegalArgumentException caso o valor do investimento seja
     * negativo ou igual a zero.
     */
    public void setValor(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para previdência privada.");
        }
        this.valor = valor;
    }

    /**
     * Método da interface pagável que calcula o valor a pagar pela conta.
     *
     * @return valor a pagar.
     */
    @Override
    public double calcularValorPagar() {
        return valor;
    }

}
