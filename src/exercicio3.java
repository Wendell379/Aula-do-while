import java.util.Scanner;

public class exercicio3 {
    void main () {
        Scanner sc = new Scanner(System.in);
        int senha;
        do {
            IO.println("Digite sua senha:");
            senha = sc.nextInt();
        } while (senha != 1234);
        IO.println("Senha Correta! Celular desbloqueado.");
    }
}