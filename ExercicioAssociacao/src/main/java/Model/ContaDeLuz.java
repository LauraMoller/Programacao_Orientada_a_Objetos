/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Model;

import java.time.LocalDate;

/**
 * Classe cujo objeto representa uma conta de luz.
 *
 * @author Laura Möller
 */
public class ContaDeLuz {

    /**
     * Variável de instância que armazena a data de leitura da conta de luz.
     */
    private LocalDate dataLeitura;
    /**
     * Variável de instância que armazena a quantidade de Kws gastos da conta de
     * luz.
     */
    private int kwGastos;

    /**
     * Construtor da classe que cria a conta com os valores passados.
     *
     * @param dataLeitura data da leitura.
     * @param kwGastos quantidade de Kws gastos.
     * @throws IllegalArgumentException Kw não pode ser menor que zero e a data
     * não pode ser nula ou posterior a data atual.
     */
    public ContaDeLuz(LocalDate dataLeitura, int kwGastos) throws IllegalArgumentException {
        setKwGastos(kwGastos);
        setDataLeitura(dataLeitura);
    }

    /**
     * Define o valor da variável de instância kwGastos.
     *
     * @param kwGastos quantidade de kwGastos.
     * @throws IllegalArgumentException a quantidade precisa ser superior ou
     * igual a zero.
     */
    public void setKwGastos(int kwGastos) throws IllegalArgumentException {
        if (kwGastos < 0) {
            throw new IllegalArgumentException("Erro: a quantidade de kw não pode ser menor do que zero.");
        }
        this.kwGastos = kwGastos;
    }

    /**
     * Define o valor da variável de instância dataLeitura.
     *
     * @param dataLeitura data da leitura da conta de luz.
     * @throws IllegalArgumentException a data não pode ser nula ou posterior a
     * data atual.
     */
    public void setDataLeitura(LocalDate dataLeitura) throws IllegalArgumentException {
        if (dataLeitura == null) {
            throw new IllegalArgumentException("Erro: A data de leitura não pode ser nula.");
        }

        if (dataLeitura.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Erro: A data de leitura não pode ser uma data futura.");
        }

        this.dataLeitura = dataLeitura;
    }

    /**
     * Acessa o valor da variável de instância kwGastos.
     *
     * @return quantidade kws gastos.
     */
    public int getKwGastos() {
        return kwGastos;
    }

    /**
     * Acessa o valor da variável de instância DataLeitura
     *
     * @return data da leitura.
     */
    public LocalDate getDataLeitura() {
        return dataLeitura;
    }
}
