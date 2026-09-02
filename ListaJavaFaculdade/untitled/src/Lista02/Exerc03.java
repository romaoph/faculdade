import java.util.Scanner;

public class Exerc03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10:");
        double nota = sc.nextDouble();

        if(nota >= 6){
            System.out.println("Aprovado");
        }else if(nota >= 4 && nota <= 5.9){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
