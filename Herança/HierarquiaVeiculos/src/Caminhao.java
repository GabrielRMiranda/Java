public class Caminhao extends Veiculos {
    private int torque;
    private String freioMotor;
    private String emissoes;
    private String tipoMarcha;
    private int quantidadeMarchaFrente;
    private int quantidadeMarchaRe;

    public Caminhao(String modelo, String cor, String marca, int torque, String freioMotor, String emissoes, String tipoMarcha, int quantidadeMarchaFrente, int quantidadeMarchaRe){
        super(modelo, cor, marca);
        this.torque = torque;
        this.freioMotor = freioMotor;
        this.emissoes = emissoes;
        this.tipoMarcha = tipoMarcha;
        this.quantidadeMarchaFrente = quantidadeMarchaFrente;
        this.quantidadeMarchaRe = quantidadeMarchaRe;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getFreioMotor() {
        return freioMotor;
    }

    public void setFreioMotor(String freioMotor) {
        this.freioMotor = freioMotor;
    }

    public String getEmissoes() {
        return emissoes;
    }

    public void setEmissoes(String emissoes) {
        this.emissoes = emissoes;
    }

    public String getTipoMarcha() {
        return tipoMarcha;
    }

    public void setTipoMarcha(String tipoMarcha) {
        this.tipoMarcha = tipoMarcha;
    }

    public int getQuantidadeMarchaFrente() {
        return quantidadeMarchaFrente;
    }

    public void setQuantidadeMarchaFrente(int quantidadeMarchaFrente) {
        this.quantidadeMarchaFrente = quantidadeMarchaFrente;
    }

    public int getQuantidadeMarchaRe() {
        return quantidadeMarchaRe;
    }

    public void setQuantidadeMarchaRe(int quantidadeMarchaRe) {
        this.quantidadeMarchaRe = quantidadeMarchaRe;
    }

    @Override
    public String toString(){
        return("Modelo: " + getModelo() +
                "\nMarca: " + getMarca() +
                "\nCor: " + getCor() +
                "\nTorque: " + torque +
                "\nFreio Motor: " + freioMotor +
                "\nEmissões: " + emissoes +
                "\nTipo Marcha: " + tipoMarcha +
                "\nQuantiadade de marchas frente: " + quantidadeMarchaFrente +
                "\nQuantidade de marchas ré: " + quantidadeMarchaRe
        );
    }

}
