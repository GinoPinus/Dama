import java.awt.BorderLayout;
import javax.swing.*;

public class Vittoria{
    JFrame jFrame;
    JLabel jLabel;

    public Vittoria(boolean vincitore){
        //Costruttore
        jFrame = new JFrame("Vittoria!");
        jLabel = new JLabel();
        jFrame.setLayout(new BorderLayout());

        if (vincitore)  //false = bianco, true = nero
        {
            jLabel.setText("Nero ha vinto!!");
        }
        else
        {
            jLabel.setText("Bianco ha vinto!!");
        }

        jFrame.add(jLabel, BorderLayout.CENTER);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Vittoria(true);
    }
}