package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author molle
 */
public class Lista {
    private ArrayList<Cidade>cidades;  //Cria um Array para armazenar as cidades

    public Lista() {
        cidades = new ArrayList(); //inicializa o array
        lerArquivo(); //chama o método para ler o arquivo
        Cidade maior = maiorPopulacao(); //o objeto "maior" de cidade recebe a cidade retornada pelo método maiorPopulacao()
        System.out.println("Maior cidade: " + maior.getCidade() + " " + 
                maior.getPopulacao()); //imprimi
        
        Cidade menor = menorPopulacao();//o objeto "menor" de cidade recebe a cidade retornada pelo método menorPopulacao()
        System.out.println("Maior cidade: " + menor.getCidade() + " " + 
                menor.getPopulacao());//imprimi
    }

    private Cidade maiorPopulacao() {//Método para verificar qual a cidade com maior populção
        Cidade maiorCidade = null; //cria uma variável para armezar a cidade em questão
        int maiorPopulacao = 0; //método para armazer a meior populção
        for (Cidade c: cidades) { //C recebe cada cidade de cidades ao menos uma vez
            if (c.getPopulacao() > maiorPopulacao) { //se população for maior do que a populção vista anteriormente
                maiorCidade = c; 
                maiorPopulacao = c.getPopulacao();
            }
        }
        return maiorCidade;//retorna a maior cidade
    }
    private Cidade menorPopulacao() {//método para verificar qual a cidade com menor população
        Cidade menorCidade = null;//cria uma variável para armazer a cidade em questão
        int menorPopulacao = Integer.MAX_VALUE; //inicializa com max value para que obrigatoriamente haja uma cidade com tamanho menor
        for (Cidade c: cidades) {
            if (c.getPopulacao()  < menorPopulacao) {
                menorCidade = c;
                menorPopulacao = c.getPopulacao();
            }
        }
        return menorCidade; //retorna a menor cidade
    }
    
    public void lerArquivo() {//Método para ler, scannear o arquivo em questão
        try {
            Scanner arqTexto = new Scanner(new File("C:\\Users\\molle\\Downloads\\L14_municipios.csv"));//cria um scanner que lê o arquivo criado com base no caminho absoluto
            while (arqTexto.hasNext()) {//lê enquanto houver linhas no arquivo
                //Criar cidade
                String linha = arqTexto.nextLine(); //uma variável para armazenar cada linha
                String partesCidade[] = linha.split(";"); //Vetor para separar as linhas em colunas
                Cidade cidade = null;
                try {
                    cidade = new Cidade(Integer.parseInt(partesCidade[0]),
                            partesCidade[1], partesCidade[2],
                            Integer.parseInt(partesCidade[3]));
                    cidades.add(cidade);
                } catch (Exception e) {
                }
               
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new Lista();
    }   
}
