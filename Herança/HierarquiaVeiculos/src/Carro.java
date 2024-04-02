public class Carro extends Veiculos{
    private int quantidadePortas;
    private String motor;
    private boolean arcondicionado;
    private boolean som;
    private float litrosporkm;

    public Carro(String modelo, String cor, String marca, int quantidadePortas, String motor, boolean arcondicionado, boolean som, float litrosporkm){
        super(modelo, cor, marca);
        this.quantidadePortas = quantidadePortas;
        this.motor = motor;
        this.arcondicionado = arcondicionado;
        this.som = som;
        this.litrosporkm = litrosporkm;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public float getLitrosporkm() {
        return litrosporkm;
    }

    public void setLitrosporkm(float litrosporkm) {
        this.litrosporkm = litrosporkm;
    }

    @Override
    public String toString(){

        String possuiArcondicionado = arcondicionado ? "Sim" : "Nao";
        String possuiSom = som ? "Sim" : "Nao";

        return("Modelo: " + getModelo() +
                "\nMarca: " + getMarca() +
                "\nCor: " + getCor() +
                "\nQuantidade de Portas: " + quantidadePortas +
                "\nMotor: " + motor +
                "\nPossui ar-condicionado? " + possuiArcondicionado +
                "\nPossui Sistema de Som? " + possuiSom +
                "\nLitros por KM: " + litrosporkm
                );
    }

}
