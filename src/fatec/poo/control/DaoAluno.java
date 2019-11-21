package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Aluno;

/**
 *
 * @author Augusto
 */
public class DaoAluno {
    
    private Connection conn;

    public DaoAluno(Connection conn) {
        this.conn = conn;
    }
    
    
    
}
