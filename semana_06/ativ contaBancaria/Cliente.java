public class Cliente {
    private String nome;
    private int idade;
    private String genero;
    private String telefone;
    private String email;
    private int cod_CB;

    public Cliente(){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.telefone = telefone;
        this.email = email;
        this.cod_CB = cod_CB;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getGenero() {
        return genero;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public int getCod_CB() {
        return cod_CB;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCod_CB(int cod_CB) {
        this.cod_CB = cod_CB;
    }






}
