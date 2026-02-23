/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Model;

/**
 * Classe que representa um Imóvel.
 *
 * @author Laura Möller
 */
public class Imovel {

    /**
     * Variável de Instância que armazena o endereço do imóvel.
     */
    private String endereco;
    /**
     * Variável de Instância que armazena a área do imóvel em m².
     */
    private int area;
    /**
     * Variável de Instância que armazena um objeto Bairro que refere-se ao
     * bairro do imóvel.
     */
    private Bairro bairro;
    /**
     * Variável de Instância que armazena um objeto Finalidade que refere-se à
     * finalidade do imóvel.
     */
    private Finalidade finalidade;

    /**
     * Construtor da classe que define que um imóvel precisa ter endereço, área,
     * bairro e finalidade.
     *
     * @param endereco endereço.
     * @param area área.
     * @param bairro bairro;
     * @param finalidade fnalidade.
     * @throws IllegalArgumentException conforme o lançamento de exceção de cada
     * um dos itens.
     */
    public Imovel(String endereco, int area, Bairro bairro, Finalidade finalidade) throws IllegalArgumentException {
        setEndereco(endereco);
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);
    }

    /**
     * Método que cácula o IPTU de um Imóvel.
     *
     * @return valor do IPTU.
     * @throws IllegalArgumentException caso o bairro ou finalidade sejam nulos.
     */
    public double calcularIptu() throws IllegalArgumentException {
        if (bairro == null) {
            throw new IllegalArgumentException("Erro: o bairro não foi definido.");
        }

        if (finalidade == null) {
            throw new IllegalArgumentException("Erro: a finalidade não foi definido.");
        }

        double total = 0;

        if (finalidade == Finalidade.RESIDENCIAL) {
            total = area * 1;
        }

        if (finalidade == Finalidade.COMERCIAL) {
            if (area <= 100) {
                total = 500;
            } else if (area > 100 && area <= 400) {
                total = 1000;
            } else {
                total = area * 2.55;
            }
        }

        if (finalidade == Finalidade.INDUSTRIAL) {
            if (area <= 2000) {
                total = 1000;
            } else {
                total = area * 0.55;
            }
        }

        return total * bairro.getCoeficienteIptu();
    }

    /**
     * Método que acessa a variável de instância que contém o endereço.
     *
     * @return endereço do imóvel.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Método que acessa a variável de instância que contém a área.
     *
     * @return área do imóvel.
     */
    public int getArea() {
        return area;
    }

    /**
     * Método que acessa a variável de instância que contém a finalidade do
     * imóvel.
     *
     * @return finalidade do imóvel.
     */
    public Finalidade getFinalidade() {
        return finalidade;
    }

    /**
     * Método que acessa a variável de instância que contém o bairro.
     *
     * @return bairro do imóvel.
     */
    public Bairro getBairro() {
        return bairro;
    }

    /**
     * Método que acessa a variável de instância que contém o endereço.
     *
     * @param endereco endereço do imóvel.
     * @throws IllegalArgumentException caso o endereço informado esteja em
     * branco.
     */
    public void setEndereco(String endereco) throws IllegalArgumentException {
        if (endereco.isBlank()) {
            throw new IllegalArgumentException("Erro: enderço está vazio.");
        }
        this.endereco = endereco;
    }

    /**
     * Método que acessa a variável de instância que contém a área.
     *
     * @param area área do imóvel.
     * @throws IllegalArgumentException caso a área seja negativa.
     */
    public void setArea(int area) throws IllegalArgumentException {
        if (area < 0) {
            throw new IllegalArgumentException("Erro: área não pode ser negativa.");
        }
        this.area = area;
    }

    /**
     * Método que acessa a variável de instância que contém o bairro.
     *
     * @param bairro bairro do imóvel.
     * @throws IllegalArgumentException caso o bairro informado seja nulo.
     */
    public void setBairro(Bairro bairro) throws IllegalArgumentException {
        if (bairro == null) {
            throw new IllegalArgumentException("Erro: bairro inválido.");
        }
        this.bairro = bairro;
    }

    /**
     * Método que acessa a variável de instância que contém a finalidade.
     *
     * @param finalidade finalidade
     * @throws IllegalArgumentException caso a finalidade informada seja nula.
     */
    public void setFinalidade(Finalidade finalidade) throws IllegalArgumentException {
        if (finalidade == null) {
            throw new IllegalArgumentException("Erro: finalidade inválida.");
        }
        this.finalidade = finalidade;
    }

}
