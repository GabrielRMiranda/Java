import javax.swing.*;

public class Bicicleta extends Veiculos {
    private boolean marchas;
    private int quantidadeMarchas;
    private int aro;
    private String suspensao;

    public Bicicleta(String modelo, String cor, String marca, boolean marchas, int quantidadeMarchas, int aro, String suspensao){
        super(modelo, cor, marca);
        this.marchas = marchas;
        this.quantidadeMarchas = quantidadeMarchas;
        this.aro = aro;
        this.suspensao = suspensao;
    }

    public boolean isMarchas() {
        return marchas;
    }

    public void setMarchas(boolean marchas) {
        this.marchas = marchas;
    }

    public int getQuantidadeMarchas() {
        return quantidadeMarchas;
    }

    public void setQuantidadeMarchas(int quantidadeMarchas) {
        this.quantidadeMarchas = quantidadeMarchas;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }

    @Override
    public String toString(){

        String temMarchas = marchas ? "Sim" : "Nao";

        return("Modelo: " + getModelo() +
                "\nMarca: " + getMarca() +
                "\nCor: " + getCor() +
                "\nMarchas: " + temMarchas +
                "\nQuantidade de Marchas: " + quantidadeMarchas +
                "\nTamanho Aro: " + aro +
                "\nSuspensão: " + suspensao
                );
    };

}
