import java.util.Scanner;

public class exercicio5 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um número:");
        int tabuada = sc.nextInt();
        int i = 0;
        IO.println(i <= 10);
        do {
            i++;
            IO.println(i * tabuada);
        } while (i < tabuada);
    }
}