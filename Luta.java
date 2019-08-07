package Controle;

import java.util.Random;

public class Luta {
    //atributos
    
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos
    
    public void marcarLuta(Lutadores l1, Lutadores l2){
        if(l1.getCategoria().equals(l2.getCategoria())&& l1!=l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    
    public void Lutar(){
        if(this.getAprovada()){
            System.out.println("****Desafiado****");
            this.desafiado.apresentar();
            System.out.println("****Desafiante****");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0://empate
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                
                case 1://desafiado vence
                    System.out.println("Desafiado venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://desafiante vence
                    System.out.println("Desafiante venceu");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                default:
                    System.out.println("Erro");
            }
        }else{
            System.out.println("A luta nao pode acontecer!");
        }
    }
    
    public void quartelPosLuta(){
        this.desafiado.status();
        this.desafiante.status();
    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    
}
