import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 2");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia que você nasceu: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês que você nasceu: ");
        int mes = sc.nextInt();
        System.out.println("Digite o ano que você nasceu: ");
        int ano = sc.nextInt();

        int anoAtual = 2026;
        int diaAtual = 1;
        int mesAtual = 10;
        int idade = anoAtual - ano;

        if (mes > mesAtual || (mes == mesAtual && dia > diaAtual)){
            idade--;
        }

        System.out.printf("Data de nascimento: %d/%d/%d%n", dia, mes, ano);
        System.out.printf("Idade: %d anos%n", idade);

        if (idade >= 18){
            System.out.println("Entrada permitida: sim");
        } else {
            System.out.println("Entrada permitida: não");
        }
    }
}