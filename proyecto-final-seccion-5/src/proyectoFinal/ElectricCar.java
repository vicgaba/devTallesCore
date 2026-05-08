package proyectoFinal;

public class ElectricCar extends Car implements Electric{
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }
    @Override
    public void start() {
        System.out.println("El auto eléctrico arrancó");
    }


    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("La batería está cargada al 100%");
    }

    @Override
    public String toString() {
        return super.toString() + " batteryLevel=" + batteryLevel;
    }
}
