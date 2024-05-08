import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

/*
 
 */
public class Dama {
    JFrame f;

    // Parte Sinistra: board
    JPanel pnlsinistra;

    JButton btnDamiera[][] = new JButton[8][8];
    JPanel pnlTavolo;

    JLabel lblTurno, lblPunteggioB, lblPunteggioN;
    JPanel pnlTurno, pnlPunteggio;

    JLabel lblBianco = new JLabel();
    JLabel lblNero = new JLabel();

    Pedina n = new Pedina(true);
    Pedina b = new Pedina(false);

    int punteggioB = 12, punteggioN = 12;

    Dama(){
        f = new JFrame("Dama");
        f.setVisible(true);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblTurno = new JLabel("E' il tuo turno");
        lblTurno.setFont(new Font("Calibri", Font.PLAIN, 24));
        pnlTurno = new JPanel(new GridLayout(1, 1));
        pnlTurno.add(lblTurno);
        pnlTurno.setBorder(new EmptyBorder(20, 450, 0, 0));

        lblPunteggioB = new JLabel("X "+punteggioB);
        lblPunteggioB.setFont(new Font("Arial", Font.PLAIN, 75));

        lblPunteggioN = new JLabel("X "+punteggioN);
        lblPunteggioN.setFont(new Font("Arial", Font.PLAIN, 75));

        pnlPunteggio = new JPanel(new GridLayout(2, 2));

        lblBianco.setIcon(b.imgPedina);
        pnlPunteggio.add(lblBianco);

        pnlPunteggio.add(lblPunteggioB);

        lblNero.setIcon(n.imgPedina);
        pnlPunteggio.add(lblNero);

        pnlPunteggio.add(lblPunteggioN);
        pnlPunteggio.setBorder(new EmptyBorder(0, 0, 0, 200));

        pnlTavolo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlsinistra = new JPanel(new GridLayout(8, 8));
        pnlsinistra.setBorder(new EmptyBorder(30, 50, 50, 50));
        pnlsinistra.setPreferredSize(new Dimension(1000, 1000));

        boolean temp = false; // per alternare il marrone e il biege sulla damiera

        int cN = 0, cB = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                btnDamiera[i][j] = new JButton();
                btnDamiera[i][j].addActionListener(new SelezionePedina());
                if (temp) {
                    btnDamiera[i][j].setBackground(new Color(240, 222, 173));
                    temp = false;
                } else {
                    btnDamiera[i][j].setBackground(new Color(69, 47, 28));
                    if (cN > 19) {
                        btnDamiera[i][j].setIcon(b.imgPedina);
                        // btnDamiera[i][j].setText("N");
                    }

                    if (cB < 12) {
                        btnDamiera[i][j].setIcon(n.imgPedina);
                        // btnDamiera[i][j].setText("B");
                        cB++;
                    }
                    cN++;
                    temp = true;
                }
                pnlsinistra.add(btnDamiera[i][j]);

            }

            if (temp) {
                temp = false;
            } else {
                temp = true;
            }
        }

        pnlTavolo.add(pnlsinistra);

        f.add(pnlTavolo, "Center");
        f.setMinimumSize(new Dimension(1300, 1300));
        
        f.add(pnlTurno, "North");
        f.add(pnlPunteggio, "East");
    }
    JButton btnPosto1 = null;
    class SelezionePedina implements ActionListener {         public void actionPerformed(ActionEvent e) {
            JButton btnTemp = (JButton) e.getSource();
            if(btnPosto1 == null){
                if(btnTemp.getIcon()==new ImageIcon("img/pedinaB.png")){
                    btnPosto1 = btnTemp;
                }else{
                    
                    //qua possiamo mettere un colore rosso che durera mezzo secondo 
                }
            }else if(btnPosto1 != null){
                
                //qua dobbiamo fare il controllore con le regole del gioco(se la pedina puo andare in quel posto oppure no)
                btnPosto1 = null;
            }
        }
    }

    public static void main(String[] args) {
        new Dama();
    }
}