package View;

import Model.Retangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura Möller
 */
public class AppQuestao3Ui {

    public AppQuestao3Ui() {
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura: "));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento: "));

        Retangulo retangulo = new Retangulo(altura, comprimento);

        JOptionPane.showMessageDialog(null, "Área do Retângulo: " + retangulo.calcularArea() + "\nPerímetro do Retângulo: " + retangulo.calcularPerimetro());
    }

    public static void main(String[] args) {
        new AppQuestao3Ui();
    }
}
