package Guerreiro;
import java.util.Random;

public class Guerreiro {
    private int codigo;
    private String nome;
    private int energia;

    public Guerreiro (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    public int getenergia (){
        return energia;
    }

    public void incremento (){
        if (energia >= 0 && energia < 5){
            energia += 1;
        } else {
        
        }
    }

    public void decremento (){
        if (energia <= 5 && energia > 0){
            energia -= 1;
        } 
        else if (energia == 0){
        } else {
            
        }
    }

    public void alimentar (){
        incremento();
    }

    public int atacar (){
        Random gerador = new Random();
        return gerador.nextInt(2);
    }

    public void lutarL (Guerreiro oponente){
        while (energia > 0 && oponente.getenergia() > 0){
            int ag = atacar();
            int ao = oponente.atacar();
            if (ag == 1){
                oponente.decremento();
                if (oponente.getenergia() == 0){
                break;
                }
            }
            if (ao == 1) {
                decremento();
                if (energia == 0){
                break;
                }
            }
        }
    }

    public void lutarR (Guerreiro oponente){
        if (energia <= 0 || oponente.getenergia() <= 0) {
            return;
        }

        int ag = atacar();
        int ao = oponente.atacar();

        if (ag == 1) {
            oponente.decremento();
            if (oponente.getenergia() == 0) {
                System.out.println("Guerreiro Venceu");
                return;
            }
        } 

        if (ao == 1) {
            decremento();
            if (energia == 0) {
                System.out.println("Oponente Venceu");
                return;
            }
        } else if (ag == 0 && ao == 0){
            System.out.println("Não houve acerto");
        }

        lutarR(oponente);
    }

    public String toString(){
        return "Guerreiro - " + "\n" +
        "Código = " + codigo + "\n" +
        "Nome = " + nome + "\n" +
        "Energia = " + energia + "\n" +
        ".";
    }
}
