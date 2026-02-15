package Model;

import java.util.ArrayList;
import Model.ContaDeLuz;

/**
 * Classe que gerencia as contas de energia (objetos da classe ContaDeLuz).
 *
 * @author Laura Möller
 */
public class GerenciadorDeContas {

    /**
     * Armazena as contas de luz.
     */
    private ArrayList<ContaDeLuz> contasDeLuz;

    /**
     * Construtor que inicia o ArrayList que armazena as contas.
     */
    public GerenciadorDeContas() {
        contasDeLuz = new ArrayList<>();
    }

    /**
     * Método para adicionar contas ao array.
     *
     * @param conta objeto conta que deseja adicionar ao Array.
     * @throws IllegalArgumentException o objeto não pode ser nulo.
     */
    public void adicionarConta(ContaDeLuz conta) throws IllegalArgumentException {
        if (conta == null) {
            throw new IllegalArgumentException("Erro: não é possível adicionar uma conta nula.");
        }
        contasDeLuz.add(conta);
    }

    /**
     * Método que verifica qual das contas possui o maior consumo e,
     * consequentemente, o mês.
     *
     * @return conta de menor consumo.
     */
    public ContaDeLuz mesDeMaiorConsumo() {
        if (contasDeLuz.isEmpty()) {
            return null;
        }

        ContaDeLuz maior = contasDeLuz.get(0);

        for (ContaDeLuz conta : contasDeLuz) {
            if (conta.getKwGastos() > maior.getKwGastos()) {
                maior = conta;
            }
        }

        return maior;
    }

    /**
     * Método que verifica qual das contas possui o menor consumo e,
     * consequentemente, o mês.
     *
     * @return conta de maior consumo.
     */
    public ContaDeLuz mesDeMenorConsumo() {
        if (contasDeLuz.isEmpty()) {
            return null;
        }

        ContaDeLuz menor = contasDeLuz.get(0);

        for (ContaDeLuz conta : contasDeLuz) {
            if (conta.getKwGastos() < menor.getKwGastos()) {
                menor = conta;
            }
        }

        return menor;
    }
}
