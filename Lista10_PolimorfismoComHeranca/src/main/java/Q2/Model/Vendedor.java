package Q2.Model;

import Q2.Model.Venda;
import Q2.Model.Funcionario;
import java.util.ArrayList;

/**
 * Classe que representa um funcionário do tipo vendedor.
 *
 * @author Laura Möller
 */
public class Vendedor extends Funcionario {

    /**
     * Variável de Instância que armazena as vendas realizadas pelo vendedor.
     */
    private ArrayList<Venda> vendas;
    /**
     * Variável de Instância que armazena o percentual de comissão do vendedor.
     */
    private double percentualComissao;

    /**
     * Construtor da classe que diz que um vendedor possui nome, salário base e
     * percentual de comissão.
     *
     * @param nome nome do vendedor.
     * @param salarioBase salário base do vendedor.
     * @param percentualComissao percentual de comissão do vendedor.
     * @throws IllegalArgumentException validações dos setters utilizados.
     */
    public Vendedor(String nome, double salarioBase, double percentualComissao) throws IllegalArgumentException {
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
        vendas = new ArrayList<>();
    }

    /**
     * Método que acessa a variável de instância que contém o percetual de
     * comissão do vendedor.
     *
     * @return percentual de comissão.
     */
    public double getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * Método que acessa a variável de instância que contém o percentual de
     * comissão do vendedor.
     *
     * @param percentualComissao percentual de comissão desejado para o
     * vendedor.
     * @throws IllegalArgumentException caso o valor da comissão for menor que
     * zero.
     */
    public void setPercentualComissao(double percentualComissao) throws IllegalArgumentException {
        if (percentualComissao < 0) {
            throw new IllegalArgumentException("Erro: o valor da comissão não pode ser menor do que zero.");
        }
        this.percentualComissao = percentualComissao / 100;
    }

    /**
     * Método accessa a variável de instância que contém as vendas do vendedor.
     *
     * @return vendas.
     */
    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    /**
     * Método que inclui uma venda a listagem do vendedor.
     *
     * @param v venda a ser incluida.
     * @throws IllegalArgumentException caso a venda informada seja nula.
     */
    public void incluirVenda(Venda v) throws IllegalArgumentException {
        if (v == null) {
            throw new IllegalArgumentException("Erro: não é possível adicionar uma venda vazia.");
        }
        vendas.add(v);
    }

    /**
     * Método que calcula o salário do vendedor.
     *
     * @return salário do vendedor.
     */
    @Override
    public double calcularSalario() {
        double salario = 0;
        for (Venda v : vendas) {
            salario += v.getValor();
        }

        return (salario * (getPercentualComissao())) + getSalarioBase();
    }
}
