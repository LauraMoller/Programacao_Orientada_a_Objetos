import java.util.Scanner;

public class App {
    public App() {
        Scanner entrada = new Scanner(System.in);
        String auxNome = "";
        double auxSalario = 0;
        Funcionario funcionarios[] = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do " + (i + 1) + "º funcionário: ");
            auxNome = entrada.nextLine();
            System.out.println("Informe o salário do " + (i + 1) + "º funcionário: ");
            auxSalario = entrada.nextDouble();
            funcionarios[i] = new Funcionario(auxNome, auxSalario);
        }

        entrada.close();

        System.out.println("---- Lista -----");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nome do " + (i + 1) + "º funcionário: " + funcionarios[i].getNome());
            System.out.println("Salário: R$" + funcionarios[i].getSalario());
            System.out.println("IRPF: " + funcionarios[i].calcularIrpf());
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new App();
    }

}
