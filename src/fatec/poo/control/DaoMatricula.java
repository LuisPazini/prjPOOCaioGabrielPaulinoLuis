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
public class DaoMatricula {
     private Connection conn;
     
    public DaoMatricula(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbMatricula("
                    + "cpfAluno,"
                    + "siglaTurma,"
                    + "data,"
                    + "qtdeFaltas,"
                    + "nota) "
                    + "VALUES(?,?,?,?,?)");
            
            ps.setString(1, matricula.getAluno().getCpf());
            ps.setString(2, matricula.getTurma().getSiglaTurma());
            ps.setString(3, matricula.getData());
            ps.setInt(4, matricula.getQtdeFaltas());
            ps.setDouble(5, matricula.getNota());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void alterar(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbMAtricula SET "
                    + "data = ?,"
                    + "qtdeFaltas = ?,"
                    + "nota = ?"
                    + "WHERE cpfAluno = ?"
                    + "and siglaTurma = ?");

            ps.setString(1, matricula.getData());
            ps.setInt(2, matricula.getQtdeFaltas());
            ps.setDouble(3, matricula.getNota());
            ps.setString(4, matricula.getAluno().getCpf());
            ps.setString(5, matricula.getTurma().getSiglaTurma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public Matricula consultar(String cpf, String siglaTurma) {
        Aluno a = null;
        Turma t = null;
        APrazo p = null;
        AVista v = null;
        Matricula m = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbMatricula"
                    + "WHERE cpfAluno = ?"
                    + "and siglaTurma= ?");

            ps.setString(1, cpf);
            ps.setString(2, siglaTurma);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                a = new DaoAluno(conn).consultar(cpf);
                t = new DaoTurma(conn).consultar(siglaTurma);
                p = new DaoAPrazo(conn).consultar(rs.getString("data"), cpf, siglaTurma);
                v = new DaoAVista(conn).consultar(rs.getString("data"), cpf, siglaTurma);
                m = new Matricula(rs.getString("data"));
                m.setAluno(a);
                m.setTurma(t);
                m.setaPrazo(p);
                m.setaVista(v);
                m.setQtdeFaltas(rs.getInt("qtdeFaltas"));
                m.setNota(rs.getDouble("nota")); 
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (m);
    }
    public void excluir(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbMatricula WHERE cpfAluno = ? and siglaTurma = ?");

            ps.setString(1, matricula.getAluno().getCpf());
            ps.setString(2, matricula.getTurma().getSiglaTurma());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
