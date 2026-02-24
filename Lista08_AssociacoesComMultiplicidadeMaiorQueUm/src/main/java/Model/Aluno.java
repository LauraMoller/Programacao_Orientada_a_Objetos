package Model;

/**
 * Classe cujo objeto representa um Aluno.
 *
 * @author Laura Möller
 */
public class Aluno {

    /**
     * Variável de Instância que armazena o número de matrícula do aluno.
     */
    private int matricula;
    /**
     * Variável de Instância que armazena o nome do aluno.
     */
    private String nome;
    /**
     * Vaariável de Instância que armazena a nota do ENEM do aluno.
     */
    private double notaEnem;

    /**
     * Construtor da classe que diz que um aluno precisa ter um número de
     * matrícula, nome e nota do ENEM.
     *
     * @param matricula número de matrícula.
     * @param nome nome do aluno.
     * @param notaEnem nota do ENEM.
     * @throws IllegalArgumentException referente as validações dos getters e
     * setters.
     */
    public Aluno(int matricula, String nome, double notaEnem) throws IllegalArgumentException {
        setMatricula(matricula);
        setNome(nome);
        setNotaEnem(notaEnem);
    }

    /**
     * Método que acessa a variável de instância que contém o número de
     * matrícula do aluno.
     *
     * @return número de matrícula.
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Método que acessa a variável de instância que contém o nnome do aluno.
     *
     * @return nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que acessa a variável de instância que contém a nota de ENEM do
     * aluno.
     *
     * @return nota do ENEM.
     */
    public double getNotaEnem() {
        return notaEnem;
    }

    /**
     * Método que acessa a variável de instância que contém o número de
     * matrícula do aluno.
     *
     * @param matricula número de matrícula.
     * @throws IllegalArgumentException caso o número de matrícula seja menor ou
     * igual a zero.
     */
    public void setMatricula(int matricula) throws IllegalArgumentException {
        if (matricula <= 0) {
            throw new IllegalArgumentException("Erro: número de matrícula não pode ser menor ou igual a zero.");
        }
        this.matricula = matricula;
    }

    /**
     * Método que acessa a variável de instância que contém o nome do aluno.
     *
     * @param nome nome do aluno.
     * @throws IllegalArgumentException caso o nome esteja em branco.
     */
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome do aluno está vazio.");
        }
        this.nome = nome;
    }

    /**
     * Método que acessa a variável de instância que contém a nota do ENEM do
     * aluno.
     *
     * @param notaEnem nota do ENEM.
     * @throws IllegalArgumentException caso a nota informada seja negativa.
     */
    public void setNotaEnem(double notaEnem) throws IllegalArgumentException {
        if (notaEnem < 0) {
            throw new IllegalArgumentException("Erro: a nota do ENEM não pode ser negativa.");
        }
        this.notaEnem = notaEnem;
    }

}
