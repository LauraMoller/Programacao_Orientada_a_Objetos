/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Model.Cliente;
import Model.ContaBancaria;
import Model.ContaEspecial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Laura Möller
 */
public class TesteUm {

    private ContaEspecial contaEspecial;
    private ContaBancaria contaBancaria;
    private Cliente titular;

    public TesteUm() {
        titular = new Cliente("Laura", "rua flores");
    }

    @Test
    public void teste1_SacarValorSuperiorAoSaldo() {
        contaEspecial = new ContaEspecial("1", 0, titular, 0);
        contaEspecial.setLimiteCredito(100);
        contaEspecial.depositar(20);
        contaEspecial.sacar(50);
        assertEquals(contaEspecial.getSaldo(), -30);
    }

    @Test
    public void teste2_SacarComLimiteCredito() {
        contaEspecial = new ContaEspecial("1", 0, titular, 0);
        contaEspecial.setLimiteCredito(100);
        contaEspecial.depositar(20);
        contaEspecial.sacar(120);
        assertEquals(contaEspecial.getSaldo(), -100);
    }

    @Test
    public void teste3_SaqueSuperiorAoLimiteDeCredito() {
        contaEspecial = new ContaEspecial("1", 0, titular, 0);
        contaEspecial.setLimiteCredito(100);
        contaEspecial.depositar(20);
        assertThrows(IllegalArgumentException.class, () -> {
            contaEspecial.sacar(120.01);
        });
    }
}
