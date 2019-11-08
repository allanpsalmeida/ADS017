
package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAO implements DAO<Aluno>{

    private Connection conexao;
    @Override
    public void incluir(Aluno entidade) throws DadosException {
        conexao = ConexaoBD.getConexao();
        
        String sql = "INSERT INTO alunos(matricula, nome) VALUES (?, ?)";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, entidade.getMatricula());
            comando.setString(2, entidade.getNome());
            comando.execute();
            comando.close();
        } catch (SQLException ex) {
         throw new DadosException("Erro ao incluir aluno!", ex);
        }
    }

    @Override
    public void alterar(Aluno entidade) throws DadosException {
        conexao = ConexaoBD.getConexao();
        
        String sql = "UPDATE alunos SET matricula=?, nome=? WHERE id=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, entidade.getMatricula());
            comando.setString(2, entidade.getNome());
            comando.setInt(3, entidade.getId());
            comando.execute();
            comando.close();
        } catch (SQLException ex) {
         throw new DadosException("Erro ao alterar aluno!", ex);
        }
    }


    @Override
    public void excluir(int id) throws DadosException {
 conexao = ConexaoBD.getConexao();
        
        String sql = "DELETE FROM alunos WHERE id=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, id);
            comando.execute();
            comando.close();
        } catch (SQLException ex) {
         throw new DadosException("Erro ao excluir aluno!", ex);
        }
    }    

    @Override
    public Aluno consultar(int id) throws DadosException {
        Aluno aluno = new Aluno(); 
        conexao = ConexaoBD.getConexao();
         
        String sql = "SELECT * FROM alunos WHERE id=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()){
                aluno.setId(resultado.getInt("id"));
                aluno.setMatricula(resultado.getInt("matricula"));
                aluno.setNome(resultado.getString("nome"));
            }
            comando.close();
        } catch (SQLException ex) {
         throw new DadosException("Erro ao consultar aluno!", ex);
        } return aluno;
    }

    @Override
    public List<Aluno> listar() throws DadosException {
        List<Aluno> lista = new ArrayList<Aluno>(); 
        
        conexao = ConexaoBD.getConexao();
         
        String sql = "SELECT * FROM alunos WHERE id=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, 1);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()){
                lista.setId(resultado.getInt("id"));
                lisa.setMatricula(resultado.getInt("matricula"));
                aluno.setNome(resultado.getString("nome"));
            }
            comando.close();
        } catch (SQLException ex) {
         throw new DadosException("Erro ao consultar aluno!", ex);
        } return aluno;
    }
    
}
