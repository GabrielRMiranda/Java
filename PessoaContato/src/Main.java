public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel Miranda",22,2002);
        Contato contato1 = new Contato("Privado","+55 (45)00000-0000","gabriel@gmail.com","Não ligar no período da tarde",true);
        Contato contato2 = new Contato("Trabalho","+55 45 1758-9874","gabriel@yahoo.com.br","Trabalho",false);
        Contato contato3 = new Contato("Casa","+55 45 2226-6711","gabriel@outlook.com","Contato de Casa",false);
        pessoa.addContato(contato1);
        pessoa.addContato(contato2);
        pessoa.addContato(contato3);

        System.out.println(pessoa);
        for(Contato contato : pessoa.getContatos()){
            System.out.println(contato.toString());
        }
    }
}