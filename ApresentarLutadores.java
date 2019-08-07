package Controle;
public class ApresentarLutadores {
    
    public static void main(String [] args){
        Lutadores l[] = new Lutadores[5];
                l[0]=new Lutadores("Pretty boy","Franca",31,1.75f,68.9f,11,2,1);
                l[1] = new Lutadores("Ufocobol","Brasil",37,1.70f,119.3f,5,4,2);
                l[2]= new Lutadores("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        
       Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[2]);
        UEC01.Lutar();
        UEC01.quartelPosLuta();
        
    }
    
}
