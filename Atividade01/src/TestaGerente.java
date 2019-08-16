
public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(1000, 14567, "Maria",  Pessoa.SEXO_FEMININO, 1000 );
        System.out.println(gerente);
        
        Funcionario funcionario = gerente;
        
        System.out.println(funcionario);
 
                }
    }
