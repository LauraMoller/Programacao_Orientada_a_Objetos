/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author molle
 */

public class Cidade {
    private int codigo; //código da cidade
    private String nome; //nome da cidade
    private String estado; //estado da cidade
    private int populacao; //população da cidade

    public Cidade(int codigo, String nome, String estado, int populacao) { //construtor
        this.codigo = codigo; 
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    public int getCodigo() { 
        return codigo;
    }

    public String getCidade() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

}

