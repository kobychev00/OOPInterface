import Transport.transport;

public class Car extends transport {

        public Car(String type, String modelName, int wheelsCount) {
            super(type, modelName, wheelsCount);
        }

        public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель авто");
    }
}
