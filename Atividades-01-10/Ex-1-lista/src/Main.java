import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 1");
        Scanner sc = new Scanner(System.in);
        double pesoFinal = 70.0;
        double pesoAtividade = 30.0;

        System.out.println("Digite o valor da nota final: ");
        double notaFinal = sc.nextDouble();
        System.out.println("Digite o valor das atividades: ");
        double atividade = sc.nextDouble();

        double mediaPonderada = (notaFinal * (pesoFinal / 100.0) + (atividade * (pesoAtividade / 100.0)));
        if (mediaPonderada >= 6) {
            System.out.printf("Notas das provas: %.2f%n", notaFinal);
            System.out.printf("Nota das atividades: %.2f%n", atividade);
            System.out.printf("Média final: %.2f%n", mediaPonderada);
            System.out.println("Situação: Aprovado");
        } else {
            System.out.printf("Notas das provas: %.2f%n", notaFinal);
            System.out.printf("Nota das atividades: %.2f%n", atividade);
            System.out.printf("Média final: %.2f%n", mediaPonderada);
            System.out.println("Situação: Reprovado");
        }


    }
}