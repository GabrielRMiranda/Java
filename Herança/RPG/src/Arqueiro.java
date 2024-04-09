public class Arqueiro extends Personagem {
    private String arco;
    private String tipoFlechas;
    private int quantidadeFlechas;

    public Arqueiro(String nome, String raca, double altura, int idade, int forca, int defesa, int vigor, int mana, int stamina, String habilidade1, String habilidade2, String habilidade3, String habilidade4, String arco, String tipoFlechas, int quantidadeFlechas) {
        super(nome, raca, altura, idade, forca, defesa, vigor, mana, stamina, habilidade1, habilidade2, habilidade3, habilidade4);
        this.arco = arco;
        this.tipoFlechas = tipoFlechas;
        this.quantidadeFlechas = quantidadeFlechas;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    public String getTipoFlechas() {
        return tipoFlechas;
    }

    public void setTipoFlechas(String tipoFlechas) {
        this.tipoFlechas = tipoFlechas;
    }

    public int getQuantidadeFlechas() {
        return quantidadeFlechas;
    }

    public void setQuantidadeFlechas(int quantidadeFlechas) {
        this.quantidadeFlechas = quantidadeFlechas;
    }
    @Override
    public String fichaTecnica(){
        return("   Dados Basicos - Mago" +
                "\nNome: " + getNome() +
                "\nAltura: " + getAltura() +
                "\nCor: " + getRaca() +
                "\nIdade: " + getIdade() +
                "\nNivel: " + getNivel() +
                "\n" +
                "\nPontos de Habilidades" +
                "\nPontos de Forca: " + getForca() +
                "\nPontos de Defesa: " + getDefesa() +
                "\nPontos de Vigor: " + getVigor() +
                "\nPontos de Mana: " + getMana() +
                "\nPontos de Stamina: " + getStamina() +
                "\n" +
                "\nEquipamentos & Invocações" +
                "\nArco: " + getArco() +
                "\nTipo de Flechas: " + getTipoFlechas() +
                "\nQuantidade de Flechas: " + getQuantidadeFlechas() +
                "\n" +
                "\nHabilidades " +
                "\nPrimeira Habilidade: " + getHabilidade1() +
                "\nSegunda Habilidade: " + getHabilidade2() +
                "\nTerceira Habilidade: " + getHabilidade3() +
                "\nQuarta Habilidade: " + getHabilidade4()
        );
    }

}
