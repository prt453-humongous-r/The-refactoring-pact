
Code 1 Sample:

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

Title: Implementing singleton pattern to the code to avoid creation of multiple car class instance

Motivation to refactor:
Car class can be instantia\ted as many times as other classes want. The value returned when these instance are queried is not the same. Also, many instance of the same class can change the value of the class if they wanted to.
This is not secure in application that are like services and one instance of it only needs to exist in the application.

Pattern: By using singleton pattern we can make sure only one instance of a class exist in the entire application runtime.

Refactored code:

public class Car {

    private String name;
    private String model;

    private static CarK\Onstance = new Car();
    private Car();

    public static Car getInstance() {
        return CarInstance;
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

instantiation example

public class main {
    public static void main(String[] args){
        Car carInstance = Car.getInstance();

        carInstance.model = model;
    }
}