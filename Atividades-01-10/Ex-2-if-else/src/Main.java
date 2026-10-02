import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 2");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura atual: ");
        int temperatura = sc.nextInt();

        if (temperatura < 18){
            System.out.printf("Temperatura atual: %dºC%n", temperatura);
            System.out.println("Ligar o aquecedor");
        } else if (temperatura >=18 && temperatura <= 25){
            System.out.printf("Temperatura atual: %dºC%n", temperatura);
            System.out.println("Manter a temperatura atual");
        } else if (temperatura > 25){
            System.out.printf("Temperatura atual: %dºC%n", temperatura);
            System.out.println("Ligar o ar condicionado");
        }
    }
}