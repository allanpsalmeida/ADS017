
import dados.ConexaoBD;
import dados.DadosException;


public class TestaConexaoBD {
    public static void main(String[] args) {
       try {
           ConexaoBD.getConexao();
       } catch (DadosException ex) {
           System.out.println(ex.getMessage());
       }
    }
    
}
