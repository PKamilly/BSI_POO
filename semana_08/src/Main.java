import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList <ConteudoDeAudio> biblioteca = new ArrayList<>();

        int opcao = 0;
        do{
            System.out.println("--- Menu Biblioteca de Aúdio feita por Willian e Kamilly ---");
            System.out.println("1. Cadastrar Música");
            System.out.println("2. Cadastrar Podcast");
            System.out.println("3. Cadastrar AudioBook");
            System.out.println("4. Listar Biblioteca");
            System.out.println("5. Ouvir Música / Podcast / AudioBook");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("--- CADASTRAR MÚSICA SELECIONADA ---");

                    ConteudoDeAudio CDA_NM = new Musica(); // CDA = Conteúdo de Audio | NM = Nova Música
                    // POLIMORFISMO - (Musica) = casting | Diz ao programa que o ConteúdoDeAudio agora é um Música
                    Musica musica = (Musica) CDA_NM;

                    System.out.println("Título: ");
                    CDA_NM.setTitulo(scanner.nextLine());

                    System.out.println("Duração em segundos: ");
                    CDA_NM.setDuracao(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Autor: ");
                    CDA_NM.setAutor(scanner.nextLine());

                    System.out.println("Álbum: ");
                    musica.setAlbum(scanner.nextLine());

                    System.out.println("Gênero: ");
                    musica.setGenero(scanner.nextLine());

                    biblioteca.add(CDA_NM);
                    System.out.println("--- MÚSICA CADASTRADA ---");
                    break;

                case 2:
                    System.out.println("--- CADASTRAR PODCAST SELECIONADO ---");

                    ConteudoDeAudio CDA_NP = new Podcast(); // CDA = Conteúdo de Audio | NP = Novo Podcast
                    // POLIMORFISMO - (Podcast) = casting | Diz ao programa que o ConteúdoDeAudio agora é um Podcast
                    Podcast podcast = (Podcast) CDA_NP;

                    System.out.println("Título: ");
                    CDA_NP.setTitulo(scanner.nextLine());

                    System.out.println("Duração em segundos: ");
                    CDA_NP.setDuracao(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Autor: ");
                    CDA_NP.setAutor(scanner.nextLine());

                    System.out.println("Nome do programa: ");
                    podcast.setNomeDoPrograma(scanner.nextLine());

                    System.out.println("Número do episódio: ");
                    podcast.setNumeroDoEpisodio(scanner.nextInt());
                    scanner.nextLine();

                    biblioteca.add(CDA_NP);
                    System.out.println("--- PODCAST CADASTRADO ---");
                    break;

                case 3:
                    System.out.println("--- CADASTRAR AUDIOBOOK SELECIONADO ---");

                    ConteudoDeAudio CDA_NAB = new AudioBook(); // CDA = Conteúdo de Audio | NAB = Novo AudioBook
                    // POLIMORFISMO - (AudioBook) = casting | Diz ao programa que o ConteúdoDeAudio agora é um AudioBook
                    AudioBook audiobook = (AudioBook) CDA_NAB;

                    System.out.println("Título: ");
                    CDA_NAB.setTitulo(scanner.nextLine());

                    System.out.println("Duração em segundos: ");
                    CDA_NAB.setDuracao(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Autor: ");
                    CDA_NAB.setAutor(scanner.nextLine());

                    System.out.println("Nome do narrador: ");
                    audiobook.setNarrador(scanner.nextLine());

                    System.out.println("Número de capítulos: ");
                    audiobook.setNumeroDeCapitulos(scanner.nextInt());
                    scanner.nextLine();

                    biblioteca.add(CDA_NAB);
                    System.out.println("--- AUDIOBOOK CADASTRADO ---");
                    break;

                case 4:
                    System.out.println("--- LISTAR BIBLIOTECA SELECIONADA ---");

                    if (biblioteca.isEmpty()){
                        System.out.println("A Biblioteca está vazia!");
                    }
                    else {
                        int i = 0;
                        for (ConteudoDeAudio cda : biblioteca){
//                            int i=0;
                            if (cda instanceof Musica){
                                System.out.println("==== MUSICA ====");
                                System.out.println((i + 1) + ".");
                                cda.exibirDetalhes();
                                System.out.println("================");
                                System.out.println(); // Espaçamento

                            } else if (cda instanceof Podcast){
                                System.out.println("==== PODCAST ====");
                                System.out.println((i + 1) + ".");
                                cda.exibirDetalhes();
                                System.out.println("=================");
                                System.out.println(); // Espaçamento

                            } else if (cda instanceof AudioBook){
                                System.out.println("==== AUDIOBOOK ====");
                                System.out.println((i + 1) + ".");
                                cda.exibirDetalhes();
                                System.out.println("===================");
                                System.out.println(); // Espaçamento

                            }
                            i++;
                        }
                    }
                    break;

                case 5:
                    System.out.println("--- TOCADOR DE MÍDIA SELECIONADA ---");

                    if (biblioteca.isEmpty()){
                        System.out.println("A Biblioteca esta vazia!");
                    }

                    System.out.println("Itens Disponíveis: ");
                    for (int i = 0; i < biblioteca.size(); i++) {
                        System.out.println(i+1);
                    }

                    System.out.println("Escolha o número do item para tocar: ");
                    int escolhaItem = scanner.nextInt();

                    if (escolhaItem > 0 && escolhaItem <= biblioteca.size()){
                        ConteudoDeAudio itemSelecionado = biblioteca.get(escolhaItem - 1);

                        System.out.println("Você selecionou: " + itemSelecionado.getTitulo());
                        System.out.println("1. Play");
                        System.out.println("2. Pausa");
                        System.out.println("Escoha uma opção: ");
                        // opcaoTM = opção do tocador de mídia
                        int opcaoTM = scanner.nextInt();
                        scanner.nextLine();

                        if (opcaoTM==1){
                            itemSelecionado.play();
                        } else if (opcaoTM==2){
                            itemSelecionado.pausa();
                        } else {
                            System.out.println("Opção inválida!");
                        }

                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;

                case 6:
                    System.out.println("--- SAIR SELECIONADO ---");
                    System.out.println("Obrigado por usar nosso programa!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        while (opcao != 6);
        scanner.close();
    }
}