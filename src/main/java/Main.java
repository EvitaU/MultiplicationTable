import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        for (a = 1; a <= 10; ++a) {
            for (b = 1; b <= 10; ++b) {
                System.out.print(a * b + "\t ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to generate multiplication table: ");
        int c = scanner.nextInt();

       for (int i=1; i<=10; i++){
            System.out.print(i*c + "\t ");

        }
    }

}


