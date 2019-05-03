import CarFacade.Car.CarSize.CarCapacity;

//refactored code

public class main {
    public static void main(String[] args) {

        String carModel = "Toyota Corolla";
        String carSize = "large";
        int carCapacity = 5;
        VehicleFacade facade = new VehicleFacade();
        facade.start(carModel, truckSize, busCapacity);
    }
}

public class CarFacade {
    private Car car;
    private CarSize carSize;
    private CarCapacity carCapacity;

    public VehicleFacade(){
        this.car = new Car();
        this.carSize = new CarSize();
        this.carCapacity = new CarCapacity();
    }

    public void start(carModel, carSize, carCapacity) {
        this.car.SetModel(carModel);
        this.carSize.SetSize(truckSize);
        this.carCapacity.SetCapacity(busCapacity);
    }
}


public class Car {

    private String name;
    private String model;

    public Car() {

    }

    public String getName() {
        return this.name;
    }

    public String SetName(name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public String SetModel(model) {
        this.model = model;
    }
}


public class CarSize {

    private String size;

    public CarSize() {

    }

    public String getSize() {
        return this.size;
    }

    public String SetSize(size) {
        this.size = size;
    }
}



public class CarCapacity {

    private int capacity;

    public CarCapacity() {

    }

    public String getCapacity() {
        return this.capacity;
    }

    public int SetCapacity(capacity) {
        this.capacity = capacity;
    }
}