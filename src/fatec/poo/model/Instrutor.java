package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 *
 */
public class Instrutor extends Pessoa {

    private String formacao;
    private String areaAtuacao;
    private ArrayList<Turma> turmas;

    public Instrutor(String nome, String cpf) {
        super(nome, cpf);
        turmas = new ArrayList<Turma>();
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void addTurma(Turma t) {
        turmas.add(t);
        t.setInstrutor(this);
    }
    
    public void removeTurma(Turma t){
        turmas.remove(t);
        t.setInstrutor(null);
    }

    public String getFormacao() {
        return formacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

}
