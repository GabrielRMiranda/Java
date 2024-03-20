import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private int anoNascimento;
    private List<Contato> contatos;

    public Pessoa(String nome, int idade, int anoNascimento){
        this.nome = nome;
        this.idade = idade;
        this.anoNascimento = anoNascimento;
        this.contatos = new ArrayList<>();
    }

    public void addContato(Contato contato){
        if (contato != null) {
            contatos.add(contato);
            if (contato.isPrincipal()) {
                for (Contato c : contatos) {
                    if (c != contato && c.isPrincipal()) {
                        c.setPrincipal(false);
                    }
                }
            }
        }
    }

    public Contato getContatoPrincipal() {
        for (Contato c : contatos) {
            if (c.isPrincipal()) {
                return c;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString(){
        return("Dados Pessoais" +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nAno de Nascimento: " + anoNascimento + "\n"
        );
    }
}