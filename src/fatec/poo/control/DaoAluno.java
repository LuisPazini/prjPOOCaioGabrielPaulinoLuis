package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;

/**
 *
 * @author GABRIEL
 */
public class DaoAluno {
    
    private Connection conn;

    public DaoAluno(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbAluno("
                    + "nome,"
                    + "DataNasc,"
                    + "endereco,"
                    + "numero,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep,"
                    + "telefone,"
                    + "celular,"
                    + "sexo,"
                    + "estadocivil,"
                    + "rg,"
                    + "cpf,"
                    + "email)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getDataNasc());
            ps.setString(3, aluno.getEndereco());
            ps.setString(4, Integer.toString(aluno.getNumero()));
            ps.setString(5, aluno.getBairro());
            ps.setString(6, aluno.getCidade());
            ps.setString(7, aluno.getEstado());
            ps.setString(8, aluno.getCep());
            ps.setString(9, aluno.getTelefone());
            ps.setString(10, aluno.getCelular());
            ps.setString(11, aluno.getSexo());
            ps.setString(12, aluno.getEstadoCivil());
            ps.setString(13, aluno.getRg());
            ps.setString(14, aluno.getCpf());
            ps.setString(15, aluno.getEmail());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void alterar(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbAluno set nome = ?,"
                    + "DataNasc = ?,"
                    + "endereco = ?,"
                    + "numero = ?,"
                    + "bairro = ?,"
                    + "cidade = ?,"
                    + "estado = ?,"
                    + "cep = ?,"
                    + "telefone = ?,"
                    + "celular = ?,"
                    + "sexo = ?,"
                    + "estadocivil = ?,"
                    + "rg = ?,"
                    + "cpf = ?,"
                    + "email = ?");

            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getDataNasc());
            ps.setString(3, aluno.getEndereco());
            ps.setString(4, Integer.toString(aluno.getNumero()));
            ps.setString(5, aluno.getBairro());
            ps.setString(6, aluno.getCidade());
            ps.setString(7, aluno.getEstado());
            ps.setString(8, aluno.getCep());
            ps.setString(9, aluno.getTelefone());
            ps.setString(10, aluno.getCelular());
            ps.setString(11, aluno.getSexo());
            ps.setString(12, aluno.getEstadoCivil());
            ps.setString(13, aluno.getRg());
            ps.setString(14, aluno.getCpf());
            ps.setString(15, aluno.getEmail());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public Aluno consultar(String CPF) {
        Aluno c = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbAluno where "
                    + "cpf = ?");

            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                c = new Aluno(rs.getString("nome"), CPF);
                c.setDataNasc(rs.getString("datanasc"));
                c.setEndereco(rs.getString("endereco"));
                c.setNumero(rs.getInt("numero"));                
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setCEP(rs.getString("cep"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setSexo(rs.getString("sexo"));
                c.setEstadoCivil(rs.getString("estadocivil"));
                c.setRG(rs.getString("rg"));
                c.setCPF(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (c);
    }
    public void excluir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbAluno where cpf = ?");

            ps.setString(1, aluno.getCpf());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
