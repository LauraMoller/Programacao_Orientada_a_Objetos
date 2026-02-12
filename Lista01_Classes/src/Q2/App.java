package Q2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Questão 2 ##############################");

        System.out.println("Insira sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Insira seu peso: ");
        double peso = entrada.nextDouble();

        Pessoa individuo2 = new Pessoa(peso, altura);
        System.out.println("Seu IMC é " + individuo2.calcularIMC());

        entrada.close();
    }
}
