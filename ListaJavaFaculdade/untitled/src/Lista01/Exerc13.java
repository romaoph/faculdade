import java.util.Scanner;

public class Exerc13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double conversao;

        System.out.println("Digite um valor em Reais(R$): ");
        double valReal = sc.nextDouble();

        System.out.println("Digite uma cotação do Dolar($): ");
        double cotacao = sc.nextDouble();

        conversao = valReal / cotacao;

        System.out.println("Valor em real: " +valReal+ " Cotação US$: " +cotacao+ " → US$ " +conversao);


        sc.close();
    }
}
