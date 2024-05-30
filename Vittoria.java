
import java.awt.*;
import javax.swing.*;

public class Vittoria{
    JFrame jFrame;
    JLabel jLabel;

    public Vittoria(boolean vincitore){
        //Costruttore
        jFrame = new JFrame("Vittoria!");
        ImageIcon imgBackground = new ImageIcon("img/coriandoli.png");
        JLabel lblBackg = new JLabel(imgBackground);
        jFrame.setContentPane(lblBackg);

        jLabel = new JLabel();
        jFrame.setLayout(new BorderLayout());

        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.CENTER);

        jFrame.add(jLabel, BorderLayout.CENTER);
        jFrame.setSize(600,500);
        jFrame.setLocation(700,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Vittoria(true);
    }
}