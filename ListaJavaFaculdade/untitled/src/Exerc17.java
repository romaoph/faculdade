import java.util.Scanner;

public class Exerc17 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valFinal;

        System.out.println("Digite o valor total da conta: (R$)");
        double valTot = sc.nextDouble();

        System.out.println("Digite a quantidade de pessoas:");
        int pessoas = sc.nextInt();

        valFinal = valTot / pessoas;

        System.out.println("Cada pessoa irá pagar: (R$)" + valFinal);


        sc.close();
    }
}
