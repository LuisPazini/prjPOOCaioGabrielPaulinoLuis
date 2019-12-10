/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.APrazo;
import fatec.poo.model.AVista;
import fatec.poo.model.Aluno;
import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 0030481813010
 */
public class DaoAPrazo {
    
    private Connection conn;
    
    public DaoAPrazo(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(APrazo aprazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbAPrazo("
                    + "valor,"
                    + "dtVencimento,"
                    + "taxaJuros,"
                    + "qtdeMensalidade,"
                    + "dataMatricula,"
                    + "cpfAluno,"
                    + "siglaTurma) "
                    + "VALUES(?,?,?,?,?,?,?)");
            
            ps.setDouble(1, aprazo.getValor());
            ps.setString(2, aprazo.getDtVencimento());
            ps.setDouble(3, aprazo.getTaxaJuros());
            ps.setInt(4, aprazo.getQtdeMensalidade());
            ps.setString(5, aprazo.getDataMatricula());
            ps.setString(6, aprazo.getCpf());
            ps.setString(7, aprazo.getSiglaTurma());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(APrazo aprazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbAPrazo SET "
                    + "valor = ?,"
                    + "dtVencimento = ?,"
                    + "taxaJuros = ?,"
                    + "qtdeMensalidade = ?"
                    + "WHERE dataMatricula = ?"
                    + "and cpfAluno = ?"
                    + "and siglaTurma = ?");

            ps.setDouble(1, aprazo.getValor());
            ps.setString(2, aprazo.getDtVencimento());
            ps.setDouble(3, aprazo.getTaxaJuros());
            ps.setInt(4, aprazo.getQtdeMensalidade());
            ps.setString(5, aprazo.getDataMatricula());
            ps.setString(6, aprazo.getCpf());
            ps.setString(7, aprazo.getSiglaTurma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public APrazo consultar(String data, String cpf, String siglaTurma) {
        APrazo p = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbAPrazo"
                    + "WHERE dataMatricula = ?,"
                    + "and cpfAluno = ?,"
                    + "and siglaTurma= ?");
            
            ps.setString(1, data);
            ps.setString(2, cpf);
            ps.setString(3, siglaTurma);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                p = new APrazo();
                p.setCpf(cpf);
                p.setDataMatricula(data);
                p.setSiglaTurma(siglaTurma);
                p.setDtVencimento(rs.getString("dtVencimento"));
                p.setQtdeMensalidade(rs.getInt("qtdeMensalidade"));
                p.setTaxaJuros(rs.getDouble("taxaJuros"));
                p.setValor(rs.getDouble("valor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (p);
    }
    public void excluir(APrazo aprazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbAPrazo WHERE cpfAluno = ? "
                    + "and siglaTurma = ? "
                    + "and dataMatricula = ?");

            ps.setString(1, aprazo.getCpf());
            ps.setString(2, aprazo.getSiglaTurma());
            ps.setString(3, aprazo.getDataMatricula());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
