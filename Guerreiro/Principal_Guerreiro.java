package Guerreiro;

public class Principal_Guerreiro {
    public static void main(String[] args) {
        Guerreiro guerreiro1 = new Guerreiro(2, "Gohan");
        Guerreiro guerreiro2 = new Guerreiro(1, "Cell");

        guerreiro1.lutarR(guerreiro2);
        System.out.println(guerreiro1);
        System.out.println(guerreiro2);

        guerreiro1.alimentar();
        guerreiro2.alimentar();
        System.out.println(guerreiro1);
        System.out.println(guerreiro2);
    }
    
    
}
