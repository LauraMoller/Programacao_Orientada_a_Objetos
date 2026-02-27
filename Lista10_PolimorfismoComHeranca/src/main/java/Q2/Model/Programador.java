package Q2.Model;

import Q2.Model.Funcionario;
import java.util.ArrayList;

/**
 * Classe que representa um funcionário do tipo valor.
 *
 * @author Laura Möller
 */
public class Programador extends Funcionario {

    /**
     * Variável de Instância que armazena as linguagens que o programador
     * conhece.
     */
    private ArrayList<String> linguagens;

    /**
     * Construtor da classe que diz que um programador tem nome e salário base.
     *
     * @param nome nome do funcionário programador.
     * @param salarioBase salário base.
     * @throws IllegalArgumentException validações dos setters utilizados.
     */
    public Programador(String nome, double salarioBase) throws IllegalArgumentException {
        super(nome, salarioBase);
        linguagens = new ArrayList<>();
    }

    /**
     * Método que inclui uma linguagem às conhecidas pelo programador.
     *
     * @param linguagem linguagem que deseja adicionar.
     * @throws IllegalArgumentException caso a linguagem informada esteja em
     * branco.
     */
    public void incluirLinguagem(String linguagem) throws IllegalArgumentException {
        if (linguagem.isBlank()) {
            throw new IllegalArgumentException("Erro: linguagem de programação inválida.");
        }
        linguagens.add(linguagem);
    }

    /**
     * Método que remove uma linguagem das conhecidas pelo programador.
     *
     * @param linguagem linguagem que deseja remover.
     * @throws IllegalArgumentException caso a linguagem esteja em branco ou não
     * esteja nas listadas.
     */
    public void removerLinguagem(String linguagem) throws IllegalArgumentException {
        if (linguagem.isBlank()) {
            throw new IllegalArgumentException("Erro: linguagem de programação em branco.");
        }
        if (linguagens.contains(linguagem)) {
            linguagens.remove(linguagem);
        } else {
            throw new IllegalArgumentException("Erro: a linguagem de programação não estava nas listadas e não pode ser removida.");
        }
    }

    /**
     * Método que acessa a variável de instância que cóntem as linguagens de
     * programação conhecidas pelo programador.
     *
     * @return linguagens.
     */
    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    /**
     * Método que realiza o cálculo do salário do programador.
     *
     * @return salário do programador.
     */
    @Override
    public double calcularSalario() {
        if (linguagens.contains("Java") || linguagens.contains("java") || linguagens.contains("JAVA")) {
            return getSalarioBase() * 1.2;
        } else {
            return getSalarioBase();
        }
    }

}
