package Q2.Model;

/**
 * Classe que representa um funcionário.
 *
 * @author Laura Möller
 */
public class Funcionario {

    /**
     * Variável de Instância que armazena o nome do funcionário.
     */
    private String nome;

    /**
     * Variável de Instância que armazena o salário base do funcionário.
     */
    private double salarioBase;

    /**
     * Construtor da classe que diz que um funcionário possui nome e salário
     * base.
     *
     * @param nome nome do funcionário.
     * @param salarioBase salário base.
     * @throws IllegalArgumentException validações dos setters utilizados.
     */
    public Funcionario(String nome, double salarioBase) throws IllegalArgumentException {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    /**
     * Método que acessa a variável de instância que contém o nome do
     * funcionário.
     *
     * @return nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que acessa a variável de instância que contém o salário base do
     * funcionário.
     *
     * @return salário base.
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Método que acessa a variável de instância que contém o nome do
     * funcionário.
     *
     * @param nome nome deseja para o funcionário.
     * @throws IllegalArgumentException quando o nome do funcionário está em
     * branco.
     */
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome de funcionário está em branco.");
        }
        this.nome = nome;
    }

    /**
     * Método que acessa a variável de instância que contém o salário base do
     * funcionário.
     *
     * @param salarioBase salário base desejado para o funcionário.
     * @throws IllegalArgumentException caso o valor informado seja menor ou
     * igual a zero.
     */
    public void setSalarioBase(double salarioBase) throws IllegalArgumentException {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Erro: o salário base não pode ser menor ou igual a zero.");
        }
        this.salarioBase = salarioBase;
    }

    /**
     * Método que calcula o salário do funcionário.
     *
     * @return salário do funcionário.
     */
    public double calcularSalario() {
        return salarioBase;
    }
}
