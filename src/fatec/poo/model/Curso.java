package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class Curso {
    
    private String sigla;
    private String nome;
    private int cargaHoraria;
    private double valor;
    private String dataVigencia;
    private double valorHoraInstrutor;
    private String programa;
    private ArrayList <Turma> turmas;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        turmas = new ArrayList <Turma>();
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataVigencia(String dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public void setValorHoraInstrutor(double valorHoraInstrutor) {
        this.valorHoraInstrutor = valorHoraInstrutor;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    public void addTurma (Turma t) {
        turmas.add(t);
        t.setCurso(this);
    }
       
}
