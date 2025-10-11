public class Musica extends ConteudoDeAudio {
    private String album;
    private String genero;

    public Musica(String titulo, int duracao, String autor, String album, String genero){
        super(titulo, duracao, autor);

        this.album=album;
        this.genero=genero;
    }

    public Musica() {}

    public String getAlbum(){
        return album;
    }
    public String getGenero(){
        return genero;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Álbum: "+ this.album);
        System.out.println("Gênero: "+ this.genero);
    }
}