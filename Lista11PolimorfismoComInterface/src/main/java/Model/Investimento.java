package Model;

/**
 * Classe abstrata que define um investimento.
 *
 * @author Laura Möller
 */
public abstract class Investimento implements Pagavel {

    /**
     * Variável de instância que armazena o saldo do investimento.
     */
    private double saldo = 0;

    /**
     * Método que acessa a variável de instância que contém o saldo do
     * investimento.
     *
     * @return saldo do investimento.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que acessa a variável de instância que contém o saldo do
     * investimento.
     *
     * @param saldo saldo desejado.
     */
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
