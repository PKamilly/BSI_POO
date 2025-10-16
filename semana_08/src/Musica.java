public class Musica extends ConteudoDeAudio {
    private String album;
    private String genero;

    public Musica(String titulo, int duracao, String autor, String album, String genero){
        super(titulo, duracao, autor);

        this.album=album;
        this.genero=genero;
    }

    public Musica() {}

    // Getters
    public String getAlbum(){
        return album;
    }
    public String getGenero(){
        return genero;
    }

    // Setters
    public void setAlbum(String album) { this.album = album; }
    public void setGenero(String genero) { this.genero = genero; }

    // Metodo polimórfico que esta sendo sobrescrito da classe pai
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Álbum: "+ this.album);
        System.out.println("Gênero: "+ this.genero);
    }
}