package Q1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Questão 1 ##############################");

        Pessoa individuo = new Pessoa(78, 1.75);
        System.out.println("IMC: " + individuo.calcularIMC());

        entrada.close();
    }
}
