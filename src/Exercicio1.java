import java.util.Scanner;
public class Exercicio1 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int senha;
        do {
            IO.println("Digite sua senha:");
            senha = sc.nextInt();
            if (senha != 1234) {
                IO.println("Senha Incorreta");
            }
        } while (senha != 1234);
        IO.println("Senha Correta! Celular desbloqueado.");
    }
}