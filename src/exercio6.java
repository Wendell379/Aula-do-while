import java.util.Scanner;

public class exercio6 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int num2;
        do {
            IO.println(" 1 2 3");
            num2 = sc.nextInt();
            if (num2 == 1) {
                IO.println("Olá");
            } else if (num2 == 2) {
                IO.println("Maneiro");
            } else if (num2 == 3) {
                IO.println("nulo");
            }
        } while (num2 != 3) ;
    }
}