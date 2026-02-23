/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Classe que representa um Bairro.
 *
 * @author Laura Möller
 */
public class Bairro {

    /**
     * Variável de Instância que armazena o nome do bairro.
     */
    private String nome;
    /**
     * Variável de Instância que armazena o coeficiente do IPTU do bairro.
     */
    private double coeficienteIptu;

    /**
     * Construtor da classe que cria um objeto bairro.
     *
     * @param nome nome do bairro.
     * @param coeficienteIptu coeficiente do bairro.
     */
    public Bairro(String nome, double coeficienteIptu) {
        setNome(nome);
        setCoeficienteIptu(coeficienteIptu);
    }

    /**
     * Método que acessa a variável de instância que contém o nome.
     *
     * @return nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que acessa a variável de instância que contém o coeficiente do
     * IPTU.
     *
     * @return coeficiente do IPTU.
     */
    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    /**
     * Método que acessa a variável de instância que contém o nome.
     *
     * @param nome nome do bairro.
     * @throws IllegalArgumentException caso o nome informado no parâmetro
     * esteja em branco.
     */
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome do bairro precisa ser informado.");
        }
        this.nome = nome;
    }

    /**
     * Método que acessa a variável de instância que contém o coeficiente do
     * IPTU.
     *
     * @param coeficienteIptu coeficiente do IPTU.
     * @throws IllegalArgumentException caso o coeficiente informado no
     * parâmetro seja negativo.
     */
    public void setCoeficienteIptu(double coeficienteIptu) throws IllegalArgumentException {
        if (coeficienteIptu < 0) {
            throw new IllegalArgumentException("Erro: o coeficiente de IPTU do bairro está inválido.");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
}
