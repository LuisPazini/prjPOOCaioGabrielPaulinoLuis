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
    
    public APrazo consultar(String data, String cpf, String siglaTurma) {
        APrazo p = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbAPrazo"
                    + "WHERE dataMatricula = ?,"
                    + "and cpf = ?,"
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
                p.setDtVencimento(rs.getString("DtVencimento"));
                p.setQtdeMensalidade(rs.getInt("QtdeMensalidade"));
                p.setTaxaJuros(rs.getDouble("TaxaJuros"));
                p.setValor(rs.getDouble("Valor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (p);
    }
}
