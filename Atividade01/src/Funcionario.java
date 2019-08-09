
public class Funcionario {
    
    public static final int SEXO_MASCULINO = 1;
    public static final int SEXO_FEMININO = 2;
    
    private int matricula;
    private String nome;
    private int sexo;
    private double salario;

    public Funcionario(int matricula, String nome, int sexo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getSexo() {
        return sexo;
    }

    public double getSalario() {
        return salario;
    }
    
    
}
