package Q4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoas[] = new Pessoa[3];
        String nomes[] = new String[3];

        System.out.println("Questão 4 ##############################");

        System.out.println("Insira sua altura (usuário 1): ");
        double a1 = entrada.nextDouble();
        System.out.println("Insira seu peso (usuário 1): ");
        double p1 = entrada.nextDouble();
        System.out.println("Insira seu nome (usuário 1): ");
        String n1 = entrada.next();
        Pessoa i1 = new Pessoa(p1, a1, n1);
        pessoas[2] = i1;
        nomes[2] = i1.getN();

        System.out.println("Insira sua altura (usuário 2): ");
        double a2 = entrada.nextDouble();
        System.out.println("Insira seu peso (usuário 2): ");
        double p2 = entrada.nextDouble();
        System.out.println("Insira seu nome (usuário 2): ");
        String n2 = entrada.next();
        Pessoa i2 = new Pessoa(p2, a2, n2);
        pessoas[1] = i2;
        nomes[1] = i2.getN();


        System.out.println("Insira sua altura (usuário 3): ");
        double a3 = entrada.nextDouble();
        System.out.println("Insira seu peso (usuário 3): ");
        double p3 = entrada.nextDouble();
        System.out.println("Insira seu nome (usuário 3): ");
        String n3 = entrada.next();
        Pessoa i3 = new Pessoa(p3, a3, n3);
        pessoas[0] = i3;
        nomes[0] = i3.getN();

        for (int i = 0; i < 3; i++) {
            System.out.println("Dados do usuário " + (i + 1) + ": ");
            System.out.println("Nome: " + pessoas[i].getN());
            System.out.println("Peso: " + pessoas[i].getP());
            System.out.println("Altura: " + pessoas[i].getH());
            System.out.println("IMC: " + pessoas[i].calcularIMC());
            System.out.println("");
        }

        entrada.close();
    }
}
