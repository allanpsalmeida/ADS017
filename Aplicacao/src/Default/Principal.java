
package Default;

import apresentacao.JFramePrincipal;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Principal {
    public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (UnsupportedLookAndFeelException e) {
    
    } catch (ClassNotFoundException e) {
    
    } catch (InstantiationException e) {
    
    } catch (IllegalAccessException e){
    
    }
    JFramePrincipal janela = new JFramePrincipal();
    janela.setVisible(true);
}

}
