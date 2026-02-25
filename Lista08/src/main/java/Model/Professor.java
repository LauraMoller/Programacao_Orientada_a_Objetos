package Model;

/**
 * Classe que representa um professor.
 *
 * @author Laura Möller
 */
public class Professor {

    /**
     * Variável de Instância que armazena o nome do profesor.
     */
    private String nome;
    /**
     * Variável de Instância que armazena o email do professor.
     */
    private String email;
    /**
     * Variável de Instância que armazena o tipo de titulação do professor.
     */
    private Titulacao titulacao;

    /**
     * Construtor da classe que define que um professor tem nome, email e
     * titulação.
     *
     * @param nome nome do professor.
     * @param email email do professor.
     * @param titulacao titulação do professor.
     */
    public Professor(String nome, String email, Titulacao titulacao) {
        setNome(nome);
        setEmail(email);
        setTitulacao(titulacao);
    }

    /**
     * Método que acessa a variável de instância que contém o nome do professor.
     *
     * @return nome do professor.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que acessa a variável de instância que contém o emial do
     * professor.
     *
     * @return email do professor.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que acessa a variável de instância que contém a titulação do
     * professor.
     *
     * @return titulação do professor.
     */
    public Titulacao getTitulacao() {
        return titulacao;
    }

    /**
     * Método que acessa a variável de instância que contém o nome do professor.
     *
     * @param nome nome do professor.
     */
    public void setNome(String nome) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome do professor está vazio.");
        }
        this.nome = nome;
    }

    /**
     * Método que acessa a variável de instância que contém o email do
     * professor.
     *
     * @param email email do professor.
     */
    public void setEmail(String email) {
        if (email.isBlank()) {
            throw new IllegalArgumentException("Erro: email do professor está vazio.");
        }
        this.email = email;
    }

    /**
     * Método que acessa a variável de instância que contém a titulação do
     * professor.
     *
     * @param titulacao titulação do professor.
     */
    public void setTitulacao(Titulacao titulacao) {
        if (titulacao == null) {
            throw new IllegalArgumentException("Erro: titulação do professor está vazia.");
        }
        this.titulacao = titulacao;
    }
}
