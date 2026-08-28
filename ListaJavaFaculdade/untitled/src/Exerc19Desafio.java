import java.util.Scanner;

public class Exerc19Desafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu Salário bruto (R$): ");
        double salBruto = sc.nextDouble();
        System.out.println("Digite o Percentual de desconto (%): ");
        double desc = sc.nextDouble();
        System.out.println("Digite seu Percentual de Vale/Alimentação (%): ");
        double va = sc.nextDouble();

        double somaDesc = salBruto * (desc / 100);
        double somaVa = salBruto * (va / 100);
        double  salLiq = salBruto - somaDesc - somaVa;

        System.out.println("Seu salário líquido: " +salLiq);







                sc.close();
    }
}
