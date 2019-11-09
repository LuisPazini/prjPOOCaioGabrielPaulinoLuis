package fatec.poo.model;

/**
 *
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class APrazo extends Matricula {
    
    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdeMensalidade;

    public APrazo(String data) {
        super(data);
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros*100;
    }

    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }
}
