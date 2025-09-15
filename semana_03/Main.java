import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("=================================");
        System.out.println("~~~~~~~~~~~| M E N U |~~~~~~~~~~~");
        System.out.println("=================================");
        System.out.println("1. Cadastrar nova pessoa");
        System.out.println("2. Listar todas as pessoas");
        System.out.println("3. Buscar pessoa por nome");
        System.out.println("4. Atualizar dados de uma pessoa");
        System.out.println("5. Remover pessoa pelo nome");
        System.out.println("6. Sair");
        System.out.println("=================================");
    }

    public static void agradecimentos(){
        System.out.println("=================================");
        System.out.println("O programa está encerrando . . .");
        System.out.println("=================================");
        System.out.println("Obrigado por usar o programa!");
        System.out.println("Programa feito por: Kamilly Victória.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();

        // Atributos
        String nome;
        int idade;
        String telefone;
        String email;

        Pessoa atualizarPessoa = null;
        String atualizarNome;
        int atualizarIdade;
        String atualizarTelefone;
        String atuaizarEmail;

        String buscarNome;
        String removerNome;

        int selecao;
        String simNao;


        // Início do programa rodando
        menu();
        System.out.print("Favor selecione uma opção: ");
        selecao = scanner.nextInt();

        // Looping do programa rodando
        while (selecao!=6){
            if (selecao != 1 && selecao != 2 && selecao != 3 && selecao != 4 && selecao != 5) {
                System.out.println("Por favor escolha uma opção entre 1 e 6");

                System.out.print("Favor selecione uma opção: ");
                selecao = scanner.nextInt();
            }
            // Cadastro
            if (selecao == 1) {
                System.out.println("=================================");
                System.out.println("Cadastrando nova pessoa . . .");
                System.out.println("=================================");
                System.out.println("Insira as informações abaixo\n");

                // Manda a info de cada atributo para a classe pessoa
                System.out.print("- Nome: ");
                nome = scanner.nextLine();
                scanner.nextLine();

                System.out.print("- Idade: ");
                idade = scanner.nextInt();
                scanner.nextLine();

                System.out.print("- Telefone: ");
                telefone = scanner.nextLine();

                System.out.print("- Email: ");
                email = scanner.nextLine();

                Pessoa pessoa = new Pessoa(nome, idade, telefone, email);
                lista.add(pessoa);

                System.out.println("=================================");
                System.out.println("Pessoa Cadastrada");
                System.out.println("=================================");


                menu();
                System.out.print("Favor selecione uma opção: ");
                selecao = scanner.nextInt();
                scanner.nextLine();
            }
            // Listar
            if (selecao == 2) {
                System.out.println("=================================");
                System.out.println("Listando todas as pessoas . . .");
                System.out.println("=================================");

                System.out.println(lista);

                menu();
                System.out.print("Favor selecione uma opção: ");
                selecao = scanner.nextInt();
                scanner.nextLine();
            }
            // Buscar
            if (selecao == 3) {
                System.out.println("=================================");
                System.out.println("Buscar pessoa por nome");
                System.out.println("=================================");

                System.out.print("Insira o nome da pessoa: ");
                buscarNome = scanner.nextLine();
                boolean encontrada = false;

                for (Pessoa buscarPessoa : lista) {
                    if (buscarPessoa.nome.equalsIgnoreCase(buscarNome)) {
                        System.out.println("=================================");
                        System.out.println("Pessoa encontrada");
                        System.out.println("=================================");

                        System.out.println("Informações: " + buscarPessoa);
                        encontrada = true;
                    }
                }
                if (!encontrada) {
                    System.out.println("=================================");
                    System.out.println("Pessoa NÃO encontrada");
                    System.out.println("=================================");
                }

                menu();
                System.out.print("Favor selecione uma opção: ");
                selecao = scanner.nextInt();
                scanner.nextLine();
            }
            // Atualizar
            if (selecao == 4) {
                System.out.println("=================================");
                System.out.println("Atualizar dados de uma pessoa");
                System.out.println("=================================");
                System.out.println("Insira as informações abaixo");

                System.out.print("Insira o nome da pessoa: ");
                buscarNome = scanner.nextLine();
                boolean encontrada = false;

                for (Pessoa buscarPessoa : lista) {
                    if (buscarPessoa.nome.equalsIgnoreCase(buscarNome)) {
                        atualizarPessoa = buscarPessoa;
                    }
                }

                if (atualizarPessoa!=null) {
                    System.out.println("=================================");
                    System.out.println("Pessoa encontrada");
                    System.out.println("=================================");
                    System.out.println("Insira as informações abaixo");

                    System.out.print("- Nome: ");
                    atualizarNome = scanner.nextLine();

                    System.out.print("- Idade: ");
                    atualizarIdade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("- Telefone: ");
                    atualizarTelefone = scanner.nextLine();

                    System.out.print("- Email: ");
                    atuaizarEmail = scanner.nextLine();

                    encontrada = true;
                }
                if (!encontrada) {
                    System.out.println("=================================");
                    System.out.println("Pessoa NÃO encontrada");
                    System.out.println("=================================");
                }

                menu();
                System.out.print("Favor selecione uma opção: ");
                selecao = scanner.nextInt();
                scanner.nextLine();
            }
            // Remover
            if (selecao == 5) {
                System.out.println("=================================");
                System.out.println("Remover pessoa pelo nome");
                System.out.println("=================================");
                System.out.println("Insira as informações abaixo");

                System.out.print("- Nome: ");
                buscarNome = scanner.nextLine();
                String finalBuscarNome = buscarNome;
                boolean removido = lista.removeIf(pessoa -> pessoa.nome.equalsIgnoreCase(finalBuscarNome));

                if (removido) {
                    System.out.println("=================================");
                    System.out.println("Pessoa removida");
                    System.out.println("=================================");
                } else {
                    System.out.println("=================================");
                    System.out.println("Pessoa não encontrada");
                    System.out.println("=================================");
                }

                menu();
                System.out.print("Favor selecione uma opção: ");
                selecao = scanner.nextInt();
                scanner.nextLine();
            }

        }

        // Fora do código
        agradecimentos();
    }
}