package Model;

/**
 *
 * @author Laura Möller
 */
public class Funcionario {

    /**
     * Variável de instância que armazena o nome do funcionário.
     */
    private String nome;
    /**
     * Variável de instância que armazena o salário do funcionário.
     */
    private double salario;

    /**
     * Construtor da classe que cria um objeto funcionario conforme os valores
     * de nome e salário passados no parâmetro.
     *
     * @param nome nome do funcionário.
     * @param salario salário do funcionário.
     */
    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    /**
     * Método para identificar a faixa do Imposto de Renda de Pessoa Física o
     * sálario do funcionário se encaixa.
     *
     * @return faixa do imposto de renda.
     */
    public FaixaIrpf identificarFaixaIrpf() {
        if (getSalario() <= 1903.98) {
            return FaixaIrpf.PRIMEIRA;
        } else if (getSalario() >= 1903.99 && getSalario() <= 2826.65) {
            return FaixaIrpf.SEGUNDA;
        } else if (getSalario() >= 2826.66 && getSalario() <= 3751.05) {
            return FaixaIrpf.TERCEIRA;
        } else if (getSalario() >= 3751.06 && getSalario() <= 4664.68) {
            return FaixaIrpf.QUARTA;
        } else {
            return FaixaIrpf.QUINTA;
        }
    }

    /**
     * Método que calcula o Imposto de Renda de Pessoa Física do funcionário.
     *
     * @return valor a pagar de imposto.
     */
    public double calcularIrpf() {
        double impostoTotal = 0;
        double aux = getSalario();

        if (aux >= 1903.99) {
            if (aux > 2826.65) {
                impostoTotal += 69.20;
            } else {
                impostoTotal += (aux - 1903.98) * 0.075;
            }
        }

        if (aux >= 2826.66) {
            if (aux > 3751.05) {
                impostoTotal += 138.66;
            } else {
                impostoTotal += (aux - 2826.65) * 0.15;
            }
        }

        if (aux >= 3751.06) {
            if (aux > 4664.67) {
                impostoTotal += 205.56;
            } else {
                impostoTotal += (aux - 3751.05) * 0.225;
            }
        }

        if (aux > 4664.68) {
            impostoTotal += (aux - 4664.68) * 0.275;
        }

        return impostoTotal;
    }

    /**
     * Método que define o nome do funcionário.
     *
     * @param nome nome do funcionário.
     * @throws IllegalArgumentException Exceção para nomes em branco.
     */
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome inválido: nome está em branco.");
        }
        this.nome = nome;
    }

    /**
     * Método que define o salário do funcionário.
     *
     * @param salario salário do funcionário.
     * @throws IllegalArgumentException Exceção para salários negativos ou
     * iguais a zero.
     */
    public void setSalario(double salario) throws IllegalArgumentException {
        if (salario <= 0) {
            throw new IllegalArgumentException("Erro: salário inálido: valor negativo ou igual a zero.");
        }
        this.salario = salario;
    }

    /**
     * Método que acessa o valor da variável de instância nome.
     *
     * @return nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que acessa o valor da variável de instância salário.
     *
     * @return salário do funcionário
     */
    public double getSalario() {
        return salario;
    }
}
