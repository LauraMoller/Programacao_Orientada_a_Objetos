package Q1;

/**
 * Classe que representa a figura geométrica Retangulo.
 *
 * @author Laura Möller
 */
public class Retangulo extends Figura {

    /**
     * Variável de instância que armazena a largura.
     */
    private int largura;
    /**
     * Variável de instância que armazena a altura.
     */
    private int altura;

    /**
     * Construtor da classe que diz que um retângulo possui largura e altura.
     *
     * @param largura largura do retângulo.
     * @param altura altura do retângulo.
     * @throws IllegalArgumentException validações dos setters utilizados no
     * construtor.
     */
    public Retangulo(int largura, int altura) throws IllegalArgumentException {
        setLargura(largura);
        setAltura(altura);
    }

    /**
     * Método que implementa o método obrigatório da classe abstrata que retorna
     * a àrea da figura.
     *
     * @return àrea da figura.
     */
    @Override
    public double calcularArea() {
        return getAltura() * getLargura();
    }

    /**
     * Método que acessa a variável de instância largura.
     *
     * @param largura largura a ser definida.
     * @throws IllegalArgumentException caso a largura seja menor ou igual a
     * zero.
     */
    public void setLargura(int largura) throws IllegalArgumentException {
        if (largura <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para largura: valor menor ou igual a zero.");
        }
        this.largura = largura;
    }

    /**
     * Método que acessa a variável de instância largura.
     *
     * @return largura.
     */
    public int getLargura() {
        return largura;
    }

    /**
     * Método que acessa a variável de instância altura.
     *
     * @param altura altura a ser definida.
     * @throws IllegalArgumentException caso a altura seja menor ou igual a
     * zero.
     */
    public void setAltura(int altura) throws IllegalArgumentException {
        if (altura <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para altura: valor menor ou igual a zero.");
        }
        this.altura = altura;
    }

    /**
     * Método que acessa a variável de instância altura.
     *
     * @return altura.
     */
    public int getAltura() {
        return altura;
    }
}
