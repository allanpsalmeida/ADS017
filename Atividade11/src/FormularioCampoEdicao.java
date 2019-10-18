
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormularioCampoEdicao {
   public static void main(String[] args) {
   JButton botaoAdicionar = new JButton();
   JTextField campoTexto  = new JTextField();
   JTextArea  areaTexto = new JTextArea();
   
   
}

    public FormularioCampoEdicao() {
         JButton botaoAdicionar  = new JButton("Adicionar");
         JTextField campoTexto = new JTextField(20);
         JTextArea areaTexto = new JTextArea(20, 5);
         areaTexto.setText("Digite um texto:");
         JPanel painelPrincipal = new JPanel();
         JPanel leiaute
         
         GridLayout leiaute = new GridLayout(5, 1);
    }
 
}
