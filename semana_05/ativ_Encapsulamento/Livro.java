public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private String genero;
    private int quantiPaginas;
    private int dtLancamento;
    
    
    // Configuração padrão
    public Livro(){
        this.titulo = "Sem Título";
        this.autor = "Sem Autor";
        this.genero = "Sem Gênero";
        this.quantiPaginas = 0;
        this.dtLancamento = 0;
    }
    
    // Retorna os valores
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getGenero(){
        return genero;
    }
    public int getQuantiPaginas(){
        return quantiPaginas;
    }
    public int getDtLancamento(){
        return dtLancamento;
    }
    
    // Atualiza os valores
    public String setTitulo(String titulo){
        this.titulo = titulo;
        return titulo;
    }
    public String setAutor(String autor){
        this.autor = autor;
        return autor;
    }
    public String setGenero(String genero){
        this.genero = genero;
        return genero;
    }
    public int setQuantiPaginas(int quantiPaginas){
        this.quantiPaginas = quantiPaginas;
        return quantiPaginas;
    }
    public int setDtLancamento(int dtLancamento){
        this.dtLancamento = dtLancamento;
        return dtLancamento;
    }
    
    // Quando o usuário define os valores do Livro
    public Livro(String titulo, String autor, String genero, int quantiPaginas, int dtLancamento){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.quantiPaginas = quantiPaginas;
        this.dtLancamento = dtLancamento;
    }
    
    // Métodos
    
    
    
    
    
    // Mostra os atributos bunitinho
    public String toString(){
        return "Nome Livro: "+titulo +"\n"+
        "Nome Autor: "+autor +"\n"+
        "Gênero: "+genero +"\n"+
        "Número de Páginas: "+quantiPaginas +"\n"+
        "Data de Lançamento: "+dtLancamento;
    }
    
}
