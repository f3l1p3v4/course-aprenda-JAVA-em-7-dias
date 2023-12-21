import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2456, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programing",
                "C++"
        };

        //Array 01
        System.out.println("Lista 01 Original: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Lista 01 Ordenada: " + Arrays.toString(my_array1));

        //Array 02
        System.out.println("Lista 02 Original: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Lista 02 Ordenada: " + Arrays.toString(my_array2));
    }
}