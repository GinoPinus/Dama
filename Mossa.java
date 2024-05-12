public class Mossa {
    Mossa(){

    }

    boolean controlloC1(int i1, int j1, int i2, int j2, int n){     //controllo caso    / n = 0 per il bianco e 1 per il nero
        if(n==0){         //pedina bianca
            if(i2==(i1-1)&&j2==(j1-1)||i2==(i1-1)&&j2==(j1+1)){
                return true;
            }
        }else if(n==1){   //pedina nera  
            if(i2==(i1+1)&&j2==(j1-1)||i2==(i1+1)&&j2==(j1+1)){
                return true;
            }
        }
        return false;
    }
}
