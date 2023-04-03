import Transport.transport;

public class Truck extends transport {

        public Truck(String type, String modelName, int wheelsCount) {
            super(type, modelName, wheelsCount);
        }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
}