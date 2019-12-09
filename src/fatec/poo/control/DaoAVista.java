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
    /*private double valor;
    private int agencia;
    private int nCheque;
    private String preData;
    private String dataMatricula;
    private String cpf;
    private String siglaTurma;*/
    public void inserir(AVista avista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbAVista("
                    + "valor,"
                    + "agencia,"
                    + "nCheque,"
                    + "preData,"
                    + "dataMatricula,"
                    + "cpfAluno,"
                    + "siglaTurma) "
                    + "VALUES(?,?,?,?,?,?,?)");
            
            ps.setDouble(1, avista.getValor());
            ps.setInt(2, avista.getAgencia());
            ps.setInt(3, avista.getnCheque());
            ps.setString(4, avista.getPreData());
            ps.setString(5, avista.getDataMatricula());
            ps.setString(6, avista.getCpf());
            ps.setString(7, avista.getSiglaTurma());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(AVista avista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbAVista SET "
                    + "valor = ?,"
                    + "agencia = ?,"
                    + "nCheque = ?,"
                    + "preData = ?"
                    + "WHERE dataMatricula = ?"
                    + "and cpfAluno = ?"
                    + "and siglaTurma = ?");

            ps.setDouble(1, avista.getValor());
            ps.setInt(2, avista.getAgencia());
            ps.setInt(3, avista.getnCheque());
            ps.setString(4, avista.getPreData());
            ps.setString(5, avista.getDataMatricula());
            ps.setString(6, avista.getCpf());
            ps.setString(7, avista.getSiglaTurma());
            

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
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
    public void excluir(AVista avista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbAVista WHERE cpfAluno = ? "
                    + "and siglaTurma = ? "
                    + "and dataMatricula = ?");

            ps.setString(1, avista.getCpf());
            ps.setString(2, avista.getSiglaTurma());
            ps.setString(3, avista.getDataMatricula());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
