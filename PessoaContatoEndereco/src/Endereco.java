public class Endereco {
    private String descricao;
    private String rua;
    private String bairro;
    private String cidade;
    private int numeroCasa;
    private String cep;
    private boolean isPrincipalEndereco;

    public Endereco(String descricao, String rua, String bairro, String cidade, int numeroCasa, String cep,boolean isPrincipalEndereco){
        this.descricao = descricao;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numeroCasa = numeroCasa;
        this.cep = cep;
        this.isPrincipalEndereco = isPrincipalEndereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean isPrincipalEndereco() {
        return isPrincipalEndereco;
    }

    public void setPrincipal(boolean isPrincipalEndereco) {
        isPrincipalEndereco = isPrincipalEndereco;
    }

    @Override
    public String toString(){
        if(isPrincipalEndereco){
            return( "Endereço Principal" +
                    "\nRua: " + rua +
                    "\nBairro: " + bairro +
                    "\nCidade: " + cidade +
                    "\nNumero: " + numeroCasa +
                    "\nCEP: " + cep
            );
        } else {
            return ("\nRua: " + rua +
                    "\nBairro: " + bairro +
                    "\nCidade: " + cidade +
                    "\nNumero: " + numeroCasa +
                    "\nCEP: " + cep);
        }
    }
}