
import javax.swing.JFrame;


public class TesteJanelaPrincipal {
    public static void main(String[] args) {
        
        JFrame janela = new JFrame();
        janela.setTitle("Janela Principal");
        janela.setSize(640, 480);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
