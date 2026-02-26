package Model;

/**
 * Classe que representa uma extensão da conta padrão.
 *
 * @author Laura Möller
 */
public class ContaEspecial extends ContaBancaria {

    /**
     * Variável de Instância que armazena o limite de crédito atribuido ao
     * titular da conta.
     */
    private double limiteCredito;

    /**
     * Construtor da classe que herda itens de ContaBancaria e também define o
     * limite de crédito.
     *
     * @param numero número da conta.
     * @param saldo saldo da conta.
     * @param titular titular da conta.
     * @param limiteCredito limite de crédtio do titular.
     * @throws IllegalArgumentException conforme as validações realizadas nos
     * setter utilizados.
     */
    public ContaEspecial(String numero, double saldo, Cliente titular, double limiteCredito) throws IllegalArgumentException {
        super(numero, saldo, titular);
        setLimiteCredito(limiteCredito);
    }

    /**
     * Método que acessa a variável de instância que armazena o limite de
     * crédito.
     *
     * @return limite de crédito.
     */
    public double getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * Método que acessa a variável de instância que armazena o limite de
     * crédito.
     *
     * @param limiteCredito limite de crédito a ser definido para a conta.
     * @throws IllegalArgumentException caso o limite de crédito informado seja
     * negativo.
     */
    public void setLimiteCredito(double limiteCredito) throws IllegalArgumentException {
        if (limiteCredito < 0) {
            throw new IllegalArgumentException("Erro: limite de crédito inválido.");
        }
        this.limiteCredito = limiteCredito;
    }

    /**
     * Método que sobrescreve o método sacar original para que seja possível
     * sacar com o limite do saldo combinado com o limite de crédito.
     *
     * @param valor valor do saque.
     * @throws IllegalArgumentException caso o valor do saque seja inválido ou
     * saldo insuficiente.
     */
    @Override
    public void sacar(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: não é possível fazer um saque negativo.");
        }
        if (getSaldo() + limiteCredito < valor) {
            throw new IllegalArgumentException("Erro: saldo insuficiente para saque.");
        }
        setSaldo(getSaldo() - valor);
    }
}
