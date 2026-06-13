import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota);

        System.out.println("\nResultado:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Situação: " + aluno.verificarSituacao());

        sc.close();
    }
}