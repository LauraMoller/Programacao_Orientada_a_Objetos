/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Model.FaixaIrpf;
import Model.Funcionario;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Laura Möller
 */
public class Teste {

    /**
     * Objeto do tipo Funcionario que serve como reutilizável.
     */
    private static Funcionario f;
    /**
     * Objeto do tipo DecimalFormat que formata valores.
     */
    private DecimalFormat df;

    /**
     * Construtor da Classe Teste que define o formato do decimalFormat.
     */
    public Teste() {
        df = new DecimalFormat("0.00");
    }

    /**
     * Identifica se o salário se enquadra corretamente na primeira faixa.
     */
    @Test
    public void testeUm_PrimeiraFaixa() {
        f = new Funcionario("F1", 850);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.PRIMEIRA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeDois_CalcularIrpf() {
        f = new Funcionario("F1", 850);
        assertEquals(df.format(f.calcularIrpf()), "0.00");
    }

    /**
     * Testa o limite da primeira faixa.
     */
    @Test
    public void testeTres_PrimeiraFaixa() {
        f = new Funcionario("F1", 1903.98);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.PRIMEIRA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeQuatro_CalcularIrpf() {
        f = new Funcionario("F1", 1903.98);
        assertEquals(df.format(f.calcularIrpf()), "0.00");
    }

    /**
     * Testa o limite da segunda faixa.
     */
    @Test
    public void testeCinco_SegundaFaixa() {
        f = new Funcionario("F1", 1903.99);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.SEGUNDA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeSeis_CalcularIrpf() {
        f = new Funcionario("F1", 1903.99);
        assertEquals(df.format(f.calcularIrpf()), "0.00");
    }

    /**
     * Identifica se o salário se enquadra corretamente na segunda faixa.
     */
    @Test
    public void testeSete_SegundaFaixa() {
        f = new Funcionario("F1", 2000);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.SEGUNDA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeOito_CalcularIrpf() {
        f = new Funcionario("F1", 2000);
        assertEquals(df.format(f.calcularIrpf()), "7.20");
    }

    /**
     * Testa o limite da segunda faixa.
     */
    @Test
    public void testeNove_SegundaFaixa() {
        f = new Funcionario("F1", 2826.65);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.SEGUNDA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeDez_CalcularIrpf() {
        f = new Funcionario("F1", 2826.65);
        assertEquals(df.format(f.calcularIrpf()), "69.20");
    }

    /**
     * Testa o limite da terceira faixa.
     */
    @Test
    public void testeOnze_TerceiraFaixa() {
        f = new Funcionario("F1", 2826.66);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.TERCEIRA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeDoze_CalcularIrpf() {
        f = new Funcionario("F1", 2826.66);
        assertEquals(df.format(f.calcularIrpf()), "69.20");
    }

    /**
     * Identifica se o salário se enquadra corretamente na terceira faixa.
     */
    @Test
    public void testeTreze_TerceiraFaixa() {
        f = new Funcionario("F1", 3000);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.TERCEIRA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeQuatorze_CalcularIrpf() {
        f = new Funcionario("F1", 3000);
        assertEquals(df.format(f.calcularIrpf()), "95.20");
    }

    /**
     * Testa o limite da terceira faixa.
     */
    @Test
    public void testeQuize_TerceiraFaixa() {
        f = new Funcionario("F1", 3751.05);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.TERCEIRA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeDezesseis_CalcularIrpf() {
        f = new Funcionario("F1", 3751.05);
        assertEquals(df.format(f.calcularIrpf()), "207.86");
    }

    /**
     * Testa o limite da quarta faixa.
     */
    @Test
    public void testeDezessete_QuartaFaixa() {
        f = new Funcionario("F1", 3751.06);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.QUARTA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeDezoito_CalcularIrpf() {
        f = new Funcionario("F1", 3751.06);
        assertEquals(df.format(f.calcularIrpf()), "207.86");
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeDezenove_QuartaFaixa() {
        f = new Funcionario("F1", 4000);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.QUARTA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeVinte_CalcularIrpf() {
        f = new Funcionario("F1", 4000);
        assertEquals(df.format(f.calcularIrpf()), "263.87");
    }

    /**
     * Testa o limite da quarta faixa.
     */
    @Test
    public void testeVinteUm_QuartaFaixa() {
        f = new Funcionario("F1", 4664.68);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.QUARTA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeVinteDois_CalcularIrpf() {
        f = new Funcionario("F1", 4664.68);
        assertEquals(df.format(f.calcularIrpf()), "413.42");
    }

    /**
     * Testa o limite da quinta faixa.
     */
    @Test
    public void testeVinteTres_QuintaFaixa() {
        f = new Funcionario("F1", 4664.69);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.QUINTA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeVinteQuatro_CalcularIrpf() {
        f = new Funcionario("F1", 4664.69);
        assertEquals(df.format(f.calcularIrpf()), "413.42");
    }

    /**
     * Identifica se o salário se enquadra corretamente na quinta faixa.
     */
    @Test
    public void testeVinteCinco_QuintaFaixa() {
        f = new Funcionario("F1", 5000);
        assertEquals(f.identificarFaixaIrpf(), FaixaIrpf.QUINTA);
    }

    /**
     * Identifica se o resultado do calculo de IRPF para o salário está correto.
     */
    @Test
    public void testeVinteSeis_CalcularIrpf() {
        f = new Funcionario("F1", 5000);
        assertEquals(df.format(f.calcularIrpf()), "505.63");
    }

    /**
     * Verifica se a exceção é lançada para salário negativo.
     */
    @Test
    public void testeVinteSete_Execao_SalarioNegativo() {
        f = new Funcionario("F1", 10);
        assertThrows(IllegalArgumentException.class, () -> {
            f.setSalario(-100);
        });
    }
}
