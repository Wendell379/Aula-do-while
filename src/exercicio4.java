import java.util.Scanner;

public class exercicio4 {
    void main () {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um número:");
        int soma = sc.nextInt();
        int i = 1;
        do {
            IO.println(i <=soma);

            IO.println(i++);
        } while (soma != i);

    }
}
