package Model;

/**
 *
 * @author Laura Möller
 */
public class Retangulo {

    /**
     * Variável de Instância para armazenar a altura do Retângulo.
     */
    private int altura;
    /**
     * Variável de Instância para armazenar o comprimento do Retângulo.
     */
    private int comprimento;

    
    /**
     * Construtor da classe que cria um Retângulo de medidas 0.
     */
    public Retangulo() {
        setAltura(0);
        setComprimento(0);
    }

    /**
     * Construtor da classe que cria um Retângulo com as medidas passadas por parâmetro.
     * @param altura altura do Retângulo.
     * @param comprimento comprimento do Retângulo.
     */
    public Retangulo(int altura, int comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
    }

    /**
     * Método que calcula o perímetro do Retângulo.
     * @return perímetro.
     */
    public int calcularPerimetro() {
        return getAltura() * 2 + getComprimento() * 2;
    }

    /**
     * Método que calcula a área do Retângulo.
     * @return área.
     */
    public int calcularArea() {
        return getAltura() * getComprimento();
    }

    /**
     * Aloca a altura do Retângulo na variável de instância altura.
     * @param altura altura.
     * @throws IllegalArgumentException Altura negativa ou igual a zero.
     */
    public void setAltura(int altura) throws IllegalArgumentException {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    /**
     * Aloca o comprimento do Retângulo na variável de instância comprimento.
     * @param comprimento  comprimento.
     * @throws IllegalArgumentException Comprimento negativo ou igual a zero.
     */
    public void setComprimento(int comprimento) throws IllegalArgumentException{
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento:" + comprimento);
        }

        this.comprimento = comprimento;
    }

    /**
     * Método para acessar e retornar o valor da variável de instância altura.
     * @return altura.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Método para acessar e retornar o valor da variável de instância comprimento.
     * @return 
     */
    public int getComprimento() {
        return comprimento;
    }

}
