package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Instrutor;

/**
 *
 * @author GABRIEL
 */
public class DaoInstrutor {
    
    private Connection conn;

    public DaoInstrutor(Connection conn) {
        this.conn = conn;
    }
    
    
    
}
