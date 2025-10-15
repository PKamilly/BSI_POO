public class Podcast extends ConteudoDeAudio {
    private String nomeDoPrograma;
    private int numeroDoEpisodio;

    public Podcast(String titulo, int duracao, String autor,
                   String nomeDoPrograma, int numeroDoEpisodio){
        super(titulo, duracao, autor);
        this.nomeDoPrograma = nomeDoPrograma;
        this.numeroDoEpisodio = numeroDoEpisodio;
    }
    public Podcast(){}

    // Getters
    public String getNomeDoPrograma(){
        return nomeDoPrograma;
    }
    public int getNumeroDoEpisodio(){
        return numeroDoEpisodio;
    }

    // Setters
    public void setNomeDoPrograma(String nomeDoPrograma) { this.nomeDoPrograma = nomeDoPrograma; }
    public void setNumeroDoEpisodio(int numeroDoEpisodio) { this.numeroDoEpisodio = numeroDoEpisodio; }

    // Metodo polimórfico que esta sendo sobrescrito da classe pai
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Nome do Programa: "+ this.nomeDoPrograma);
        System.out.println("Número do Episódio: "+ this.numeroDoEpisodio);
    }
}
