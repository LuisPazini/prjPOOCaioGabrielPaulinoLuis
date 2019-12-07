package fatec.poo.model;

/**
 *
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class AVista {
    
    private double valor;
    private int agencia;
    private int nCheque;
    private String preData;
    private String dataMatricula;
    private String cpf;
    private String siglaTurma;
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNCheque(int nCheque) {
        this.nCheque = nCheque;
    }

    public void setPreData(String preData) {
        this.preData = preData;
    }

    public void setDataMatricula(String DataMatricula) {
        this.dataMatricula = DataMatricula;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSiglaTurma(String siglaTurma) {
        this.siglaTurma = siglaTurma;
    }

    public double getValor() {
        return valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getnCheque() {
        return nCheque;
    }

    public String getPreData() {
        return preData;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSiglaTurma() {
        return siglaTurma;
    }
    

    
}
