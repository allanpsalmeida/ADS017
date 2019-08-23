
import javax.swing.JFrame;


public class JanelaPrincipal extends JFrame {
   
    private JanelaSobre janelaSobre;

    public JanelaPrincipal() {
        this.janelaSobre = new JanelaSobre(this, true);
    }
    
        public void exibir () {
            setSize(640, 480);
            setTitle("Aplicação GUI");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            setVisible(true);
            janelaSobre.exibir();
            
            

        }
}
