import java.awt.Image;
import javax.swing.ImageIcon;

public class Pedina {
    int nPedine = 12;
    ImageIcon imgPedina;

    Pedina(boolean colore) // 0 se è bianco, 1 se è nero
    {
        if (colore == false) {
            imgPedina = new ImageIcon("img/pedinaB.png");
            Image img = imgPedina.getImage();
            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            imgPedina = new ImageIcon(newimg);
        } else {
            imgPedina = new ImageIcon("img/pedinaN.png");
            Image img = imgPedina.getImage();
            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            imgPedina = new ImageIcon(newimg);
        }
    }
}
