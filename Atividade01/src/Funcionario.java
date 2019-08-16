
public class Funcionario extends Pessoa {
    
    private int matricula;
    private double salario;

    public Funcionario(String nome, int sexo) {
    super(nome, sexo);
    }
    
    public Funcionario(int matricula, String nome, int sexo, double salario) {
        this(nome, sexo);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" 
                +"nome=" + getNome()
                +", sexo=" + getSexo()
                + "matricula=" + getMatricula() 
                + ", salario=" + getSalario() + '}';
    }
    
    
}
