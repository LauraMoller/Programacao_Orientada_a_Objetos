package Q3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Questão 3 ##############################");

        System.out.println("Insira sua altura (usuário 1): ");
        double a1 = entrada.nextDouble();
        System.out.println("Insira seu peso (usuário 1): ");
        double p1 = entrada.nextDouble();
        Pessoa i1 = new Pessoa(p1, a1);

        System.out.println("Seu IMC é " + i1.calcularIMC());
        System.out.println("Insira sua altura (usuário 2): ");
        double a2 = entrada.nextDouble();
        System.out.println("Insira seu peso (usuário 2): ");
        double p2 = entrada.nextDouble();
        Pessoa i2 = new Pessoa(p2, a2);
        System.out.println("Seu IMC é " + i2.calcularIMC());

        System.out.println("Insira sua altura (usuário 3): ");
        double a3 = entrada.nextDouble();
        System.out.println("Insira seu peso (usuário 3): ");
        double p3 = entrada.nextDouble();
        Pessoa i3 = new Pessoa(p3, a3);
        System.out.println("Seu IMC é " + i3.calcularIMC());

        entrada.close();
    }
}
