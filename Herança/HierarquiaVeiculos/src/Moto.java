public class Moto extends Veiculos {
    private int cilindros;
    private int cilindaradas;
    private String alimentacao;
    private String sistemafreios;
    private double capacidadetanque;

    public Moto(String modelo, String cor, String marca, int cilindros, int cilindaradas, String alimentacao, String sistemafreios, double capacidadetanque){
        super(modelo, cor, marca);
        this.cilindros = cilindros;
        this.cilindaradas = cilindaradas;
        this.alimentacao = alimentacao;
        this.sistemafreios = sistemafreios;
        this.capacidadetanque = capacidadetanque;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getCilindaradas() {
        return cilindaradas;
    }

    public void setCilindaradas(int cilindaradas) {
        this.cilindaradas = cilindaradas;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getSistemafreios() {
        return sistemafreios;
    }

    public void setSistemafreios(String sistemafreios) {
        this.sistemafreios = sistemafreios;
    }

    public double getCapacidadetanque() {
        return capacidadetanque;
    }

    public void setCapacidadetanque(double capacidadetanque) {
        this.capacidadetanque = capacidadetanque;
    }

    @Override
    public String toString(){
        return("Modelo: " + getModelo() +
              "\nMarca: " + getMarca() +
              "\nCor: " + getCor() +
              "\nCilindradas: " + cilindaradas +
              "\nCilindros: " + cilindros +
              "\nSistema de Freios: " + sistemafreios +
              "\nAlimentacao: " + alimentacao +
              "\nCapacidade de Tanque: " + capacidadetanque + "L"
              );
    };

}
