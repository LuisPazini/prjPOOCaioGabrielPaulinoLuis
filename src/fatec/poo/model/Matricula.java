package fatec.poo.model;

/**
 *
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class Matricula {
    
    private String data;
    private int qtdeFaltas;
    private double nota;
    private Turma turma;
    private Aluno aluno;
    private APrazo aPrazo;
    private AVista aVista;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public Turma getTurma(){
        return turma;
    }
    
    public void setTurma (Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    /*Tipo de Matrícula:
     *  1- A Vista
     *  2- A Prazo
    
    
    public void setTipoMatricula(int tipoMatricula){
        if(tipoMatricula == 1){
            aVista = new AVista(this.data);
        }else if(tipoMatricula == 2){
            aPrazo = new APrazo(this.data);
        }
    }
    */
    //public abstract void emitirCarne();
}
