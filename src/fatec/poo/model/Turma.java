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
    //private String siglaCurso;
    //private String cpfInstrutor;
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
    
    /*public void setSiglaCurso(String siglaCurso) {
        this.siglaCurso = siglaCurso;
    }*/
    
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

    public String getSiglaTurma() {
        return siglaTurma;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public String getObservacoes() {
        return observacoes;
    }
    
    /*public String getSiglaCurso() {
        return siglaCurso;
    }*/

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    /*public String getCpfInstrutor() {
        return cpfInstrutor;
    }

    public void setCpfInstrutor(String cpfInstrutor) {
        this.cpfInstrutor = cpfInstrutor;
    }*/
    
}
