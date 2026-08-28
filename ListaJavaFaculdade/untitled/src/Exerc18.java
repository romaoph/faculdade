import java.util.Scanner;

public class Exerc18 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma quantidade de segundos: (s)");
        int totalSegundos  = sc.nextInt();

        int horas = totalSegundos / 3600;
        int restoSegundos = totalSegundos  % 3600;
        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;

        System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");

        sc.close();
    }
}
