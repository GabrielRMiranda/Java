import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Mago mago = new Mago("gabriel","Humano",1.71,22,4,5,7,10,10,"Ataque direto","Magia de fogo","Magia de raios","Invisibilidade","Cajado do vazio","Manto de Rugrat","Melina, a dama");
        Guerreiro guerreiro = new Guerreiro("Thor","Nord",2.00,40,10,10,10,10,4,"Raios divinos","Tormenta de Raios","Avanço avassalador","Quebra de postura","Benção divina","Mjolnir","Drakis");
        Arqueiro arqueiro = new Arqueiro("Legolas","Elfo",1.60,30,3,4,10,10,10,"Chuva de flechas","Direto no alvo","Rajada rapida","Flecha mortal","Bneção do carvalho","Incinerantes e envenenadoras",100);

        JOptionPane.showMessageDialog(null,mago.fichaTecnica(),"Mago",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,guerreiro.fichaTecnica(),"Guerreiro",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,arqueiro.fichaTecnica(),"Arqueiro",JOptionPane.INFORMATION_MESSAGE);

        mago.combate();
    }
}