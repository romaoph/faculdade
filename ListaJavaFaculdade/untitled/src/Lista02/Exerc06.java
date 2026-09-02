import java.util.Scanner;

public class Exerc06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro inteiro:");
        int lado1 = sc.nextInt();

        System.out.println("Digite o segundo inteiro:");
        int lado2 = sc.nextInt();

        System.out.println("Digite o terçeiro inteiro:");
        int lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Triângulo inválido");
        }
        sc.close();
    }
}
