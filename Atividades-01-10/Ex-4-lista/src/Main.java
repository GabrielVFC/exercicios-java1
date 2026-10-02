import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 4");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas vitórias o jogador 1 fez: ");
        int jogador1 = sc.nextInt();
        System.out.println("Digite quantas vitórias o jogador 2 fez: ");
        int jogador2 = sc.nextInt();

        int vitoria1 = 10;
        int vitoria2 = 5;

        int valorFinal1 = jogador1 * vitoria1;
        int valorFinal2 = jogador2 * vitoria2;

        System.out.printf("Vitórias do jogador 1: %d%n", jogador1);
        System.out.printf("Vitórias do jogador 2: %d%n", jogador2);
        System.out.printf("Pontuação do jogador 1: %d pontos%n", valorFinal1);
        System.out.printf("Pontuação do jogador 2: %d pontos%n", valorFinal2);
    }
}