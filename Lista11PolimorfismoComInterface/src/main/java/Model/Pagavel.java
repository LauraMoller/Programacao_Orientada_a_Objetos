package Model;

/**
 * Classe contrato (interface) que define que toda classe que implemente seus
 * métodos seja pagável.
 *
 * @author Laura Möller
 */
public interface Pagavel {

    /**
     * Método abstrato que deverá calcular o valor a pagar da conta.
     *
     * @return valor a pagar.
     */
    public double calcularValorPagar();
}
