public class ConteudoDeAudio {
    private String titulo;
    private int duracao;
    private String autor;

    public ConteudoDeAudio(String titulo, int duracao, String autor){
        this.titulo = titulo;
        this.duracao = duracao;
        this.autor = autor;
    }

    // Getters
    public String getAutor() {
        return autor;
    }
    public int getDuracao() {
        return duracao;
    }
    public String getTitulo() { return titulo; }

    // Setters
    public void setAutor(String autor) { this.autor = autor; }
    public void setDuracao(int duracao) { this.duracao = duracao; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public ConteudoDeAudio(){}

    public void play(){
        System.out.println("Tocando o título '" + titulo + "'.");
    }
    public void pausa(){
        System.out.println("Pausando o título '" + titulo + "'.");
    }

    // Metodo polimórfico que será sobrescrito pelas classes filhas
    public void exibirDetalhes(){
        System.out.println("Título: "+ this.titulo);
        System.out.println("Duração: "+ this.duracao);
        System.out.println("Autor: "+ this.autor);
    }
}