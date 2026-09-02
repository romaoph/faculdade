import java.util.Scanner;

public class Exerc01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }
        sc.close();
    }
}
