public class Mago extends Personagem{
    private String cajado;
    private String vestes;
    private String invocacaoNome;

    public Mago(String nome, String raca, double altura, int idade,int forca, int defesa, int vigor, int mana, int stamina, String habilidade1, String habilidade2, String habilidade3, String habilidade4, String cajado, String vestes, String invocacaoNome) {
        super(nome, raca, altura, idade,forca, defesa, vigor, mana, stamina,habilidade1, habilidade2, habilidade3, habilidade4);
        this.cajado = cajado;
        this.vestes = vestes;
        this.invocacaoNome = invocacaoNome;
    }

    public String getCajado() {
        return cajado;
    }

    public void setCajado(String cajado) {
        this.cajado = cajado;
    }

    public String getVestes() {
        return vestes;
    }

    public void setVestes(String vestes) {
        this.vestes = vestes;
    }

    public String getInvocacaoNome() {
        return invocacaoNome;
    }

    public void setInvocacaoNome(String invocacaoNome) {
        this.invocacaoNome = invocacaoNome;
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
                "\nArmadura: " + vestes +
                "\nArmamento: " + cajado +
                "\nEscudo: " + invocacaoNome +
                "\n" +
                "\nHabilidades " +
                "\nPrimeira Habilidade: " + getHabilidade1() +
                "\nSegunda Habilidade: " + getHabilidade2() +
                "\nTerceira Habilidade: " + getHabilidade3() +
                "\nQuarta Habilidade: " + getHabilidade4()
        );
    }
}
