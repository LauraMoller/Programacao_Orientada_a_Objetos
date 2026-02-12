public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public double calcularIrpf() {
        //Primeira Faixa
        double impostoTotal = 0;
        double aux = getSalario();

        //Segunda Faixa
        if (aux >= 1903.99) {
            if (aux > 2826.65) {
                impostoTotal += 69.20;
            } else {
                impostoTotal += (aux - 1903.98) * 0.075;
            }
        }

        //Terceira Faixa
        if (aux >= 2826.66) {
            if (aux > 3751.05) {
                impostoTotal += 138.66;
            } else {
                impostoTotal += (aux - 2826.65) * 0.15;
            }
        }

        //Quarta Faixa
        if (aux >= 3751.06) {
            if (aux > 4664.67) {
                impostoTotal += 205.56;
            } else {
                impostoTotal += (aux - 3751.05) * 0.225;
            }
        }
        //Quinta faixa
        if (aux > 4664.68) {
            impostoTotal += (aux - 4664.68) * 0.275;
        }

        return impostoTotal;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome inválido: nome está em branco.");
        }
        this.nome = nome;
    }

    public void setSalario(double salario) throws IllegalArgumentException {
        if (salario <= 0) {
            throw new IllegalArgumentException("Erro: salário inálido: valor negativo ou igual a zero.");
        }
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
