package fundamentos;

public class CriarPessoa {
    String nome;
    int idade;


    public CriarPessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void apresentacao(){
        System.out.println("Olá meu nome é: "+this.nome+" e minha idade é: "+this.idade);
    }
}
