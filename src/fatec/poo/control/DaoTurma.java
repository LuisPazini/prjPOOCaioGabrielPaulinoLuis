package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Turma;

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
    
    public void inserir(Turma turma){
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("INSERT INTO tbTurma("
                    + "siglaTurma,"
                    + "descricao,"
                    + "dataInicio,"
                    + "dataTermino,"
                    + "periodo,"
                    + "qtdVagas,"
                    + "observacoes)"
                    + "VALUES(?,?,?,?,?,?,?)");
            
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getDescricao());
            ps.setString(3, turma.getDataInicio());
            ps.setString(4, turma.getDataTermino());
            ps.setString(5, turma.getPeriodo());
            ps.setInt(6, turma.getQtdVagas());
            ps.setString(7, turma.getObservacoes());
            
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
