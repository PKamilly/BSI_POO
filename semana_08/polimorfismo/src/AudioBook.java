public class AudioBook extends ConteudoDeAudio{
    private String narrador;
    private int numeroDePaginas;

    public AudioBook(String titulo, int duracao, String autor, String album, String genero){
        super(titulo, duracao, autor);

        this.narrador=narrador;
    }
    public AudioBook(){}
    public AudioBook(String tituloAudioBook, String autorAudioBook, int duracaoAudioBook) {
    }

    public String getNarrador() {
        return narrador;
    }
    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Narrador: "+ this.narrador);
    }

    public int marcarPagina(){
        System.out.println("Página marcada ");
    }

}
