public class Mago extends Personagem{
    private String cajado;
    private String vestes;
    private String invocacaoNome;

    public Mago(String nome, String cor, double altura, int idade, int forca, int defesa, int vigor, int mana, int stamina, String cajado, String vestes, String invocacaoNome) {
        super(nome, cor, altura, idade, forca, defesa, vigor, mana, stamina);
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

    public String toString(){
        return("Nome: " + getNome() +
                "\nAltura: " + getAltura() +
                "\nCor: " + getCor() +
                "\nIdade: " + getIdade() +
                "\n" +
                "\nPontos de Habilidades" +
                "\nPontos de Forca: " + getForca() +
                "\nPontos de Defesa: " + getDefesa() +
                "\nPontos de Vigor: " + getVigor() +
                "\nPontos de Mana: " + getMana() +
                "\nPontos de Stamina: " + getStamina() +
                "\n" +
                "\nEquipamentos & Invocacoes" +
                "\nVestimenta: " + vestes +
                "\nArmamento: " + cajado +
                "\nInvocacao: " + invocacaoNome
        );
    }

}
