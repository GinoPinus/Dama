import javax.swing.*;

public class Mossa
{
    Pedina Pn;
    Pedina Pb;
    Mossa(Pedina Pn, Pedina Pb)
    {
        this.Pn = Pn;
        this.Pb = Pb;
    }

    boolean controlloC1(int i1, int j1, int i2, int j2, int n, JButton[][] btnDamiera){     //controllo caso    / n = 0 per il bianco e 1 per il nero
        if(n==0){         //pedina bianca

            if(i2==(i1-1)&&j2==(j1-1)||i2==(i1-1)&&j2==(j1+1)){
                return true;
            }
            else if(i2==(i1-2)&&j2==(j1-2)||i2==(i1-2)&&j2==(j1+2))
            {
                if (j1 > j2) //Controlla verso che direzione si sposterà la pedina bianca, in questo caso viene da destra
                {
                    if (btnDamiera[i2 + 1][j2 + 1].getIcon() == Pn.imgPedina || btnDamiera[i2 + 1][j2 + 1].getIcon() == Pn.imgDama)
                    {
                        btnDamiera[i2 + 1][j2 + 1].setIcon(null);
                        return true;
                    }
                }
                else if (j2 > j1)
                {
                    if (btnDamiera[i2 + 1][j2 - 1].getIcon() == Pn.imgPedina || btnDamiera[i2 + 1][j2 - 1].getIcon() == Pn.imgDama)
                    {
                        btnDamiera[i2 + 1][j2 - 1].setIcon(null);
                        return true;
                    }
                }
            }
        }else if(n==1){   //pedina nera  
            if(i2==(i1+1)&&j2==(j1-1)||i2==(i1+1)&&j2==(j1+1)){
                return true;
            }
            else if(i2==(i1+2)&&j2==(j1-2)||i2==(i1+2)&&j2==(j1+2))
            {
                if (j1 > j2) //Controlla verso che direzione si sposterà la pedina bianca, in questo caso viene da destra
                {
                    if (btnDamiera[i2 - 1][j2 + 1].getIcon() == Pb.imgPedina || btnDamiera[i2 - 1][j2 + 1].getIcon() == Pb.imgDama)
                    {
                        btnDamiera[i2 - 1][j2 + 1].setIcon(null);
                        return true;
                    }
                }
                else if (j2 > j1)
                {
                    if (btnDamiera[i2 - 1][j2 - 1].getIcon() == Pb.imgPedina || btnDamiera[i2 - 1][j2 - 1].getIcon() == Pb.imgDama)
                    {
                        btnDamiera[i2 - 1][j2 - 1].setIcon(null);
                        return true;
                    }
                }
            }
        }else if(n == 2)
        {
            if ((i2==(i1+1)&&j2==(j1-1)||i2==(i1+1)&&j2==(j1+1))||(i2==(i1-1)&&j2==(j1-1)||i2==(i1-1)&&j2==(j1+1)))
            {
                return true;
            }
            else if (Math.abs(i2 - i1) == 2 && Math.abs(j2 - j1) == 2)
            {
                int temp, temp2;
                if (i1 > i2)
                {
                    temp = i1;
                }
                else
                {
                    temp = i2;
                }

                if (j1 > j2)
                {
                    temp2 = j1;
                }
                else
                {
                    temp2 = j2;
                }

                if (btnDamiera[temp - 1][temp2 - 1].getIcon() == Pn.imgPedina || btnDamiera[temp - 1][temp2 - 1].getIcon() == Pn.imgDama)
                {
                        btnDamiera[temp - 1][temp2 - 1].setIcon(null);
                        return true;
                }
            }
        }
        else if(n == 3)
        {
            if ((i2==(i1+1)&&j2==(j1-1)||i2==(i1+1)&&j2==(j1+1))||(i2==(i1-1)&&j2==(j1-1)||i2==(i1-1)&&j2==(j1+1)))
            {
                return true;
            }
            else if (Math.abs(i2 - i1) == 2 && Math.abs(j2 - j1) == 2)
            {
                int temp, temp2;
                if (i1 > i2)
                {
                    temp = i1;
                }
                else
                {
                    temp = i2;
                }

                if (j1 > j2)
                {
                    temp2 = j1;
                }
                else
                {
                    temp2 = j2;
                }

                if (btnDamiera[temp - 1][temp2 - 1].getIcon() == Pb.imgPedina || btnDamiera[temp - 1][temp2 - 1].getIcon() == Pb.imgDama)
                {
                        btnDamiera[temp - 1][temp2 - 1].setIcon(null);
                        return true;
                }
            }
        }
        return false;
    }
}