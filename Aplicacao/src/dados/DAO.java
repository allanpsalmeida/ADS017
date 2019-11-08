
package dados;

import java.util.List;


public interface DAO<T> {
    
    void incluir(T entidade) throws DadosException;
    void alterar(T entidade) throws DadosException;
    void excluir(int id) throws DadosException;
    T consultar(int id) throws DadosException;
    List<T> listar() throws DadosException;
    
}
