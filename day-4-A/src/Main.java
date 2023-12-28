public class Main {
    public static void main(String[] args) {
        // Números Páres
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        // Números Ímpares
        for (int x = 0; x <= 100; x++) {
            if (x % 2 != 0) {
                System.out.println(x + " ");
            }
        }
    }
}