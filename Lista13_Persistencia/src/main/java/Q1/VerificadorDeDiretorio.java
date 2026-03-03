package Q1;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Classe responsável por verificar tamanho de um diretório e seus
 * sub-diretórios em MB.
 *
 * @author Laura Möller
 */
public class VerificadorDeDiretorio {

    /**
     * Variável de instância que armazena o diretório.
     */
    private File diretorio;

    /**
     * Construtor da classe que define o diretório ou lança exceção caso o nome
     * passado seja de um diretório inexistente.
     *
     * @param caminho nome do diretório.
     * @throws FileNotFoundException caso o caminho fornecido não exista no
     * sistema.
     */
    public VerificadorDeDiretorio(String caminho) throws FileNotFoundException {
        this.diretorio = new File(caminho);
        if (!diretorio.exists()) {
            throw new FileNotFoundException("Erro: diretório inexistente.");
        }
    }

    /**
     * Método que utiliza recursividade para calcular o tamanho do diretório;
     *
     * @return tamanho do diretório convertido para Megabytes.
     */
    public double calcularTamanho() {
        long totalBytes = calcularTamanhoRecursivo(this.diretorio);
        return (double) totalBytes / (1024 * 1024);
    }

    /**
     * Método auxiliar de recursividade que lista os arquivos do diretório e
     * chama a si mesmo quando encontra um sub-diretório.
     *
     * @param pasta diretório atual.
     * @return tamanho total do diretório atual em bytes.
     */
    private long calcularTamanhoRecursivo(File pasta) {
        long soma = 0;
        File[] conteudo = pasta.listFiles();

        if (conteudo != null) {
            for (File item : conteudo) {
                if (item.isFile()) {
                    soma += item.length();
                } else if (item.isDirectory()) {
                    soma += calcularTamanhoRecursivo(item);
                }
            }
        }
        return soma;
    }
}
