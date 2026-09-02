import java.util.Scanner;

public class Exerc04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mais, menos, mult,div;


        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Digite um caractere (+, -, *, /):");
        String texto = sc.next();
        char carac = texto.charAt(0);

        if(carac == '+'){
            mais = num1 + num2;
            System.out.println(mais);
        }else if(carac == '-'){
            menos = num1 - num2;
            System.out.println(menos);
        }else if(carac == '*'){
            mult = num1 * num2;
            System.out.println(mult);
        }else if(carac == '/'){
            if(num2 <= 0){
                System.out.println("Não é possível dividir por zero");
            }else {
                div = num1 / num2;
                System.out.println(div);
            }
        }
        sc.close();
    }
}
