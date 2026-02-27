package Q1;

/**
 * Classe que representa uma figura geométrica do tipo Circulo.
 *
 * @author Laura Möller
 */
public class Circulo extends Figura {

    /**
     * Variável de instância que armazena o valor do raio da circunferência.
     */
    private int raio;

    /**
     * Consturtor da classe que define que todo circulo possui um raio.
     *
     * @param raio raio.
     * @throws IllegalArgumentException validação do setter.
     */
    public Circulo(int raio) throws IllegalArgumentException {
        setRaio(raio);
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do raio do
     * circulo.
     *
     * @return raio.
     */
    public int getRaio() {
        return raio;
    }

    /**
     * Método que acessa a variável de instância que armazena o valor do raio do
     * circulo.
     *
     * @param raio raio desejado.
     * @throws IllegalArgumentException caso o raio seja menor ou igual a zero.
     */
    public void setRaio(int raio) throws IllegalArgumentException {
        if (raio <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido para o raio do círculo: valor menor ou igual a zero.");
        }
        this.raio = raio;
    }

    /**
     * Método que implementa o método obrigatório da classe abstrata que retorna
     * a àrea da figura.
     *
     * @return àrea da figura.
     */
    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

}
