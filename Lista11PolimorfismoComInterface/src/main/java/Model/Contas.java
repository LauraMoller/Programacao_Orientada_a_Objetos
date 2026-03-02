package Model;

import java.util.ArrayList;

/**
 * Classe gerenciadora de contas.
 *
 * @author Laura Möller
 */
public class Contas {

    /**
     * Variável de instância que armazena as contas.
     */
    private ArrayList<Pagavel> contas;

    /**
     * Construtor da classe que inicializa o gerenciador de contas.
     */
    public Contas() {
        contas = new ArrayList<>();
    }

    /**
     * Método que acessa a variável de instância que armazena as contas.
     *
     * @return contas.
     */
    public ArrayList<Pagavel> getContas() {
        return contas;
    }

    /**
     * Método que inclui uma conta ao gerenciador.
     *
     * @param conta conta que deseja incluir.
     * @throws IllegalArgumentException caso a conta seja inválida.
     */
    public void incluirConta(Pagavel conta) throws IllegalArgumentException {
        if (conta == null) {
            throw new IllegalArgumentException("Erro: conta inválida.");
        }
        this.contas.add(conta);
    }

    /**
     * Método que calcula o valor total das contas a pagar.
     *
     * @return valor total a pagar pelas contas.
     */
    public double calcularTotalContas() {
        if (contas.isEmpty()) {
            throw new IllegalArgumentException("Erro: não há contas cadastradas.");
        }
        double total = 0;
        for (Pagavel conta : contas) {
            total += conta.calcularValorPagar();
        }
        return total;
    }
}
