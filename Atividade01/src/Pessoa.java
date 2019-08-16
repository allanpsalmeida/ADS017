
public abstract class Pessoa {
    
    public static final int SEXO_MASCULINO = 1;
    public static final int SEXO_FEMININO = 2;
    
    
    private String nome;
    private int sexo;
    
    public Pessoa(String nome, int sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    
    public String getNome() {
        return nome;
    }

    public int getSexo() {
        return sexo;
    }

    
}
