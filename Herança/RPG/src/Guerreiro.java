public class Guerreiro extends Personagem{
    private String armadura;
    private String arma;
    private String escudo;

    public Guerreiro(String nome, String raca, double altura, int idade, int forca, int defesa, int vigor, int mana, int stamina, String habilidade1, String habilidade2, String habilidade3, String habilidade4, String armadura, String arma, String escudo) {
        super(nome, raca, altura, idade, forca, defesa, vigor, mana, stamina, habilidade1, habilidade2, habilidade3, habilidade4);
        this.armadura = armadura;
        this.arma = arma;
        this.escudo = escudo;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    @Override
    public String fichaTecnica(){
        return("   Dados Basicos - Guerreiro" +
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
                "\nEquipamentos" +
                "\nArmadura: " + armadura +
                "\nArmamento: " + arma +
                "\nEscudo: " + escudo +
                "\n" +
                "\nHabilidades " +
                "\nPrimeira Habilidade: " + getHabilidade1() +
                "\nSegunda Habilidade: " + getHabilidade2() +
                "\nTerceira Habilidade: " + getHabilidade3() +
                "\nQuarta Habilidade: " + getHabilidade4()
        );
    }

}
