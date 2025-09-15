// Importações de bibliotecas colocam aqui
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class 070825_ativ01 {
    // Funções colocam aqui



    public static void main(String[] args){
        // Criação das classes
        Scanner Scanner = new Scanner(System.in); // Recebe informação
        Random Random = new Random(); // Random
        ArrayList<Integer> lista = new ArrayList<>(); // Lista

        // Resto do código
        System.out.println("Digite um tamanho: ");
        int tamanho = Scanner.nextInt();

        for (int i=1; i<=tamanho; i++){
            int num = Random.nextInt(100);
            lista.add(num);
        }

        System.out.println("A lista tem o tamanho: "+tamanho);
        System.out.println("Estes são os valores da lista"+lista);

        for (var valor : lista) {
            if (valor % 3 == 0){
                System.out.println("O valor "+valor+" é multiplo de 3.");
            }
            else if (valor % 2 == 0) {
                System.out.println("O valor "+valor+" é par.");
            }
            else {
                System.out.println("O valor "+valor+" é impar.");
            }

        }
    }
}
