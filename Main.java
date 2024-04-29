import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Data: 29/04/2024
 * Versione: 0.2
 */
public class Main
{
    JFrame f;

    //Parte Sinistra: board
    JPanel pnlsinistra;
    
    JButton btnDamiera[][] = new JButton[8][8];
    
    Main()
    {
        f = new JFrame("Dama");
        f.setVisible(true);
        f.setSize(800,800);
        f.setLocation(550,150);
        f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlsinistra = new JPanel(new GridLayout(8,8));
        pnlsinistra.setPreferredSize(new Dimension(600, 600));
        pnlsinistra.setMaximumSize(new Dimension(700, 700));
        f.add(pnlsinistra, BorderLayout.CENTER);

        boolean temp = false;   //per alternare il bianco e il nero sulla damiera

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                btnDamiera[i][j] = new JButton("" + (i + 1) + " " + (j + 1));
                if (temp)
                {
                    btnDamiera[i][j].setBackground(new Color(240, 222, 173));
                    temp = false;
                }
                else
                {
                    btnDamiera[i][j].setBackground(new Color(69, 47, 28));
                    temp = true;
                }
                pnlsinistra.add(btnDamiera[i][j]);
            }

            if (temp)
            {
                temp = false;
            }
            else
            {
                temp = true;
            }
        }
    }

    public static void main(String[] args)
    {
        Main oeo = new Main();
    }
}