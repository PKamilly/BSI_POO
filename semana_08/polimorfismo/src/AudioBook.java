public class AudioBook extends ConteudoDeAudio{
    private String narrador;
    private int numeroDeCapitulos;

    public AudioBook(String titulo, int duracao, String autor, String album, String genero){
        super(titulo, duracao, autor);

        this.narrador=narrador;
    }
    public AudioBook(){}
    public AudioBook(String tituloAudioBook, String autorAudioBook, int duracaoAudioBook) {
    }

    // Getters
    public String getNarrador() {
        return narrador;
    }
    public int getNumeroDeCapitulos() { return numeroDeCapitulos; }

    // Setters
    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }
    public void setNumeroDeCapitulos(int numeroDeCapitulos) { this.numeroDeCapitulos = numeroDeCapitulos; }

    public int marcarCapitulo(){
        System.out.println("Capítulo marcado: " + this.numeroDeCapitulos);
        return 0;
    }

    // Metodo polimórfico que esta sendo sobrescrito da classe pai
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Numero de Capítulos: " + this.numeroDeCapitulos);
        System.out.println("Narrador: "+ this.narrador);
    }
}
