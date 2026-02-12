public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular) throws IllegalArgumentException {
        setNumero(numero);
        setTitular(titular);
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para depósito: valor negativo ou igual a 0.");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para saque: valor negativo ou igual a 0.");
        }
        if ((getSaldo() - valor) < 0) {
            throw new IllegalArgumentException("Erro: valor inválido para saque: o valor é maior do que o saldo disponível.");
        }
        saldo -= valor;
    }

    public void transferir(ContaBancaria contaDestino, double valor) throws IllegalArgumentException {
        if (contaDestino == null) {
            throw new IllegalArgumentException("Erro: conta destino inválida.");
        }
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) throws IllegalArgumentException {
        if (numero.isBlank()) {
            throw new IllegalArgumentException("Erro: numero inválido: o número está em branco.");
        }
        this.numero = numero;
    }

    public void setTitular(String titular) throws IllegalArgumentException {
        if (titular.isBlank()) {
            throw new IllegalArgumentException("Erro: titular inválido: o titular está em branco.");
        }
        this.titular = titular;
    }

}
