import java.util.Scanner;

public class Exerc20Desafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de um produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor de um produto: (R$)");
        double valor = sc.nextDouble();

        System.out.println("Digite a quantidade disponível: ");
        int quant = sc.nextInt();

        System.out.println("Digite o percentual de desconto (%): ");
        double desc = sc.nextDouble();

        double valorBruto = valor * quant;
        double valorDesc = valorBruto * (desc / 100);
        double valorFinal = valorBruto - valorDesc;

        System.out.println("============Resumo da venda============"+ "\nNome do produto: " +nome+ " \nPreço incial do produto (R$): " +valor+ " \nQuantidade: " +quant+ " \nPorcentagem descontada (%): " +desc+ " \nNovo valor: (R$)" +valorFinal);
        sc.close();
    }
}
