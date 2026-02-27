package Q2.Model;

import java.util.ArrayList;

/**
 * Classe que representa uma empresa.
 *
 * @author Laura Möller
 */
public class Empresa {

    /**
     * Variável de Instância que armazena os funcionários da empresa.
     */
    private ArrayList<Funcionario> funcionarios;
    /**
     * Variável de Instância que armazena o nome da empresa.
     */
    private String nome;

    /**
     * Cosntrutor da classe que define que uma empresa tem nome.
     *
     * @param nome nome da empresa
     * @throws IllegalArgumentException verificação do setter.
     */
    public Empresa(String nome) throws IllegalArgumentException {
        setNome(nome);
        funcionarios = new ArrayList<>();
    }

    /**
     * Método que acessa a variável de instância que contém o nome da empresa.
     *
     * @param nome nome a ser definido para a empresa.
     * @throws IllegalArgumentException caso o nome informado esteja em branco.
     */
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome da empresa está em branco.");
        }
        this.nome = nome;
    }

    /**
     * Método que acessa a variável de instância que contém o nome da empresa.
     *
     * @return nnome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que inclui um funcionário à empresa.
     *
     * @param f funcionário que deseja incluir.
     * @throws IllegalArgumentException caso o funcionário seja nulo.
     */
    public void incluirFuncionario(Funcionario f) throws IllegalArgumentException {
        if (f == null) {
            throw new IllegalArgumentException("Erro: funcionário informado está inválido, não é possível adicionar.");
        }
        funcionarios.add(f);
    }

    /**
     * Método que remove um funcionário da empresa.
     *
     * @param f funcionário que deseja remover.
     * @throws IllegalArgumentException caso o funcionário seja nulo.
     */
    public void removerFuncionario(Funcionario f) throws IllegalArgumentException {
        if (f == null) {
            throw new IllegalArgumentException("Erro: funcionário informado está inválido, não é possível remover.");
        }
        if (funcionarios.contains(f)) {
            funcionarios.remove(f);
        } else {
            throw new IllegalArgumentException("Erro:não é possível remover um funcionário que não está na lista.");
        }
    }

    /**
     * Método que acessa a variável de instância que contém os funcionários da
     * empresa.
     *
     * @return funcionários.
     */
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    /**
     * Método que procura um funcionário na empresa.
     *
     * @param nome nome do funcionário procurado.
     * @return funcionário se for encontrado, nulo caso sontrário.
     * @throws IllegalArgumentException caso o nome informado esteja em branco.
     */
    public Funcionario procurarFuncionario(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: para realizar uma busca é preciso um nome.");
        }
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }

    /**
     * Método que cálcula o custo total da empresa com os salários.
     *
     * @return custo total com salários.
     */
    public double calcularCustosSalarios() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularSalario();
        }
        return total;
    }

}
