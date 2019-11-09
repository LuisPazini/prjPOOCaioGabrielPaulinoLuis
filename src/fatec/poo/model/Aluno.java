package fatec.poo.model;

/**
 *
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class Aluno extends Pessoa {

    private String escolaridade;
    private Matricula matricula;
    

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }
    
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    
    public void setMatricula (Matricula m) {
        matricula = m;
        m.setAluno(this);
    }
}
