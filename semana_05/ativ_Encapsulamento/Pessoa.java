public class Pessoa {
    // Atributos
    private String nome;
    private String nacio;
    private String genero;
    private String cpf;
    private int idade;
    
    
    // Configuração padrão
    public Pessoa(){
        this.nome = "Sem Nome";
        this.nacio = "Sem Nacionaidade";
        this.genero = "Sem Gênero";
        this.cpf = "Sem CPF";
        this.idade = 0;
    }
    
    // Retorna os valores
    public String getNome(){
        return nome;
    }
    public String getNacio(){
        return nacio;
    }
    public String getGenero(){
        return genero;
    }
    public String getCPF(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    
    // Atualiza os valores
    public String setNome(String nome){
        this.nome = nome;
        return nome;
    }
    public String setNacio(String nacio){
        this.nacio = nacio;
        return nacio;
    }
    public String setGenero(String genero){
        this.genero = genero;
        return genero;
    }
    public String setCpf(String cpf){
        this.cpf = cpf;
        return cpf;
    }
    public int setIdade(int idade){
        this.idade = idade;
        return idade;
    }
    
    // Quando o usuário define os valores do Livro
    public Pessoa(String nome, String nacio, String genero, String cpf, int idade){
        this.nome = nome;
        this.nacio = nacio;
        this.genero = genero;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    // Métodos
    
    
    
    
    // Mostra os atributos bunitinho
    public String toString(){
        return "Nome: "+nome +"\n"+
        "Nacionalidade: "+nacio +"\n"+
        "Gênero: "+genero +"\n"+
        "CPF: "+cpf +"\n"+
        "Idade: "+idade;
    }
    
}
