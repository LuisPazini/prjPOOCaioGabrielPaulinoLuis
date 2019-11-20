package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Turma;

/**
 *
 * @author GABRIEL
 */
public class DaoTurma {
    
    private Connection conn;

    public DaoTurma(Connection conn) {
        this.conn = conn;
    }
    
    
    
}
