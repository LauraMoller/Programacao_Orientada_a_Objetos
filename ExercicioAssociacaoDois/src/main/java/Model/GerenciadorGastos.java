/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 * Classe que gerencia os gastos.
 *
 * @author Laura Möller
 */
public class GerenciadorGastos {

    /**
     * Mecanismo que guarda todos os gastos cadastrados.
     */
    private ArrayList<Gasto> gastos;
    /**
     * Variável de Instância que armazena o total gasto com remédios.
     */
    private double gastosComRemedios = 0;
    /**
     * Variável de Instância que armazena o total gasto com roupas.
     */
    private double gastosComRoupas = 0;
    /**
     * Variável de Instância que armazena o total gasto com refeições.
     */
    private double gastosComRefeicoes = 0;
    /**
     * Variável de Instância que armazena o total gasto com outras categorias.
     */
    private double gastosComOutros = 0;
    /**
     * Variável de instância com valor verdadeiro ou falso para validar se já
     * foi cadastrado ao menos um gasto.
     */
    private boolean temGastosCadastrados = false;
    /**
     * Variável de instância com valor verdadeiro ou falso para validar se a
     * somatória dos gastos já foi feita alguma vez.
     */
    private boolean contagemJaFoiFeita = false;
    /**
     * Variável de Instância que armazena o total gasto no cartão.
     */
    private double quantoGastouCartao = 0;
    /**
     * Variável de Instância que armazena o total gasto no cheque.
     */
    private double quantoGastouCheque = 0;
    /**
     * Variável de Instância que armazena o total gasto no dinheiro.
     */
    private double quantoGastouDinheiro = 0;
    /**
     * Variável de Instância que armazena o total gasto no cheque pré.
     */
    private double quantoGastouChequePre = 0;
    /**
     * Variável de Instância que armazena o total gasto no mês.
     */
    private double gastoMes = 0;

    /**
     * Construtor que inicia o mecanismo de armazenamento de gastos (ArrayList).
     */
    public GerenciadorGastos() {
        gastos = new ArrayList<>();
    }

    /**
     * Método responsável por adicionar gastos ao armazenamento.
     *
     * @param gasto gasto que deseja adicionar.
     * @throws IllegalArgumentException quando o gasto informado é inválido.
     */
    public void adicionarGasto(Gasto gasto) throws IllegalArgumentException {
        if (gasto == null) {
            throw new IllegalArgumentException("Erro: gassto informado é inválido/nulo.");
        }
        gastos.add(gasto);
        setTemGastosCadastrados(true);
    }

    /**
     * Método que calcula quanto foi gasto por categoria (Roupas, Remédios,
     * Refeições e Outros).
     *
     * @throws IllegalArgumentException caso não haja gasto para fazer conta.
     */
    public void calcularGastos() throws IllegalArgumentException {
        if (getTemGastosCadastrados() == true) {
            if (getContagemJaFoiFeita() == true) {
                setGastosComRemedios(0);
                setGastosComRoupas(0);
                setGastosComRefeicoes(0);
                setGastosComOutros(0);
                setGastoMes(0);
            }

            for (Gasto gasto : gastos) {
                if (gasto.getTipoGasto() == TipoGasto.REMEDIO) {
                    gastosComRemedios += gasto.getValor();
                } else if (gasto.getTipoGasto() == TipoGasto.ROUPA) {
                    gastosComRoupas += gasto.getValor();
                } else if (gasto.getTipoGasto() == TipoGasto.REFEICAO) {
                    gastosComRefeicoes += gasto.getValor();
                } else {
                    gastosComOutros += gasto.getValor();
                }
                gastoMes += gasto.getValor();
            }
            setContagemJaFoiFeita(true);
        } else {
            throw new IllegalArgumentException("Erro: não há gastos cadastrados.");
        }
    }

    /**
     * Método que calcula quanto foi gasto em cada forma de pagamento.
     *
     * @throws IllegalArgumentException caso não haja gasto para fazer conta.
     */
    public void calcularPorPagamento() throws IllegalArgumentException {
        if (getTemGastosCadastrados() == true) {
            if (getContagemJaFoiFeita() == true) {
                setQuantoGastouCartao(0);
                setQuantoGastouDinheiro(0);
                setQuantoGastouCheque(0);
                setQuantoGastouChequePre(0);
            }
            for (Gasto gasto : gastos) {
                if (gasto.getPagamento() == TipoPagamento.CARTAO) {
                    quantoGastouCartao += gasto.getValor();
                } else if (gasto.getPagamento() == TipoPagamento.CHEQUE) {
                    quantoGastouCheque += gasto.getValor();
                } else if (gasto.getPagamento() == TipoPagamento.DINHEIRO) {
                    quantoGastouDinheiro += gasto.getValor();
                } else if (gasto.getPagamento() == TipoPagamento.CHEQUEPRE) {
                    quantoGastouChequePre += gasto.getValor();
                }
            }
            setContagemJaFoiFeita(true);
        } else {
            throw new IllegalArgumentException("Erro: não há gastos cadastrados.");
        }

    }

    /**
     * Método que define o gasto mensal.
     *
     * @param gasto gassto mensal.
     * @throws IllegalArgumentException quando o valor informado é menor do que
     * zero.
     */
    public void setGastoMes(double gasto) throws IllegalArgumentException {
        if (gasto < 0) {
            throw new IllegalArgumentException("Erro: valor gasto no mês não pode ser inferior a zero.");
        }
        this.gastoMes = gasto;
    }

    /**
     * Método que atribui verdadeiro ou falso para demostrar se algum dos
     * calculos já foi realizado previamente.
     *
     * @param estadoAtual verdadeiro se já foram realizados cáclulos, falso caso
     * contrário.
     */
    public void setContagemJaFoiFeita(boolean estadoAtual) {
        this.contagemJaFoiFeita = estadoAtual;
    }

    /**
     * Método que atribui verdadeiro ou falso para demostrar se já foi realizado
     * algum cadastro de gasto.
     *
     * @param estadoAtual verdadeiro se já foi realizado algum cadastro, falso
     * caso contrário.
     */
    public void setTemGastosCadastrados(boolean estadoAtual) {
        this.temGastosCadastrados = estadoAtual;
    }

    /**
     * Método que define quanto foi gasto na forma de pagamento cartão.
     *
     * @param cartao valor gasto no cartão.
     * @throws IllegalArgumentException quando o valor informado é inferior a
     * zero.
     */
    public void setQuantoGastouCartao(double cartao) throws IllegalArgumentException {
        if (cartao < 0) {
            throw new IllegalArgumentException("Erro: valor a ser gasto no cartão não pode ser menor do que zero.");
        }
        this.quantoGastouCartao = cartao;
    }

    /**
     * Método que define quanto foi gasto na forma de pagamento dinheiro.
     *
     * @param dinheiro valor gasto em dinheiro.
     * @throws IllegalArgumentException quando o valor informado é inferior a
     * zero.
     */
    public void setQuantoGastouDinheiro(double dinheiro) throws IllegalArgumentException {
        if (dinheiro < 0) {
            throw new IllegalArgumentException("Erro: valor a ser gasto no dinheiro não pode ser menor do que zero.");
        }
        this.quantoGastouDinheiro = dinheiro;
    }

    /**
     * Método que define quanto foi gasto na forma de pagamento cheque.
     *
     * @param cheque valor gasto em cheque.
     * @throws IllegalArgumentException quando o valor informado é inferior a
     * zero.
     */
    public void setQuantoGastouCheque(double cheque) throws IllegalArgumentException {
        if (cheque < 0) {
            throw new IllegalArgumentException("Erro: valor a ser gasto no cheque não pode ser menor do que zero.");
        }
        this.quantoGastouCheque = cheque;
    }

    /**
     * Método que define quanto foi gasto na forma de pagamento cheque pré.
     *
     * @param chequePre valor gasto em cheque pré.
     * @throws IllegalArgumentException quando o valor informado é inferior a
     * zero.
     */
    public void setQuantoGastouChequePre(double chequePre) throws IllegalArgumentException {
        if (chequePre < 0) {
            throw new IllegalArgumentException("Erro: valor a ser gasto no cheque pré não pode ser menor do que zero.");
        }
        this.quantoGastouChequePre = chequePre;
    }

    /**
     * Método define o quanto foi gasto em remédios.
     *
     * @param valor valor gasto na categoria.
     * @throws IllegalArgumentException quando o valor é inferior a zero.
     */
    public void setGastosComRemedios(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Erro: valor a ser gasto com remédios não pode ser menor do que zero.");
        }
        gastosComRemedios = valor;
    }

    /**
     * Método define o quanto foi gasto em roupas.
     *
     * @param valor valor gasto na categoria.
     * @throws IllegalArgumentException quando o valor é inferior a zero.
     */
    public void setGastosComRoupas(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Erro: valor a ser gasto com roupas não pode ser menor do que zero.");
        }
        gastosComRoupas = valor;
    }

    /**
     * Método define o quanto foi gasto em refeições.
     *
     * @param valor valor gasto na categoria.
     * @throws IllegalArgumentException quando o valor é inferior a zero.
     */
    public void setGastosComRefeicoes(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Erro: valor a ser gasto com refeições não pode ser menor do que zero.");
        }
        gastosComRefeicoes = valor;
    }

    /**
     * Método define o quanto foi gasto em outras categorias.
     *
     * @param valor valor gasto na categoria.
     * @throws IllegalArgumentException quando o valor é inferior a zero.
     */
    public void setGastosComOutros(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Erro: valor a ser gasto com outros não pode ser menor do que zero.");
        }
        gastosComOutros = valor;
    }

    /**
     * Método que acessa a variável de instância gastosComRemedios.
     *
     * @return total gasto com remédios.
     */
    public double getGastosComRemedios() {
        return gastosComRemedios;
    }

    /**
     * Método que acessa a variável de instância gastosComRoupas.
     *
     * @return total gasto com roupas.
     */
    public double getGastosComRoupas() {
        return gastosComRoupas;
    }

    /**
     * Método que acessa a variável de instância gastosComRefeicoes.
     *
     * @return total gasto com refeições.
     */
    public double getGastosComRefeicoes() {
        return gastosComRefeicoes;
    }

    /**
     * Método que acessa a variável de instância gastosComOutros.
     *
     * @return total gasto com outros.
     */
    public double getGastosComOutros() {
        return gastosComOutros;
    }

    /**
     * Método que acessa a variável de instância temGastosCadastrados.
     *
     * @return verdadeiro/falso para checar se há gastos cadastrados no
     * gerenciador.
     */
    public boolean getTemGastosCadastrados() {
        return temGastosCadastrados;
    }

    /**
     * Método que acessa a variável de instância contagemJaFoiFeita.
     *
     * @return verdadeiro/falso para checar se algum dos cálculos presentes na
     * classe foram realizados.
     */
    public boolean getContagemJaFoiFeita() {
        return contagemJaFoiFeita;
    }

    /**
     * Método que acessa a variável de instância gastoMes.
     *
     * @return total gasto no mês.
     */
    public double getGastoMes() {
        return gastoMes;
    }

    /**
     * Método que acessa a variável de instância quantoGastouCartao.
     *
     * @return total gasto na forma de pagamento cartão
     */
    public double getQuantoGastouCartao() {
        return quantoGastouCartao;
    }

    /**
     * Método que acessa a variável de instância quantoGastouDinheiro.
     *
     * @return total gasto na forma de pagamento dinheiro.
     */
    public double getQuantoGastouDinheiro() {
        return quantoGastouDinheiro;
    }

    /**
     * Método que acessa a variável de instância quantoGastouCheque.
     *
     * @return total gasto na forma de pagamento cheuque.
     */
    public double getQuantoGastouCheque() {
        return quantoGastouCheque;
    }

    /**
     * Método que acessa a variável de instância quantoGastouChequePre.
     *
     * @return total gasto na forma de pagamento cheuque pré.
     */
    public double getQuantoGastouChequePre() {
        return quantoGastouChequePre;
    }
}
