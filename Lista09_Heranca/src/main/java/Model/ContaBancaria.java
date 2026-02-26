package Model;

/**
 * Classe que represent auma conta bancária padrão.
 *
 * @author Laura Möller
 */
public class ContaBancaria {

    /**
     * Variável de instância que armaena o numero da conta.
     */
    private String numero;
    /**
     * Variável de instância que armazena o saldo da conta.
     */
    private double saldo;
    /**
     * Variável de instância que armazena o cliente titular da conta.
     */
    private Cliente titular;

    /**
     * Construtor da classe que define o número, saldo e titular da conta.
     *
     * @param numero número da conta.
     * @param saldo saldo bancário.
     * @param titular titular da conta.
     * @throws IllegalArgumentException conforme as validações dos setters
     * utilizados.
     */
    public ContaBancaria(String numero, double saldo, Cliente titular) throws IllegalArgumentException {
        setNumero(numero);
        setSaldo(saldo);
        setTitular(titular);
    }

    /**
     * Método que acessa a variável de instância que armazena o número da conta.
     *
     * @return número da conta.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método que acessa a variável de instância que armazena o número da conta.
     *
     * @param numero número da conta.
     * @throws IllegalArgumentException caso número esteja em branco.
     */
    public void setNumero(String numero) throws IllegalArgumentException {
        if (numero.isBlank()) {
            throw new IllegalArgumentException("Erro: número da conta bancária em branco.");
        }

        this.numero = numero;
    }

    /**
     * Método que acessa a variável de instância que armazena o titular da
     * conta.
     *
     * @return titular.
     */
    public Cliente getTitular() {
        return titular;
    }

    /**
     * Método que acessa a variável de instância que armazena o titular da
     * conta.
     *
     * @param titular titular da conta.
     * @throws IllegalArgumentException caso não seja informado um titular.
     */
    public void setTitular(Cliente titular) throws IllegalArgumentException {
        if (titular == null) {
            throw new IllegalArgumentException("Erro: titular da conta não informado.");
        }
        this.titular = titular;
    }

    /**
     * Método que acessa a variável de instância que armazena o saldo bancário.
     *
     * @return saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que acessa a variável de instância que armazena o saldo bancário.
     *
     * @param valor valor do saldo.
     */
    protected void setSaldo(double valor) {
        this.saldo = valor;
    }

    /**
     * Método que realiza a ação de depósito bancário.
     *
     * @param valor valor a ser depositado.
     * @throws IllegalArgumentException caso o valor seja menor ou igual zero.
     */
    public void depositar(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: não é possível depositar um valor menor ou igual a zero.");
        }
        setSaldo(getSaldo() + valor);
    }

    /**
     * Método que realiza a ação de saque bancário.
     *
     * @param valor valor que deseja sacar.
     * @throws IllegalArgumentException caso não haja saldo suficiente para
     * saque.
     */
    public void sacar(double valor) throws IllegalArgumentException {
        if (getSaldo() - valor < 0) {
            throw new IllegalArgumentException("Erro: saldo insuficiente para saque.");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: não é possível fazer um saque negativo.");
        }
        setSaldo(getSaldo() - valor);
    }

    /**
     * Método que realiza a operação de tranferir valores entre contas
     * bancárias.
     *
     * @param contaDestino conta destino da transferência.
     * @param valor valor da tranferência.
     * @throws IllegalArgumentException caso a conta destino não seja informada.
     */
    public void transferir(ContaBancaria contaDestino, double valor) throws IllegalArgumentException {
        if (contaDestino == null) {
            throw new IllegalArgumentException("Erro: conta destino inválida para tranferência.");
        }
        sacar(valor);
        contaDestino.depositar(valor);
    }

}
