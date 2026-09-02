import java.util.Scanner;

public class Exerc15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double compra;

        System.out.println("Digite o nome do produto: ");
        String nomeProd = sc.nextLine();

        System.out.println("Digite o preço unitário: ");
        double precoUnit = sc.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quant = sc.nextInt();

        compra = precoUnit * quant;

        System.out.println("Valor total da compra: R$ " +compra);

        sc.close();
    }
}
