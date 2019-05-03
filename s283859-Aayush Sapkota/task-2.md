Sample code

public class vehicle {
    public static main void(String[] args) {
        Car car1 = new Car();
        car1.printVehicle();
        
        AnotherCar car2 = new AnotherCar();
        car2.printVehicle();

        Truck car3 = new Truck();
        car3.printVehicle();

    }
}

public class Car {

    public void printVehicle {
        System.out.println("A vehicle");
    }
}

public class TnotherCar {

    public void printVehicle {
        System.out.println("Another vehicle");
    }
}

public class Truck {

    public void printVehicle {
        System.out.println("this is a truck");
    }
}

Title: Why should factory method be implemented find an example dirty code and refactor it to factory method

Reason:
since all of these classes have same methods and of very similar kind. As we add another type of vehicle in this program we need to create another instance of the same class to use it. This will result in class soup as more and more classes are added. To prevent this, code should be reactored to factory patterns as it provide easy way to create object of class and is easier to maintain in the future.


Refactored code:

//creating a interface for the vehicle types
public interface vehicle {
    void printVehicle();
}

//
//refactoring class to implements that interface
//
public class Car implements vehicle {
    @override
    public void printVehicle {
        System.out.println("A vehicle");
    }
}

public class AnotherCar implements vehicle{
    @override
    public void printVehicle {
        System.out.println("Another vehicle");
    }
}

public class Truck implements vehicle{
    @override
    public void printVehicle {
        System.out.println("this is a truck");
    }
}

//
//creating a factor for generating those class objects
//
public class VehicleFactory {
    public vehicle getVehicle(String vehicleType) {
      if(vehicleType == null){
         return null;
      }		
      if(vehicleType.equalsIgnoreCase("Car")){
         return new Car();
         
      } else if(vehicleType.equalsIgnoreCase("AnotherCar")){
         return new AnotherCar();
         
      } else if(vehicleType.equalsIgnoreCase("Truck")){
         return new Truck();
      }
      
      return null;  
    }
}


//example of implementation
public class Main{
    public static void main(String[] args) {


        VehicleFactory vehicleFactory = new VehicleFactory();

        //consistent way to create class objets
        Vehicle car = vehicleFactory.getVehicle("Car");
        Vehicle anotherCar = vehicleFactory.getVehicle("AnotherCar");
        Vehicle Truck = vehicleFactory.getVehicle("Truck");
    }

   

}
