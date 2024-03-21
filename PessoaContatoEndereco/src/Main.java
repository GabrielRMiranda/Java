public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel Miranda",22,2002);
        Contato contato1 = new Contato("Privado","+55 (45)00000-0000","gabriel@gmail.com","Não ligar no período da tarde",true);
        Contato contato2 = new Contato("Trabalho","+55 45 1758-9874","gabriel@yahoo.com.br","Trabalho",false);
        Contato contato3 = new Contato("Casa","+55 45 2226-6711","gabriel@outlook.com","Contato de Casa",false);
        Endereco endereco1 = new Endereco("Casa","Rosa Alberto","Centro","Toledo",8782,"85901-080",true);
        Endereco endereco2 = new Endereco("Trabalho","Almirante Barroso","Centro","Toledo",1978,"782102-081",false);
        Endereco endereco3 = new Endereco("Faculdade","Joaquim fonseca","Paulista","Toledo",9875,"845921-892",false);

        pessoa.addEndereco(endereco1);
        pessoa.addEndereco(endereco2);
        pessoa.addEndereco(endereco3);
        pessoa.addContato(contato1);
        pessoa.addContato(contato2);
        pessoa.addContato(contato3);

        System.out.println(pessoa);
        for(Contato contato : pessoa.getContatos()){
            System.out.println(contato.toString());
        }
        for(Endereco endereco : pessoa.getEnderecos()){
            System.out.println(endereco);
        }
    }
}