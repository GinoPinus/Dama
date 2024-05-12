import java.awt.Image;
import javax.swing.ImageIcon;

public class Pedina {
    int nPedine = 12;
    ImageIcon imgPedina;
    ImageIcon imgDama;

    Pedina(boolean colore) // 0 se è bianco, 1 se è nero
    {
        if (colore == false) {
            imgPedina = new ImageIcon("img/pedinaB.png");
            Image img = imgPedina.getImage();
            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            imgPedina = new ImageIcon(newimg);

            imgDama = new ImageIcon("img/reginaB.png");
            Image imgt = imgDama.getImage();
            Image newimgt = imgt.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            imgDama = new ImageIcon(newimgt);
        } else {
            imgPedina = new ImageIcon("img/pedinaN.png");
            Image img = imgPedina.getImage();
            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            imgPedina = new ImageIcon(newimg);

            imgDama = new ImageIcon("img/reginaN.png");
            Image imgt = imgDama.getImage();
            Image newimgt = imgt.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            imgDama = new ImageIcon(newimgt);
        }
    }
}