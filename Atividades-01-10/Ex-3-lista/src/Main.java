import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 3");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da distância: ");
        int distancia = sc.nextInt();
        System.out.println("Digite o valor do consumo médio: ");
        int consumoMedio = sc.nextInt();

        int quantidadeDeCombustivel = distancia / consumoMedio;

        System.out.printf("Distância: %d km%n", distancia);
        System.out.printf("Consumo médio: %d km%n", consumoMedio);
        System.out.printf("Quantidade de combustível necessária: %d litros", quantidadeDeCombustivel);
    }
}