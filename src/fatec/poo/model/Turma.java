package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class Turma {
    
    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdVagas;
    private String observacoes;
    private Instrutor instrutor;
    private ArrayList<Matricula> matriculas;
    private Curso curso;

    public Turma(String siglaTurma, String descricao) {
        this.siglaTurma = siglaTurma;
        this.descricao = descricao;
        matriculas = new ArrayList<Matricula>();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public Instrutor getInstrutor(){
        return instrutor;
    }
    
    public void setInstrutor (Instrutor instrutor){
        this.instrutor = instrutor;
    }
    
    public void addMatricula (Matricula m) {
        matriculas.add(m);
        m.setTurma(this);
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso (Curso curso) {
        this.curso = curso;
    }
        
    //public void emitirListaFrequencia();
}
