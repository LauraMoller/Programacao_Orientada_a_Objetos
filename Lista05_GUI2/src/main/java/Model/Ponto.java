package Model;

/**
 *
 * @author Laura Möller
 */
public class Ponto {

    /**
     * Variável de instância que guarda o valor de X.
     */
    private int x;
    /**
     * Variável de instância que guarda o valor de Y.
     */
    private int y;

    /**
     * Construtor da classe que cria um ponto de coordenadas 0.
     */
    public Ponto() {
        setX(0);
        setY(0);
    }

    /**
     * Construtor da classe que cria um ponto com as coordenadas passadas em
     * parâmetro.
     *
     * @param x valor de X.
     * @param y valor de Y.
     */
    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }

    /**
     * Método que verifica se o ponto incide sobre o eixo X.
     *
     * @return verdadeiro se incide sobre o eixo x, falso se não incide sobre o
     * eixo x.
     */
    public boolean estaIncidindoSobreX() {
        return getY() == 0;
    }

    /**
     * Método que verifica se o ponto incide sobre o eixo y.
     *
     * @return verdadeiro se incide sobre o eixo y, falso se não incide sobre o
     * eixo y.
     */
    public boolean estaIncidindoSobreY() {
        return getX() == 0;
    }

    /**
     * Método que retorna o quadrante em que o ponto se encaixa.
     *
     * @return quadrante do ponto.
     */
    public Quadrante identificarQuadrante() {
        if (estaIncidindoSobreY() || estaIncidindoSobreX()) {
            return Quadrante.NENHUM;
        } else if (getX() > 0 && getY() > 0) {
            return Quadrante.PRIMEIRO;
        } else if (getX() < 0 && getY() > 0) {
            return Quadrante.SEGUNDO;
        } else if (getX() < 0 && getY() < 0) {
            return Quadrante.TERCEIRO;
        } else if (getX() > 0 && getY() < 0) {
            return Quadrante.QUARTO;
        }
        return null;
    }

    /**
     * Método que calcula a distância do objeto atual com um outro passado em
     * parâmetro.
     *
     * @param outroPonto ponto fornecido em parâmetro.
     * @return distância entre pontos.
     */
    public double calcularDistancia(Ponto outroPonto) {
        double auxX = Math.pow((getX() - outroPonto.getX()), 2);
        double auxY = Math.pow((getY() - outroPonto.getY()), 2);
        return Math.sqrt((auxX + auxY));
    }

    /**
     * Método que calcula a distância entre dois pontos passados pelo parâmetro.
     *
     * @param p1 ponto um.
     * @param p2 ponto dois.
     * @return a distância entre os pontos.
     */
    public static double calcularDistancia(Ponto p1, Ponto p2) {
        double auxX = Math.pow((p2.getX() - p1.getX()), 2);
        double auxY = Math.pow((p2.getY() - p1.getY()), 2);
        return Math.sqrt((auxX + auxY));
    }

    /**
     * Define o valor da variável de instância x.
     *
     * @param x valor de x.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Define o valor da variável de instância y.
     *
     * @param y valor de y.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Método que acessa o valor da variável de instância x.
     *
     * @return valor de x.
     */
    public int getX() {
        return x;
    }

    /**
     * Método que acessa o valor da variável de instância y.
     *
     * @return valor de y.
     */
    public int getY() {
        return y;
    }
}
