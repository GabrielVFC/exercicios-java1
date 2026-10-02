import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor total da compra: ");
        double valorFinal = sc.nextDouble();

        if (valorFinal == 200.0){
            double desconto = 5.0;
            double valorDesconto = valorFinal * (desconto / 100.0);
            double total = valorFinal - valorDesconto;
            System.out.printf("Valor da Compra: R$ %.2f%n", valorFinal);
            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Valor final com o desconto: R$ %.2f%n", total);
        } else if (valorFinal > 200.0 && valorFinal <= 500.0){
            double desconto = 10.0;
            double valorDesconto = valorFinal * (desconto / 100.0);
            double total = valorFinal - valorDesconto;
            System.out.printf("Valor da Compra: R$ %.2f%n", valorFinal);
            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Valor final com o desconto: R$ %.2f%n", total);

        } else if (valorFinal > 500.0){
            double desconto = 15.0;
            double valorDesconto = valorFinal * (desconto / 100.0);
            double total = valorFinal - valorDesconto;
            System.out.printf("Valor da Compra: R$ %.2f%n", valorFinal);
            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Valor final com o desconto: R$ %.2f%n", total);
        } else {
            System.out.printf("Valor da Compra sem desconto: R$ %.2f%n", valorFinal);

        }
    }
}