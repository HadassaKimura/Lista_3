public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Kimura",123456789,2);
        Endereco e1 = new Endereco("Minha rua", "Belvedere", 42);
        Endereco e2 = new Endereco("Descubra","Overworld",42);
        p1.addEndereco(e1);
        p1.addEndereco(e2);
        p1.mostraInfo();

        for(int i = 0;i < p1.enderecos.length;i++){
            System.out.println("Endereco " + i + ":");
            p1.enderecos[i].mostraInfo();
        }

    }

}
