import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n1Scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        double n1 = n1Scanner.nextDouble();

        Scanner n2Scanner = new Scanner(System.in);
        System.out.print("Digite outro numero inteiro: ");
        double n2 = n2Scanner.nextDouble();

        System.out.print("O valor da soma dos dois numeros é: " + (n1+n2));
    }
}