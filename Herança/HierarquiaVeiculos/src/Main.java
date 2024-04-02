import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    Veiculos carro = new Carro("Ford KA","Preto","Ford",4,"63cv",true,false,14);
    Veiculos moto = new Moto("Fazer","Preta","Yamaha",1,250,"Injecao eletronica","ABS",14.5);
    Veiculos bicicleta = new Bicicleta("Bicicleta","azul","de bike",true,5,29,"tem");
    Veiculos caminhao = new Caminhao("Caminhao","Branco","Volvo",2100,"VEB410","CONAMA P7","Manual",12,4);

    String carros = "Carro";
    String motos = "Moto";
    String bicicletas = "Bicicleta";
    String caminhoes = "Caminhão";

    JOptionPane.showMessageDialog(null,carro,carros,JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,moto,motos,JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,bicicleta,bicicletas,JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,caminhao,caminhoes,JOptionPane.INFORMATION_MESSAGE);

    }
}