package Transport;

public class Bicycle extends transport {


    public Bicycle(String type, String modelName, int wheelsCount) {
        super(type, modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем шину велосипеда");
    }
}