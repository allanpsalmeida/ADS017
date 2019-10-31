
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class FormularioCampoSelecao extends JFrame {
    public static void main(String[] args) {
        String[] arrayUF = new String[] {"DF", "GO"};
        JComboBox comboUF = new JComboBox(arrayUF);
        String[] arrayMunicipio = {"Brasília", "Taguatinga", "Sobradinho"};
  listaMunicipio = new JList(arrayMunicipio); 
    }
}
