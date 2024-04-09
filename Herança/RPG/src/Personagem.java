import java.util.Random;
import java.util.Scanner;

public class Personagem {
    private String nome;
    private String raca;
    private double altura;
    private int idade;
    private int forca;
    private int defesa;
    private int vigor;
    private int mana;
    private int stamina;
    private String habilidade1;
    private String habilidade2;
    private String habilidade3;
    private String habilidade4;
    private static int nivel = 1;

    public Personagem(String nome, String raca, double altura, int idade, int forca, int defesa, int vigor, int mana, int stamina, String habilidade1, String habilidade2, String habilidade3, String habilidade4) {
        this.nome = nome;
        this.raca = raca;
        this.altura = altura;
        this.idade = idade;
        this.forca = forca;
        this.defesa = defesa;
        this.vigor = vigor;
        this.mana = mana;
        this.stamina = stamina;
        this.habilidade1 = habilidade1;
        this.habilidade2 = habilidade2;
        this.habilidade3 = habilidade3;
        this.habilidade4 = habilidade4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public String getHabilidade1() {
        return habilidade1;
    }

    public void setHabilidade1(String habilidade1) {
        this.habilidade1 = habilidade1;
    }

    public String getHabilidade2() {
        return habilidade2;
    }

    public void setHabilidade2(String habilidade2) {
        this.habilidade2 = habilidade2;
    }

    public String getHabilidade3() {
        return habilidade3;
    }

    public void setHabilidade3(String habilidade3) {
        this.habilidade3 = habilidade3;
    }

    public String getHabilidade4() {
        return habilidade4;
    }

    public void setHabilidade4(String habilidade4) {
        this.habilidade4 = habilidade4;
    }

    public static void novoPersonagem(String nome, String raca, double altura, int idade, int forca, int defesa, int vigor, int stamina, int mana, String habilidade1, String habilidade2, String habilidade3, String habilidade4){
        Personagem personagem = new Personagem(nome, raca, altura, idade, forca, defesa, vigor, stamina, mana, habilidade1, habilidade2, habilidade3, habilidade4);

    }

    public void combate() {
        Random rand = new Random();
        int seletorNumero = 10;
        int vida = 10;
        int opcao;

        int seletorCombate = rand.nextInt(seletorNumero);
        int vidaInimigo = rand.nextInt(vida);

        System.out.println("Deseja entrar em combate?");
        System.out.println("1- Iniciar combate\n2- desistir");

        Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O combate se inicia!\nOs dados rolam.. seu dano é: " + seletorCombate);
                System.out.println("\nSeu inimigo possui " + vidaInimigo + " de hp");
                if (seletorCombate > vidaInimigo) {
                    System.out.println("\nInimigo derrotado!");
                    System.out.println("Você subiu de nível: " + subirNivel()+ "\nDeseja entrar em combate novamente? 1- Sim/2- Nao");
                    opcao = scanner.nextInt();
                    if (opcao == 1) {
                        combate();
                    }   else {
                        System.out.println("Fraco.");
                        break;
                    }
                    break;
                } else if (seletorCombate == vidaInimigo) {
                    System.out.println("As espadas se chocam e nada acontece!");
                    combate();
                } else {
                    System.out.println("Você foi derrotado!\nDeseja entrar em combate novamente? 1- Sim/2- Nao");
                    opcao = scanner.nextInt();
                    if (opcao == 1) {
                        combate();
                    }   else {
                        System.out.println("Fraco.");
                        break;
                    }
                    break;
                }
            case 2:
                System.out.println("Você desistiu do combate, vergonhoso!");
                break;
        }
    }

    public static int subirNivel(){
        return ++nivel;
    }

    public String fichaTecnica(){
        return("Nome: " + nome +
                "\nAltura: " + altura +
                "\nRaca: " + raca +
                "\nIdade: " + idade +
                "\nNivel: " + nivel +
                "\nPontos de Forca: " + forca +
                "\nPontos de Defesa: " + defesa +
                "\nPontos de Vigor: " + vigor +
                "\nPontos de Mana: " + mana +
                "\nPontos de Stamina: " + stamina +
                "\nPrimeira Habilidade: " + habilidade1 +
                "\nSegunda Habilidade: " + habilidade2 +
                "\nTerceira Habilidade: " + habilidade3 +
                "\nQuarta Habilidade: " + habilidade4);
    }
}