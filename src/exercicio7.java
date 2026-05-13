import java.util.Scanner;

public class exercicio7 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int num2;
        do {
            IO.println(" 1 2 3 4 5");
            num2 = sc.nextInt();
            if (num2 == 1) {
                IO.println("Somar");
            } else if (num2 == 2) {
                IO.println("Subtrair");
            } else if (num2 == 3) {
                IO.println("Multiplicar");
            } else if (num2 == 4) {
                IO.println("Dividir");
            } else if (num2 == 5) {
                IO.println("Sair");

        }
    } while (num2 != 3) ;
}
}
