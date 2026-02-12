import java.util.Scanner;

public class App {
    public App() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Crie duas contas bancárias");
        System.out.println("Informe o Titular da primeira conta: ");
        String t1 = entrada.nextLine();
        System.out.println("Informe o número da primeira conta: ");
        String n1 = entrada.next();
        System.out.println("Informe o Titular da segunda conta: ");
        String t2 = entrada.next();
        System.out.println("Informe o número da segunda conta: ");
        String n2 = entrada.next();

        ContaBancaria c1 = new ContaBancaria(n1, t1);
        ContaBancaria c2 = new ContaBancaria(n2, t2);

        System.out.println("Realizando as operações pedidas na questão...");
        c1.depositar(1000);
        c1.depositar(700);
        c2.depositar(5000);
        c2.sacar(3000);
        c2.transferir(c1, 1800);
        System.out.println("Titular " + c1.getTitular() + " - saldo R$" + c1.getSaldo());
        System.out.println("Titular " + c2.getTitular() + " - saldo R$" + c2.getSaldo());
        entrada.close();
    }

    public static void main(String[] args) {
        new App();
    }

}

