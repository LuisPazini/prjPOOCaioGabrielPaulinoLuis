package fatec.poo.model;

/**
 *
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class APrazo {
    
    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdeMensalidade;
    private String dataMatricula;
    private String cpf;
    private String siglaTurma;

    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
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

    public String getDtVencimento() {
        return dtVencimento;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public int getQtdeMensalidade() {
        return qtdeMensalidade;
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
