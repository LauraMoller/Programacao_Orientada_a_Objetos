/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Model.Bairro;
import Model.Finalidade;
import Model.Imovel;
import java.text.DecimalFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Método de teste.
 *
 * @author Laura Möller
 */
public class Teste {

    /**
     * Variável de instância que armazena a finalidade do imóvel.
     */
    private Finalidade f;
    /**
     * Variável de instância que armazena o imóvel.
     */
    private Imovel i;
    /**
     * Variável de instância que armazena o bairro do imóvel.
     */
    private Bairro b;
    /**
     * Variável de instância que armazena a formatação numérica para duas casas
     * decimais assim como o dinheiro.
     */
    private DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Teste para checar se a exceção é lançada quando uma área negativa é
     * informada.
     */
    @Test
    public void teste1_RecusaAreaNegativa() {
        f = Finalidade.COMERCIAL;
        b = new Bairro("b", 1);
        i = new Imovel("endereço", 5, b, f);
        assertThrows(IllegalArgumentException.class, () -> {
            i.setArea(-5);
        });
    }

    /**
     * Teste que verifica se a exceção é lançada quando uma finalidade não é
     * informada.
     */
    @Test
    public void teste2_RecusaFinalidadeNaoInformada() {
        b = new Bairro("centro", 1);
        assertThrows(IllegalArgumentException.class, () -> {
            i = new Imovel("endereço", 250, b, null);
        });
    }

    /**
     * Teste que verifica se a exceção é lançada quando um bairro não é
     * informado.
     */
    @Test
    public void teste3_RecusaBairroNaoInformado() {
        f = Finalidade.COMERCIAL;
        assertThrows(IllegalArgumentException.class, () -> {
            i = new Imovel("endereço", 250, null, f);
        });
    }

    /**
     * Teste que verifica o cálculo de IPTU para imóveis residenciais.
     */
    @Test
    public void teste4_IPTUBairroResidencial() {
        f = Finalidade.RESIDENCIAL;
        b = new Bairro("centro", 1);
        i = new Imovel("endereço", 400, b, f);
        assertEquals("400.00", df.format(i.calcularIptu()));
    }

    /**
     * Teste que verifica o cálculo de IPTU para imóveis comerciais de até
     * 100m².
     */
    @Test
    public void teste5_IPTUBairroComercial() {
        f = Finalidade.COMERCIAL;
        b = new Bairro("centro", 1);
        i = new Imovel("endereço", 80, b, f);
        assertEquals("500.00", df.format(i.calcularIptu()));
    }

    /**
     * Teste que verifica o cálculo de IPTU para imóveis comerciais entre 400m²
     * e 100m².
     */
    @Test
    public void teste6_IPTUBairroComercial() {
        f = Finalidade.COMERCIAL;
        b = new Bairro("centro", 1);
        i = new Imovel("endereço", 250, b, f);
        assertEquals("1000.00", df.format(i.calcularIptu()));
    }

    /**
     * Teste que verifica o cálculo de IPTU para imóveis comerciais acima de
     * 400m².
     */
    @Test
    public void teste7_IPTUBairroComercial() {
        f = Finalidade.COMERCIAL;
        b = new Bairro("centro", 1);
        i = new Imovel("endereço", 500, b, f);
        assertEquals("1275.00", df.format(i.calcularIptu()));
    }

    /**
     * Teste que verifica o cálculo de IPTU para imóveis industriais de até
     * 2000m².
     */
    @Test
    public void teste8_IPTUBairroIndustriais() {
        f = Finalidade.INDUSTRIAL;
        b = new Bairro("centro", 1);
        i = new Imovel("endereço", 2000, b, f);
        assertEquals("1000.00", df.format(i.calcularIptu()));
    }

    /**
     * Teste que verifica o cálculo de IPTU para imóveis industriais maiores do
     * que 2000m².
     */
    @Test
    public void teste9_IPTUBairroIndustriais() {
        f = Finalidade.INDUSTRIAL;
        b = new Bairro("centro", 1);
        i = new Imovel("endereço", 3000, b, f);
        assertEquals("1650.00", df.format(i.calcularIptu()));
    }

    /**
     * Teste que verifica o cálculo de IPTU para imóveis de coeficiente 2.5.
     */
    @Test
    public void teste10_IPTUCoeficiente() {
        f = Finalidade.RESIDENCIAL;
        b = new Bairro("centro", 2.5);
        i = new Imovel("endereço", 500, b, f);
        assertEquals("1250.00", df.format(i.calcularIptu()));
    }
}
