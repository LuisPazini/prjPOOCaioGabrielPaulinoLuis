package fatec.poo.model;

/**
 *
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class AVista extends Matricula{
    
    private double valor;
    private int agencia;
    private int nCheque;
    private String preData;
    private Matricula matricula;

    public AVista(String data) {
        super(data);
    }
    
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
}
