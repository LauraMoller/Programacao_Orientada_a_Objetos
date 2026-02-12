package Q2;

public class Pessoa {

    private double p;
    private double h;

    public Pessoa(double p, double h) {
        setH(h);
        setP(p);
    }

    public double calcularIMC() {
        return getP() / (getH() * getH());
    }

    public void setP(double p) {
        if (p <= 0) {
            throw new IllegalArgumentException("Erro: Peso inválido: peso inferior ou igual a zero.");
        }
        this.p = p;
    }

    public void setH(double h) {
        if (h <= 0) {
            throw new IllegalArgumentException("Erro: altura inválida: altura menor ou igual a 0.");
        }
        this.h = h;
    }

    public double getP() {
        return p;
    }

    public double getH() {
        return h;
    }

}