package Q1;

/**
 * Classe que representa uma figura geométrica do tipo Triângulo.
 *
 * @author Laura Möller
 */
public class Triangulo extends Figura {

    /**
     * Variável de instância que armazena o lado 1 do triângulo.
     */
    private int lado1;
    /**
     * Variável de instância que armazena o lado 2 do triângulo.
     */
    private int lado2;
    /**
     * Variável de instância que armazena o lado 3 do triângulo.
     */
    private int lado3;

    /**
     * Cosntrutor da classe que diz que um triângulo possui três lados.
     *
     * @param lado1 valor do lado 1.
     * @param lado2 valor do lado 2.
     * @param lado3 valor do lado 3.
     * @throws IllegalArgumentException validações dos setters utilizados.
     */
    public Triangulo(int lado1, int lado2, int lado3) throws IllegalArgumentException {
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);

    }

    /**
     * Método que acessa a variável de instância que armazena o valor do lado 1.
     *
     * @param lado1 valor desejado para o lado 1.
     * @throws IllegalArgumentException caso o lado seja menor ou igual a zero.
     */
    public void setLado1(int lado1) throws IllegalArgumentException {
        if (lado1 <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para triângulo: lado menor ou igual a zero.");
        }
        this.lado1 = lado1;
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do lado 2.
     *
     * @param lado2 valor desejado para o lado 2.
     * @throws IllegalArgumentException caso o lado seja menor ou igual a zero.
     */
    public void setLado2(int lado2) throws IllegalArgumentException {
        if (lado2 <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para triângulo: lado menor ou igual a zero.");
        }
        this.lado2 = lado2;
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do lado 3.
     *
     * @param lado3 valor desejado para o lado 3.
     * @throws IllegalArgumentException caso o lado seja menor ou igual a zero.
     */
    public void setLado3(int lado3) throws IllegalArgumentException {
        if (lado3 <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para triângulo: lado menor ou igual a zero.");
        }
        this.lado1 = lado3;
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do lado 1.
     *
     * @return lado 1.
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do lado 2.
     *
     * @return lado 2.
     */
    public int getLado2() {
        return lado2;
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do lado 3.
     *
     * @return lado 3.
     */
    public int getLado3() {
        return lado3;
    }

    /**
     * Método que implementa o método obrigatório da classe abstrata que retorna
     * a àrea da figura.
     *
     * @return àrea do triângulo.
     */
    @Override
    public double calcularArea() {
        double semiPerimetro = (getLado1() + getLado2() + getLado3()) / 2.0;
        double aux = semiPerimetro * (semiPerimetro - getLado1()) * (semiPerimetro - getLado2()) * (semiPerimetro - getLado3());
        return Math.sqrt(aux);
    }

}
