package Q4;

public class Pessoa {

    private double p;
    private double h;
    private String n;

    public Pessoa(double p, double h, String n) {
        setH(h);
        setP(p);
        setN(n);
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

    public void setN(String n) {
        if (n.isBlank()) {
            throw new IllegalArgumentException("Erro: nome inválido: o nome está vázio ou contém apenas caraáteres em branco.");
        }
        this.n = n;
    }

    public double getP() {
        return p;
    }

    public double getH() {
        return h;
    }

    public String getN() {
        return n;
    }

}