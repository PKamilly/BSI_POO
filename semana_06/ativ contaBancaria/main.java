import java.util.ArrayList;
import java.util.Scanner;

public class main{
    public static void menu(){
        System.out.println("=====================");
        System.out.println("---------MENU--------");
        System.out.println("=====================");
        System.out.println("1. Cadastrar");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Extrato");
        System.out.println("5. Alterar Informações Cadastrais");
        System.out.println("6. Sair");
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        ContaBancaria contaB = new ContaBancaria();
        Gerente gerente = new Gerente();

        System.out.println("Bem vindo ao programa de Contas Bancárias!\n");

        //System.out.println("Nome: "+cliente.getNome());
        //System.out.println("Idade: "+cliente.getIdade());
        //System.out.println("Gênero: "+cliente.getGenero());
        //System.out.println("Telefone: "+cliente.getTelefone());
        //System.out.println("Email: "+cliente.getEmail());


        // Programa rodando
        int opcao = 0;
        while(opcao>=0){
            menu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Cadastro
            if (opcao==1) {
                System.out.println("======================================");
                System.out.println("---------CADASTRO--SELECIONADO--------");
                System.out.println("======================================");
                scanner.nextLine();

                System.out.print("Nome Completo: ");
                String entrada = scanner.nextLine();
                cliente.setNome(entrada);

                System.out.print("Idade: ");
                int entrada1 = scanner.nextInt();
                cliente.setIdade(entrada1);
                scanner.nextLine();

                System.out.print("Gênero: ");
                entrada = scanner.nextLine();
                cliente.setGenero(entrada);

                System.out.print("Telefone: ");
                entrada = scanner.nextLine();
                cliente.setTelefone(entrada);

                System.out.print("Email: ");
                entrada = scanner.nextLine();
                cliente.setEmail(entrada);

                System.out.println("=====================");
                System.out.println("Pessoa Cadastrada!");
            }

            // Saque
            if (opcao==2) {
                System.out.println("===================================");
                System.out.println("---------SAQUE--SELECIONADO--------");
                System.out.println("===================================");

                System.out.println("Saldo Disponível R$: " + contaB.getSaldo());
                System.out.print("Quanto você gostaria de sacar? ");
                float valor = scanner.nextInt();

                contaB.sacar(valor);

                System.out.println("=====================");
                System.out.println("Valor Sacado!");
            }

            // Deposito
            if (opcao==3){
                System.out.println("=================================");
                System.out.println("------DEPOSITO--SELECIONADO------");
                System.out.println("=================================");

                System.out.print("Quanto você gostaria de depositar? ");
                float valor = scanner.nextInt();

                contaB.depositar(valor);

                System.out.println("=====================");
                System.out.println("Valor Depositado!");
            }

            // Extrato
            if (opcao==4){
                System.out.println("================================");
                System.out.println("------EXTRATO--SELECIONADO------");
                System.out.println("================================");

                System.out.println("Saldo na conta R$: " + contaB.getSaldo());
            }

            // Alterar Informações Cadastrais
            if (opcao==5){
                System.out.println("======================================");
                System.out.println("----ATUALIZAR-CADASTRO-SELECIONADO----");
                System.out.println("======================================");
                scanner.nextLine();

                System.out.print("Nome Completo: ");
                String entrada = scanner.nextLine();
                cliente.setNome(entrada);

                System.out.print("Idade: ");
                int entrada1 = scanner.nextInt();
                cliente.setIdade(entrada1);
                scanner.nextLine();

                System.out.print("Gênero: ");
                entrada = scanner.nextLine();
                cliente.setGenero(entrada);

                System.out.print("Telefone: ");
                entrada = scanner.nextLine();
                cliente.setTelefone(entrada);

                System.out.print("Email: ");
                entrada = scanner.nextLine();
                cliente.setEmail(entrada);

                System.out.println("=====================");
                System.out.println("Cadastro Atualizado!");
            }

            // Sair
            if (opcao==6){
                System.out.println("=====================");
                System.out.println("Obrigada por usar o programa!");
                System.out.println("Programa feito por Kamilly Victória Mattana Prestes");
                break;
            }

            // Input errado
            if (opcao>=7) {
                System.out.println("Opção inválida!");
            }

        // ArrayList<A> lista = new ArrayList<>();
        }
    }
}