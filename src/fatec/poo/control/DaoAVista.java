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
                    + "and cpfAluno = ?,"
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
                v.setValor(rs.getDouble("valor"));
                v.setAgencia(rs.getInt("agencia"));
                v.setNCheque(rs.getInt("nCheque"));
                v.setPreData(rs.getString("preData"));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (v);
    }
}
