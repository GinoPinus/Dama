import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Data: 28/04/2024
 * Versione: 0.1
 */
public class Main
{
    JFrame f;

    //Parte Sinistra: board
    JPanel pnlsinistra;
    
    Main()
    {
        f = new JFrame("Dama");
        f.setVisible(true);
        f.setSize(800,800);
        f.setLocation(550,150);
        f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlsinistra = new JPanel(new GridLayout());
    }

    public static void main(String[] args)
    {
        Main oeo = new Main();
    }
}