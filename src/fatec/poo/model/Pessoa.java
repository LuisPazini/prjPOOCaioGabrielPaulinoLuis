package fatec.poo.model;

import java.util.InputMismatchException;

/**
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 * 
 */
public class Pessoa {

    private String nome;
    private String dataNasc;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String sexo;
    private String estadoCivil;
    private String rg;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public static boolean validarCPF(String cpf){
        
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-","");
       
        if (cpf.equals("00000000000") ||
            cpf.equals("11111111111") ||
            cpf.equals("22222222222") || 
            cpf.equals("33333333333") ||
            cpf.equals("44444444444") || 
            cpf.equals("55555555555") ||
            cpf.equals("66666666666") || 
            cpf.equals("77777777777") ||
            cpf.equals("88888888888") || 
            cpf.equals("99999999999") ||
           (cpf.length() != 11))
            return(false);
          
        char dig10, dig11;
        int sm, i, r, num, peso;
          
        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {                    
                num = (int)(cpf.charAt(i) - 48); 
                sm = sm + (num * peso);
                peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)){
                dig10 = '0';
            }
            else{
                dig10 = (char)(r + 48);
            }

            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)){
                dig11 = '0';
            }  
            else{
                dig11 = (char)(r + 48);
            }
          
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))){
                return(true);
            }
                 
            else {
                return(false);
            }
            } catch (InputMismatchException erro) {
                return(false);
            }
        }
   
}
