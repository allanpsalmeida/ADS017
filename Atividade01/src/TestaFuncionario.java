
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(12345, "João",
            Funcionario.SEXO_MASCULINO, 1000);
//        System.out.println(funcionario.getMatricula() + " - "
//        + funcionario.getNome() + " - "
//        + funcionario.getSexo() + " - "         
//        + funcionario.getSalario());
        System.out.println(funcionario);
          }

}
