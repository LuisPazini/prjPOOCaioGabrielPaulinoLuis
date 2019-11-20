package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Curso;

/**
 *
 * @author GABRIEL
 */
public class DaoCurso {

    private Connection conn;

    public DaoCurso(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbCurso("
                    + "sigla,"
                    + "nome,"
                    + "cargaHoraria,"
                    + "valor,"
                    + "dataVigencia,"
                    + "valorHoraInstrutor,"
                    + "programa)"
                    + "VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setInt(3, curso.getCargaHoraria());
            ps.setDouble(4, curso.getValor());
            ps.setString(5, curso.getDataVigencia());
            ps.setDouble(6, curso.getValorHoraInstrutor());
            ps.setString(7, curso.getPrograma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbCurso set nome = ?,"
                    + "cargaHoraria = ?,"
                    + "valor = ?,"
                    + "dataVigencia = ?,"
                    + "valorHoraInstrutor = ?,"
                    + "programa = ?"
                    + "where sigla = ?");

            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getCargaHoraria());
            ps.setDouble(3, curso.getValor());
            ps.setString(4, curso.getDataVigencia());
            ps.setDouble(5, curso.getValorHoraInstrutor());
            ps.setString(6, curso.getPrograma());
            ps.setString(7, curso.getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Curso consultar(String sigla) {
        Curso c = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbCurso where "
                    + "sigla = ?");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                c = new Curso(sigla, rs.getString("nome"));
                c.setCargaHoraria(rs.getInt("cargaHoraria"));
                c.setValor(rs.getDouble("valor"));
                c.setDataVigencia(rs.getString("dataVigencia"));
                c.setValorHoraInstrutor(rs.getDouble("valorHoraInstrutor"));
                c.setPrograma(rs.getString("programa"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (c);
    }

    public void excluir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbCurso where sigla = ?");

            ps.setString(1, curso.getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

}
