import java.util.Scanner;

public class Exerc16 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorDesc,valorFinal;

        System.out.println("Digite o valor de um produto: (R$)");
        double valor = sc.nextDouble();

        System.out.println("Digite o percentual de desconto (%): ");
        double desc = sc.nextDouble();

        valorDesc = valor * (desc / 100);
        valorFinal = valor - valorDesc;

        System.out.println("Preço incial do produto (R$): " +valor+ " \nPorcentagem descontada: (%)" +desc+ " \nNovo valor: (R$)" +valorFinal);

        sc.close();
    }
}
