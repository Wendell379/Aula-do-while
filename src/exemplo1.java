import java.util.Scanner;

public class exemplo1 {
    void main () {
        Scanner sc = new Scanner(System.in);
        int senha;
        do {
            IO.println("Digite sua senha:");
            senha = sc.nextInt();
        } while (senha !=1234);
    }
}