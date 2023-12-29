public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X6", 2023, 135_000 );

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor de venda: " + car.getValor());
    }
}