//package aula02;

public class Pessoa {
    //atributo criado
    public String nome;
    public int idade;
    public String telefone;
    public String email;

    //guarda a info do atributo
    public Pessoa(String nome, int idade, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }

    //acessa a info do atributo
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone + ", Email: " + email;
    }


}


