
import java.awt.Frame;
import javax.swing.JDialog;


public class JanelaSobre extends JDialog {

    public JanelaSobre(Frame owner, boolean modal) {
        super(owner, modal);
    }
    
    public void exibir () {
        setSize(320,240);
        setTitle("Sobre...");
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
