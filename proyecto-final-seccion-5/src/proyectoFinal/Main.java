package proyectoFinal;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Fiat", "Duna", 2000, CarType.SEDAN);
        Vehicle myElectricCar = new ElectricCar("Toyota", "Corolla", 2025, CarType.SEDAN, 100);

        myCar.start();
        myElectricCar.start();
        ((ElectricCar)myElectricCar).chargeBattery();

        System.out.println(myElectricCar);
        System.out.println(myCar);
    }
}
