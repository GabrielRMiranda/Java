import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    Veiculos carrozaofi = new Carro("Ford KA","Preto","Ford",4,"63cv",true,false,14);
    Veiculos motonafi = new Moto("Fazer","Preta","Yamaha",1,250,"Injecao eletronica","ABS",14.5);
    Veiculos bikezonafi = new Bicicleta("Bicicleta","azul","de bike",true,5,29,"tem");

    String title = "Carro";

    JOptionPane.showMessageDialog(null,carrozaofi,title,JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,motonafi);
    JOptionPane.showMessageDialog(null,bikezonafi);

    }
}