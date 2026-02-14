package View;

import Model.Retangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura Möller
 */
public class AppQuestao2Ui {

    public AppQuestao2Ui() {
        Retangulo retangulo = new Retangulo();

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura: "));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento: "));
        retangulo.setAltura(altura);
        retangulo.setComprimento(comprimento);
        JOptionPane.showMessageDialog(null, "Área do Retângulo: " + retangulo.calcularArea() + "\nPerímetro do Retângulo: " + retangulo.calcularPerimetro());
    }

    public static void main(String[] args) {
        new AppQuestao2Ui();
    }
}
