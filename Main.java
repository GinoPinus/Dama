import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

/*
 * Data: 29/04/2024
 * Versione: 0.4
 */
public class Main
{
    JFrame f;

    //Parte Sinistra: board
    JPanel pnlsinistra;
    
    JButton btnDamiera[][] = new JButton[8][8];
    JPanel pnlTavolo;

    JLabel lblTurno;
    JPanel pnlTurno;

    ImageIcon pedinaB = new ImageIcon("img/pedinaB.png");
    ImageIcon pedinaN = new ImageIcon("img/pedinaN.png");
    Main()
    {
        f = new JFrame("Dama");
        f.setVisible(true);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblTurno = new JLabel("E' il tuo turno");
        lblTurno.setFont(new Font("Calibri", Font.PLAIN, 24));
        pnlTurno = new JPanel(new GridLayout(1,1));
        pnlTurno.add(lblTurno);
        pnlTurno.setBorder(new EmptyBorder(20,440,0,0));

        pnlTavolo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //
        Image img = pedinaN.getImage() ;  
        Image newimg = img.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
        pedinaN = new ImageIcon( newimg );

        Image img1 = pedinaB.getImage() ;  
        Image newimg1 = img1.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
        pedinaB = new ImageIcon( newimg1 );
        //
        pnlsinistra = new JPanel(new GridLayout(8,8));
        pnlsinistra.setBorder(new EmptyBorder(30, 50, 50, 50));
        pnlsinistra.setPreferredSize(new Dimension(1000, 1000));
        

        boolean temp = false;   //per alternare il marrone e il biege sulla damiera

        int cN=0,cB=0;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                
                btnDamiera[i][j] = new JButton();
                if (temp)
                {
                    btnDamiera[i][j].setBackground(new Color(240, 222, 173));
                    temp = false;
                }
                else
                {
                    btnDamiera[i][j].setBackground(new Color(69, 47, 28));
                    if(cN>19){
                        btnDamiera[i][j].setIcon(pedinaB);
                       // btnDamiera[i][j].setText("N");
                    }

                    if(cB<12){
                        btnDamiera[i][j].setIcon(pedinaN);
                       // btnDamiera[i][j].setText("B");
                        cB++;
                    }
                    cN++;
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

        pnlTavolo.add(pnlsinistra);

        f.add(pnlTavolo,"Center");
        f.setMinimumSize(new Dimension(1300, 1300));;

        f.add(pnlTurno,"North");
    }

    /*
    class InteragisciPezzi
    {

        class SelezionePedina implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand() == "N")
                {
                    e.
                }
            }
        }
    }
    */

    public static void main(String[] args)
    {
        Main oeo = new Main();
    }
}