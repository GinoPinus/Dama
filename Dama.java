import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/*
Versione: 1.0
Data: 12/5/24
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
    Mossa mossa = new Mossa(n, b);

    Icon icnTmp;
    Color clrTemp;
    int i1, j1, i2, j2;

    Color marrone = new Color(69, 47, 28);
    Color beige = new Color(240, 222, 173);

    int turno = 1; // 1 = turno del player 1 / 2 = turno del player 2
    Dama() {
        creaFrame();
        prepDamiera();
    }
    JButton btnPosto1 = null;
    int nColore; // colore della pedina selezionata / n = 0 per il bianco e 1
                 // per il nero
    class SelezionePedina implements ActionListener {
        int punteggioB = 0, punteggioN = 0;
        public void actionPerformed(ActionEvent e) {
            if (turno == 1) {
                JButton btnTemp = (JButton) e.getSource();
                if (btnPosto1 == null) {
                    if (btnTemp.getIcon() == b.imgPedina || btnTemp.getIcon() == b.imgDama) {
                        btnPosto1 = btnTemp;
                        nColore = 0;
                        if (btnTemp.getIcon() == b.imgDama) {
                            nColore = 2;
                        }
                    } else {
                        nColore = -1;
                    }
                    // per salvare le coordinate della pedina
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (btnTemp == btnDamiera[i][j]) {
                                i1 = i;
                                j1 = j;
                            }
                        }
                    }
                    //
                } else if (btnTemp.getBackground() == marrone && btnTemp.getIcon() == null) {
                    // per salvare le coordinate del posto
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (btnTemp == btnDamiera[i][j]) {
                                i2 = i;
                                j2 = j;
                            }
                        }
                    }
                    //
                    if (mossa.controlloC1(i1, j1, i2, j2, nColore, btnDamiera)) {
                        icnTmp = btnPosto1.getIcon();
                        btnPosto1.setIcon(null);
                        btnTemp.setIcon(icnTmp);
                        // controllo della regina
                        for (int i = 0; i < 8; i++) {
                            if (btnDamiera[0][i].getIcon() == b.imgPedina) {
                                btnDamiera[0][i].setIcon(b.imgDama);
                            }

                            if (btnDamiera[7][i].getIcon() == n.imgPedina) {
                                btnDamiera[7][i].setIcon(n.imgDama);
                            }
                            // controllo del numero delle pedine
                            for (int j = 0; j < 8; j++) {
                                if (btnDamiera[i][j].getIcon() == n.imgPedina || btnDamiera[i][j].getIcon() == n.imgDama) {
                                    punteggioN++;
                                }
                                if (btnDamiera[i][j].getIcon() == b.imgPedina || btnDamiera[i][j].getIcon() == b.imgDama) {
                                    punteggioB++;
                                }
                            }
                        }
                        lblPunteggioB.setText("X " + (Integer.toString(punteggioB)));
                        lblPunteggioN.setText("X " + (Integer.toString(punteggioN)));
                        
                        btnPosto1 = null;
                        turno = 2;
                        if(punteggioB==0){
                            new Vittoria(true);
                        }else if(punteggioN==0){
                            new Vittoria(false);
                        }else{
                            lblTurno.setText("Black's turn");
                        }
                        punteggioB = 0;
                        punteggioN = 0;
                    } else {
                        btnPosto1 = null;
                    }
                } else { // l'errore
                    try {
                        clrTemp = btnTemp.getBackground();
                        TimeUnit.MILLISECONDS.sleep(500);
                        btnTemp.setBackground(clrTemp);
                    } catch (InterruptedException a) {
                        a.printStackTrace();
                    }
                    btnPosto1 = null;
                }

            } else {
                JButton btnTemp = (JButton) e.getSource();
                if (btnPosto1 == null) {
                    if (btnTemp.getIcon() == n.imgPedina || btnTemp.getIcon() == n.imgDama) {
                        btnPosto1 = btnTemp;
                        nColore = 1;
                        if (btnTemp.getIcon() == n.imgDama) {
                            nColore = 3;
                        }
                    } else {
                        nColore = -1;
                    }
                    // per salvare le coordinate della pedina
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (btnTemp == btnDamiera[i][j]) {
                                i1 = i;
                                j1 = j;
                            }
                        }
                    }
                    //
                } else if (btnTemp.getBackground() == marrone && btnTemp.getIcon() == null) {
                    // per salvare le coordinate del posto
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (btnTemp == btnDamiera[i][j]) {
                                i2 = i;
                                j2 = j;
                            }
                        }
                    }
                    if (mossa.controlloC1(i1, j1, i2, j2, nColore, btnDamiera)) {
                        icnTmp = btnPosto1.getIcon();
                        btnPosto1.setIcon(null);
                        btnTemp.setIcon(icnTmp);
                        // controllo della regina
                        for (int i = 0; i < 8; i++) {
                            if (btnDamiera[0][i].getIcon() == b.imgPedina) {
                                btnDamiera[0][i].setIcon(b.imgDama);
                            }

                            if (btnDamiera[7][i].getIcon() == n.imgPedina) {
                                btnDamiera[7][i].setIcon(n.imgDama);
                            }
                            // controllo del numero delle pedine
                            for (int j = 0; j < 8; j++) {
                                if (btnDamiera[i][j].getIcon() == n.imgPedina || btnDamiera[i][j].getIcon() == n.imgDama) {
                                    punteggioN++;
                                }
                                if (btnDamiera[i][j].getIcon() == b.imgPedina || btnDamiera[i][j].getIcon() == b.imgDama) {
                                    punteggioB++;
                                }
                            }
                        }

                        lblPunteggioB.setText("X " + (Integer.toString(punteggioB)));
                        lblPunteggioN.setText("X " + (Integer.toString(punteggioN)));
                        
                        btnPosto1 = null;
                        turno = 1;
                        if(punteggioB==0){
                            new Vittoria(true);
                        }else if(punteggioN==0){
                            new Vittoria(false);
                        }else{
                            lblTurno.setText("White's turn");
                        }
                        
                        punteggioB = 0;
                        punteggioN = 0;
                    } else {
                        btnPosto1 = null;
                    }
                } else { // l'errore
                    try {
                        clrTemp = btnTemp.getBackground();
                        TimeUnit.MILLISECONDS.sleep(500);
                        btnTemp.setBackground(clrTemp);
                    } catch (InterruptedException a) {
                        a.printStackTrace();
                    }
                    btnPosto1 = null;
                }
            }
        }
    }

    void creaFrame()
    {
        f = new JFrame("Dama");
        f.setVisible(true);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblTurno = new JLabel("White's turn");
        lblTurno.setFont(new Font("Calibri", Font.PLAIN, 24));
        pnlTurno = new JPanel(new GridLayout(1, 1));
        pnlTurno.add(lblTurno);
        pnlTurno.setBorder(new EmptyBorder(20, 450, 0, 0));

        lblPunteggioB = new JLabel("X " + b.nPedine);
        lblPunteggioB.setFont(new Font("Arial", Font.PLAIN, 75));

        lblPunteggioN = new JLabel("X " + n.nPedine);
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
    }

    void prepDamiera()
    {
        boolean temp = false; // per alternare il marrone e il biege sulla damiera

        int cN = 0, cB = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                btnDamiera[i][j] = new JButton();
                btnDamiera[i][j].addActionListener(new SelezionePedina());
                if (temp) {
                    btnDamiera[i][j].setBackground(beige);
                    temp = false;
                } else {
                    btnDamiera[i][j].setBackground(marrone);
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

        pnlPunteggio.setBackground(Color.LIGHT_GRAY);
        pnlTurno.setBackground(Color.LIGHT_GRAY);
        pnlsinistra.setBackground(Color.LIGHT_GRAY);
        pnlTavolo.setBackground(Color.LIGHT_GRAY);

        f.add(pnlTurno, "North");
        f.add(pnlPunteggio, "East");
    }
    public static void main(String[] args) {
        new Dama();
    }
}