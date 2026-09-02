import java.util.Scanner;

public class Exerc11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma, sub, mult, div;

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;

        System.out.println("Soma : " +soma+ " \nSubtração: " +sub+ " \nMultiplicação: " +mult+ " \nDivisão: " +div);

        sc.close();
    }
}
