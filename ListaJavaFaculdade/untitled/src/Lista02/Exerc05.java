import java.util.Scanner;

public class Exerc05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = sc.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("Bissexto");
                } else {
                    System.out.println("Não Bissexto");
                }
            } else {
                System.out.println("Bissexto");
            }
        } else {
            System.out.println("Não Bissexto");
        }


        sc.close();
    }
}
