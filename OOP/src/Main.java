public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.color);
        System.out.println(myCar.price);
        System.out.println(myCar.year);

        myCar.drive();
        myCar.brake();

    }
}
