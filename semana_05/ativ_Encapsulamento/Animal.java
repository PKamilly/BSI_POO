public class Animal {
    // Atributos
    private String nome;
    private String raca;
    private String genero;
    private String cor;
    private int idade;
    
    
    // Configuração padrão
    public Animal(){
        this.nome = "Sem Nome";
        this.raca = "Sem Raça";
        this.genero = "Sem Gênero";
        this.cor = "Sem cor";
        this.idade = 0;
    }
    
    // Retorna os valores
    public String getNome(){
        return nome;
    }
    public String getRaca(){
        return raca;
    }
    public String getGenero(){
        return genero;
    }
    public String getCor(){
        return cor;
    }
    public int getIdade(){
        return idade;
    }
    
    // Atualiza os valores
    public String setNome(String nome){
        this.nome = nome;
        return nome;
    }
    public String setRaca(String raca){
        this.raca = raca;
        return raca;
    }
    public String setGenero(String genero){
        this.genero = genero;
        return genero;
    }
    public String setCor(String cor){
        this.cor = cor;
        return cor;
    }
    public int setIdade(int idade){
        this.idade = idade;
        return idade;
    }
    
    // Quando o usuário define os valores do Animal
    public Animal(String nome, String raca, String genero, String cor, int idade){
        this.nome = nome;
        this.raca = raca;
        this.genero = genero;
        this.cor = cor;
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
