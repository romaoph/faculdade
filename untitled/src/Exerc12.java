import java.util.Scanner;

public class Exerc12 {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double media;

        System.out.println("Digite a primeira nota: ");
        int n1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int n2 = sc.nextInt();
        System.out.println("Digite a terceira nota: ");
        int n3 = sc.nextInt();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Nota 1: " +n1+ " | Nota 2: " +n2+ " | Nota 3: " +n3+ " | Média: " +media);

    sc.close();
    }
}
