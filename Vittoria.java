//This class was made with a little help from ChatGPT
import java.awt.*;
import javax.swing.*;

public class Vittoria{
    JFrame jFrame;
    JLabel jLabel;
    ImageIcon imgBackground;

    public Vittoria(boolean vincitore){
        //Costruttore
        jFrame = new JFrame("Victory!");
        if (vincitore)
        {
            imgBackground = new ImageIcon("img/neroVince.png");
        }
        else{
            imgBackground = new ImageIcon("img/biancoVince.png");
        }
        JLabel lblBackg = new JLabel(imgBackground);
        jFrame.setContentPane(lblBackg);

        jLabel = new JLabel();
        jFrame.setLayout(new BorderLayout());

        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.CENTER);

        jFrame.add(jLabel, BorderLayout.CENTER);
        jFrame.setSize(700,500);
        jFrame.setLocation(700,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Vittoria(true);
    }
}