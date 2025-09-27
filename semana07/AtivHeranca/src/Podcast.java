public class Podcast extends ConteudoDeAudio {
    private String nomeDoPrograma;
    private int numeroDoEpisodio;

    public Podcast(String titulo, int duracao, String autor,
                   String nomeDoPrograma, int numeroDoEpisodio){
        super(titulo, duracao, autor);
        this.nomeDoPrograma = nomeDoPrograma;
        this.numeroDoEpisodio = numeroDoEpisodio;
    }
    public String getNomeDoPrograma(){
        return nomeDoPrograma;
    }
    public int getNumeroDoEpisodio(){
        return numeroDoEpisodio;
    }
}
