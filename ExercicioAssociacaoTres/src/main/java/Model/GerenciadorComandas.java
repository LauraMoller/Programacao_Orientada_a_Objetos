package Model;

import java.util.ArrayList;

/**
 * Classe que gerencia as comandas ativas
 *
 * @author Laura Möller
 */
public class GerenciadorComandas {

    /**
     * Variável de Instância que armazena as comandas ativas.
     */
    private ArrayList<Comanda> comandasAtivas;

    /**
     * Construtor da classe que inicializa a variável de instância que armazena
     * as comandas ativas.
     */
    public GerenciadorComandas() {
        comandasAtivas = new ArrayList<>();
    }

    /**
     * Método que abre uma nova comanda.
     *
     * @return o objeto gerado.
     */
    public Comanda abrirComanda() {
        Comanda nova = new Comanda();
        nova.setNumeroComanda();
        comandasAtivas.add(nova);
        return nova;
    }

    /**
     * Método que busca uma comanda.
     *
     * @param numero número da comanda procurada.
     * @return objeto comanda se encontrada ou null.
     */
    public Comanda buscarComanda(int numero) {
        for (Comanda comanda : comandasAtivas) {
            if (comanda.getNumeroComanda() == numero) {
                return comanda;
            }
        }
        return null;
    }

    /**
     * Método que fecha uma comanda ativa.
     *
     * @param numero número da comanda a fechar.
     * @throws IllegalArgumentException caso a comanda não seja encontrada.
     */
    public void fecharComanda(int numero) throws IllegalArgumentException {
        Comanda comanda = buscarComanda(numero);
        if (comanda == null) {
            throw new IllegalArgumentException("Erro: comanda não encontrada, logo não é possível fechá-la.");
        }
        comandasAtivas.remove(comanda);
    }

    /**
     * Método que acessa a variável de instância que armazena as comandas
     * ativas.
     *
     * @return ArrayList com todas as comandas ativas.
     */
    public ArrayList<Comanda> getComandasAtivas() {
        return comandasAtivas;
    }
}
