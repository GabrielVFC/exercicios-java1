import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 5");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário bruto do trabalhador: ");
        double salarioBruto = sc.nextDouble();

        double imposto = 10.0;

        double valorImposto = salarioBruto * (imposto / 100.0);
        double salarioLiquido = salarioBruto - valorImposto;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto de 10%% R$ %.2f%n", valorImposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
    }
}