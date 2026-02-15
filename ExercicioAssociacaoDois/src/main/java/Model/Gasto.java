/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Model;

import java.time.LocalDate;

/**
 * Método cujo objeto representa o registro de um gasto.
 *
 * @author Laura Möller
 */
public class Gasto {

    /**
     * Variável de instância que armazena com que foi gasto o dinheiro.
     */
    private TipoGasto tipoGasto;
    /**
     * Variável de instância que armazena a data do gasto.
     */
    private LocalDate data;
    /**
     * Variável de instância que armazena o valor do gasto.
     */
    private double valor;
    /**
     * Variável de instância que armazena qual foi a forma de pagamento.
     */
    private TipoPagamento pagamento;

    /**
     * Construtor da classe que diz que todo gasto deve ter o tipo do gasto, a
     * data, o valor e a forma de pagamento.
     *
     * @param tipoGasto com que o dinheiro foi gasto.
     * @param data o dia do gasto.
     * @param valor o valor do gasto.
     * @param pagamento a forma de pagamento.
     * @throws IllegalArgumentException Lança exceção conforme as validações
     * realizadas em cada um dos setters.
     */
    public Gasto(TipoGasto tipoGasto, LocalDate data, double valor, TipoPagamento pagamento) throws IllegalArgumentException {
        setTipoGasto(tipoGasto);
        setData(data);
        setValor(valor);
        setPagamento(pagamento);
    }

    /**
     * Método que define o tipo do gasto.
     *
     * @param tipoGasto tipo do gasto.
     * @throws IllegalArgumentException quando o tipo do gasto está vazio/nulo.
     */
    public void setTipoGasto(TipoGasto tipoGasto) throws IllegalArgumentException {
        if (tipoGasto == null) {
            throw new IllegalArgumentException("Erro: um tipo de gasto deve ser informado.");
        }
        this.tipoGasto = tipoGasto;
    }

    /**
     * Método que define a data do gasto.
     *
     * @param data data.
     * @throws IllegalArgumentException quando a data não é informada ou futura.
     */
    public void setData(LocalDate data) throws IllegalArgumentException {
        if (data == null) {
            throw new IllegalArgumentException("Erro: uma data deve ser informada.");
        }
        if (data.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Erro: a data não pode ser futura.");
        }
        this.data = data;
    }

    /**
     * Método que define o valor do gasto.
     *
     * @param valor valor do gasto.
     * @throws IllegalArgumentException quando o valor informado é negativo.
     */
    public void setValor(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: o valor do gasto deve ser maior que zero.");
        }
        this.valor = valor;
    }

    /**
     * Método que define a forma de pagamento utilizada.
     *
     * @param pagamento forma de pagamento.
     * @throws IllegalArgumentException quando a forma de pagamento é nula.
     */
    public void setPagamento(TipoPagamento pagamento) throws IllegalArgumentException {
        if (pagamento == null) {
            throw new IllegalArgumentException("Erro: um tipo de pagamento deve ser informado.");
        }
        this.pagamento = pagamento;
    }

    /**
     * Método de acesso a variável de instância tipoGasto.
     *
     * @return tipo do gasto.
     */
    public TipoGasto getTipoGasto() {
        return tipoGasto;
    }

    /**
     * Método de acesso a variável de instância data.
     *
     * @return data do gasto.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Método de acesso a variável de instância valor.
     *
     * @return valor do gasto.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método de acesso a variável de instância pagamento.
     *
     * @return forma de pagamento.
     */
    public TipoPagamento getPagamento() {
        return pagamento;
    }
}
