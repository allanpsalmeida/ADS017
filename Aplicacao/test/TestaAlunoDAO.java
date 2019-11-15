
import dados.Aluno;
import dados.AlunoDAO;
import dados.DadosException;


public class TestaAlunoDAO {
    public static void main(String[] args) {
        AlunoDAO dao = new AlunoDAO();
            try {
                for (Aluno aluno : dao.listar()) {
                    System.out.println(aluno);
                }
                                
            Aluno aluno = new Aluno();
            aluno.setMatricula(2019300);
            aluno.setNome("PAULO");
            dao.incluir(aluno);
            
            aluno = dao.consultar(1);
            
            aluno.setNome("ANGELICA");
            dao.alterar(aluno);
            
            dao.excluir(2);
            
            } catch (DadosException ex) {
                System.err.println(ex.getMessage() + ex.getCause().getMessage());
            }
            
                    
    }
}
