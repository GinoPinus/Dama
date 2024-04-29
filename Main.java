import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

/*
 * Data: 29/04/2024
 * Versione: 0.3
 */
public class Main
{
    JFrame f;

    //Parte Sinistra: board
    JPanel pnlsinistra;
    
    JButton btnDamiera[][] = new JButton[8][8];
    JPanel tavolo;
    Main()
    {
        f = new JFrame("Dama");
        f.setVisible(true);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tavolo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        pnlsinistra = new JPanel(new GridLayout(8,8));
        pnlsinistra.setBorder(new EmptyBorder(50, 50, 50, 50));
        pnlsinistra.setPreferredSize(new Dimension(1000, 1000));
        

        boolean temp = false;   //per alternare il marrone e il biege sulla damiera

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

        tavolo.add(pnlsinistra);

        f.add(tavolo,"Center");

    }

    public static void main(String[] args)
    {
        Main oeo = new Main();
    }
}