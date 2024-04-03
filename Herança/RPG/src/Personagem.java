import javax.swing.*;

public class Personagem {
    private String nome;
    private String cor;
    private double altura;
    private int idade;
    private int forca;
    private int defesa;
    private int vigor;
    private int mana;
    private int stamina;

    public Personagem(String nome, String cor, double altura, int idade, int forca, int defesa, int vigor, int mana, int stamina){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.idade = idade;
        this.defesa = defesa;
        this.vigor = vigor;
        this.mana = mana;
        this. stamina = stamina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String toString(){
        return("Nome: " + nome +
                "\nAltura: " + altura +
                "\nCor: " + cor +
                "\nIdade: " + idade +
                "\nPontos de Forca: " + forca +
                "\nPontos de Defesa: " + defesa +
                "\nPontos de Vigor: " + vigor +
                "\nPontos de Mana: " + mana +
                "\nPontos de Stamina: " + stamina
                );
    }

}
