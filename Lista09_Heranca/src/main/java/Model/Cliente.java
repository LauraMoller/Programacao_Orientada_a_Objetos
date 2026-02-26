package Model;

/**
 * Classe que representa o cliente do banco e titular da conta.
 *
 * @author Laura Möller
 */
public class Cliente {

    /**
     * Variável de instância que armazena o nome do cliente.
     */
    private String nome;
    /**
     * Vairpavel de instância que armazena o endereco do cliente.
     */
    private String endereco;

    /**
     * Construtor da classe que determina o nome e endereço do cliente.
     *
     * @param nome nome do cliente.
     * @param endereco endereço do cliente.
     * @throws IllegalArgumentException caso nome e/ou endereço estejam em
     * branco.
     */
    public Cliente(String nome, String endereco) throws IllegalArgumentException {
        setNome(nome);
        setEndereco(endereco);
    }

    /**
     * Método que acessa a variável de instância que armazena o nome do cliente.
     *
     * @return nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que acessa a variável de instância que armazena o nome do cliente.
     *
     * @param nome nome do cliente.
     * @throws IllegalArgumentException caso o nome esteja em branco.
     */
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome do cliente em branco.");
        }

        this.nome = nome;
    }

    /**
     * Método que acessa a variável de instância que armazena o endereço do
     * cliente.
     *
     * @return endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Método que acessa a variável de instância que armazena o endereço do
     * cliente.
     *
     * @param endereco endereço do cliente.
     * @throws IllegalArgumentException caso o enddereço esteja em branco.
     */
    public void setEndereco(String endereco) throws IllegalArgumentException {
        if (endereco.isBlank()) {
            throw new IllegalArgumentException("Erro: endereço do cliente em branco.");
        }

        this.endereco = endereco;
    }

}
