import java.util.Scanner;

public class DesafioFinal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String name = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do curso: ");
        String curso = sc.nextLine();

        System.out.println("Digite o termo: ");
        int termo = sc.nextInt();

        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a primeira nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a primeira nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("=================================\n" +
                                    "DADOS DO ALUNO\n" +
                           "=================================");

        System.out.println("\nNome: " +name+ " \nIdade: " +age+ " \nCurso: " +curso+ " \nTermo: " +termo);
        System.out.println("Nota 1: " +n1+ " \nNota 2: " +n2+ " \nNota 3: " +n3);
        System.out.println("Média: " +media);

        sc.close();
    }
}
