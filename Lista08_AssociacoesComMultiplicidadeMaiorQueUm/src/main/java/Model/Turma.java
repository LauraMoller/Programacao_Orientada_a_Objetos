package Model;

import java.util.ArrayList;

/**
 * Classe que representa uma turma acadêmica.
 *
 * @author Laura Möller
 */
public class Turma {

    /**
     * Variável de Instância que armazena o nome da disciplina.
     */
    private String disciplina;
    /**
     * Variável de Instância que armazena o turno da turma.
     */
    private Turno turno;
    /**
     * Variável de Instância que armazena o registro de todos os alunos da
     * turma.
     */
    private ArrayList<Aluno> alunos;
    /**
     * Variável de Instância que armazena o professor da disciplina.
     */
    private Professor professor;

    /**
     * Construtor da classe que define que a turma tem nome, turno e professor.
     *
     * @param disciplina nome da disciplina.
     * @param turno turno da disciplina.
     * @param professor professor da turma.
     */
    public Turma(String disciplina, Turno turno, Professor professor) {
        setDisciplina(disciplina);
        setTurno(turno);
        setProfessor(professor);
        alunos = new ArrayList<>();
    }

    /**
     * Método que acessa a variável de instância que armazena o nome da
     * disciplina.
     *
     * @return nome da disciplina.
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Método que acessa a variável de instância que armazena o nome da
     * disciplina.
     *
     * @param disciplina nome desejado para a disciplina.
     * @throws IllegalArgumentException caso o nome da disciplina esteja em
     * branco.
     */
    public void setDisciplina(String disciplina) throws IllegalArgumentException {
        if (disciplina.isBlank()) {
            throw new IllegalArgumentException("Erro: nome informado para disciplina é vazio.");
        }

        this.disciplina = disciplina;
    }

    /**
     * Método que acessa a variável de instância que armazena o professor.
     *
     * @return professor.
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * Método que acessa a variável de instância que armazena o professor.
     *
     * @param professor professor da disciplina.
     * @throws IllegalArgumentException caso o professor informado seja nulo.
     */
    public void setProfessor(Professor professor) throws IllegalArgumentException {
        if (professor == null) {
            throw new IllegalArgumentException("Erro: professor não foi informado.");
        }
        this.professor = professor;
    }

    /**
     * Método que acessa a variável de instância que armazena o turno da turma.
     *
     * @return turno.
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * Método que acessa a variável de instância que armazena o turno.
     *
     * @param turno turno da turma.
     * @throws IllegalArgumentException caso o turno informado seja nulo.
     */
    public void setTurno(Turno turno) throws IllegalArgumentException {
        if (turno == null) {
            throw new IllegalArgumentException("Erro: turno informado é inválido.");
        }
        this.turno = turno;
    }

    /**
     * Método que acessa a variável de instância que armazena os alunos.
     *
     * @return alunos.
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * Método que inclui um aluno na turma.
     *
     * @param aluno aluno que deseja incluir.
     * @throws IllegalArgumentException caso o aluno seja inválido.
     */
    public void incluirAluno(Aluno aluno) throws IllegalArgumentException {
        if (aluno == null) {
            throw new IllegalArgumentException("Erro: não é possível adicionar um aluno vazio à turma.");
        }
        alunos.add(aluno);
    }

    /**
     * Método que remove um aluno da turma.
     *
     * @param aluno aluno que deseja remover
     * @throws IllegalArgumentException caso o aluno não esteja presente na
     * turma ou seja nulo.
     */
    public void removerAluno(Aluno aluno) throws IllegalArgumentException {
        if (aluno == null) {
            throw new IllegalArgumentException("Erro: não é possível remover um aluno vazio à turma.");
        }
        if (!alunos.contains(aluno)) {
            throw new IllegalArgumentException("Erro: não é possível remover o aluno, pois ele não está na turma.");
        }

        alunos.remove(aluno);
    }

    /**
     * Método que óbtem o aluno cadastro que melhor desempenhou no ENEM.
     *
     * @return aluno de maior nota.
     */
    public Aluno obterAlunoMelhorNotaEnem() {
        if (alunos.isEmpty()) {
            throw new IllegalArgumentException("Erro: não há alunos cadastrados na turma, portanto não há um aluno de melhor nota.");
        }
        Aluno melhorNota = alunos.getFirst();
        for (Aluno aluno : alunos) {
            if (melhorNota.getNotaEnem() < aluno.getNotaEnem()) {
                melhorNota = aluno;
            }
        }
        return melhorNota;
    }
}
