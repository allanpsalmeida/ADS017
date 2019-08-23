
import javax.swing.JDialog;


public class TestaCaixaDialogo {
    public static void main(String[] args) {
    JDialog caixaDialogo = new JDialog();
    caixaDialogo.setTitle("Caixa de diálogo");
    caixaDialogo.setSize(320, 240);
    caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    caixaDialogo.setVisible(true);
    }
}
