/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.APrazo;
import fatec.poo.model.AVista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 0030481813010
 */
public class DaoAVista {
    private Connection conn;
     
    public DaoAVista(Connection conn) {
        this.conn = conn;
    }
    
    public AVista consultar(String data, String cpf, String siglaTurma) {
        AVista v = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbAVista"
                    + "WHERE dataMatricula = ?,"
                    + "and cpf = ?,"
                    + "and siglaTurma= ?");
            
            ps.setString(1, data);
            ps.setString(2, cpf);
            ps.setString(3, siglaTurma);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                v = new AVista();
                v.setCpf(cpf);
                v.setDataMatricula(data);
                v.setSiglaTurma(siglaTurma);
                v.setAgencia(rs.getInt("Agencia"));
                v.setNCheque(rs.getInt("NCheque"));
                v.setPreData(rs.getString("PreData"));
                v.setValor(rs.getDouble("Valor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (v);
    }
}
