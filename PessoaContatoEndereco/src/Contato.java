public class Contato {
    private String nomeContato;
    private String telefone;
    private String email;
    private String descricao;
    private boolean isPrincipalContato;

    public Contato(String nomeContato, String telefone, String email, String descricao, boolean isPrincipalContato){
        this.nomeContato = nomeContato;
        this.telefone = telefone;
        this.email = email;
        this.descricao = descricao;
        this.isPrincipalContato = isPrincipalContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isPrincipal() {
        return isPrincipalContato;
    }

    public void setPrincipal(boolean principal) {
        isPrincipalContato = principal;
    }

    public void listaDeContatos(){
        System.out.println(nomeContato);
    }

    @Override
    public String toString(){
        if(isPrincipalContato == true){
            return("Contato principal" +
                    "\nContato: " + nomeContato +
                    "\nTelefone: " + telefone +
                    "\nE-mail: " + email +
                    "\nDescrição: " + descricao + "\n"
            );
        } else{
            return("\nContato: " + nomeContato +
                    "\nTelefone: " + telefone +
                    "\nE-mail: " + email +
                    "\nDescrição: " + descricao + "\n"
            );
        }
    }
}