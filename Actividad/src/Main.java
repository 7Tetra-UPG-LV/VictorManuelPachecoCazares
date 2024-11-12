import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println("Alunos");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sacaste 10 felicidades1");
        String[] notas = new String[n];
        for (int i = 0; i < n; i++) {
            notas[i] = sc.next();


        }

    }
}