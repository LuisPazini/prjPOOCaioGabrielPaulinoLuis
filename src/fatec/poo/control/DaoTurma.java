package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Turma;
import java.util.ArrayList;

/**
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 */
public class DaoTurma {

    private Connection conn;

    public DaoTurma(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Turma turma) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO tbTurma("
                    + "siglaTurma,"
                    + "descricao,"
                    + "dataInicio,"
                    + "dataTermino,"
                    + "periodo,"
                    + "qtdVagas,"
                    + "observacoes,"
                    + "siglaCurso)"
                    + "VALUES(?,?,?,?,?,?,?,?)");

            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getDescricao());
            ps.setString(3, turma.getDataInicio());
            ps.setString(4, turma.getDataTermino());
            ps.setString(5, turma.getPeriodo());
            ps.setInt(6, turma.getQtdVagas());
            ps.setString(7, turma.getObservacoes());
            ps.setString(8, turma.getSiglaCurso());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbTurma SET "
                    + "descricao = ?,"
                    + "dataInicio = ?,"
                    + "dataTermino = ?,"
                    + "periodo = ?,"
                    + "qtdVagas = ?,"
                    + "observacoes =?,"
                    + "siglaCurso =?"
                    + "WHERE siglaTurma = ?");

            ps.setString(1, turma.getDescricao());
            ps.setString(2, turma.getDataInicio());
            ps.setString(3, turma.getDataTermino());
            ps.setString(4, turma.getPeriodo());
            ps.setInt(5, turma.getQtdVagas());
            ps.setString(6, turma.getObservacoes());
            ps.setString(7, turma.getSiglaCurso());
            ps.setString(8, turma.getSiglaTurma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Turma consultar(String siglaTurma) {
        Turma t = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbTurma WHERE "
                    + "siglaTurma = ?");

            ps.setString(1, siglaTurma);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                t = new Turma(siglaTurma, rs.getString("descricao"));
                t.setDataInicio(rs.getString("dataInicio"));
                t.setDataTermino(rs.getString("dataTermino"));
                t.setPeriodo(rs.getString("periodo"));
                t.setQtdVagas(rs.getInt("qtdVagas"));
                t.setObservacoes(rs.getString("observacoes"));
                t.setSiglaCurso(rs.getString("siglaCurso"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (t);
    }

    public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbTurma WHERE siglaTurma = ?");

            ps.setString(1, turma.getSiglaTurma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public ArrayList<String> listarTurmas(String siglaCurso) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("SELECT siglaTurma FROM tbTurma "
                    + "WHERE siglaCurso = ?");

            ps.setString(1, siglaCurso);
            ResultSet rs = ps.executeQuery();

            ArrayList<String> siglas = new ArrayList<String>();

            while (rs.next()) {

                siglas.add(rs.getString("siglaTurma"));
            }
            return siglas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
}
