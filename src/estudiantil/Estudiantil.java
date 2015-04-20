package estudiantil;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Juan Camilo
 */
public class Estudiantil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Skin para el cambio de apariencia del proyecto.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println("Error en el Skin");
        }
    }

}
