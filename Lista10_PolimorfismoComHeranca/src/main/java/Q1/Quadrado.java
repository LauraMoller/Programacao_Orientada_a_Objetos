package Q1;

/**
 * Classe que representa uma figura extendida do retângulo, um Quadrado.
 *
 * @author Laura Möller
 */
public class Quadrado extends Retangulo {

    /**
     * Construtor da classe que define que tanto a largura quando a altura são
     * iguais.
     *
     * @param medida medida.
     * @throws IllegalArgumentException validações dos setters.
     */
    public Quadrado(int medida) throws IllegalArgumentException {
        super(medida, medida);
    }
}
