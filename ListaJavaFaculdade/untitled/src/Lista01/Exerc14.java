import java.util.Scanner;

public class Exerc14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salNovo,aumentado;

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu salário atual: ");
        double salAtual = sc.nextDouble();

        System.out.println("Digite o Percentual de aumento (%): ");
        double aumento = sc.nextDouble();

        aumentado = salAtual * (aumento / 100);
        salNovo = salAtual + aumentado;

        System.out.println("Salário atual: " +salAtual+ " \nPorcentagem acrescentada: " +aumento+ " \nNovo salário: " +salNovo);

        sc.close();
    }
}
