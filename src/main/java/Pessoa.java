public class Pessoa {
    public String nome;
    public int cpf;
    public Endereco[] enderecos;

    public Pessoa(String nome, int cpf,int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }

    void addEndereco(Endereco End){
        for(int i = 0; i< enderecos.length;i++){
            if(enderecos[i] == null){
                enderecos[i] = End;
                break;
            }

        }

    }
    void mostraInfo(){
        System.out.println(nome);
        System.out.println(cpf);
    }
}
