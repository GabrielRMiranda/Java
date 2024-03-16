import javax.swing.JOptionPane;

public class Pessoa {
    private final String nome;
    private int idade;
    private String descricao;

    public Pessoa(String nome, int idade, String descricao){
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void ExibePessoa(){
        JOptionPane.showMessageDialog(null,nome + "\n" + idade + "\n" + descricao);
    }
}
