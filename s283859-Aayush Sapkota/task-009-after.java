import java.util.HashMap; 
import java.util.Map; 
  
//class participant prototype
abstract class CarPrototype implements Cloneable 
{ 
      
    protected String CarName; 
       
    abstract void addCar(); 
       
    public Object clone() 
    { 
        Object clone = null; 
        try 
        { 
            clone = super.clone(); 
        }  
        catch (CloneNotSupportedException e)  
        { 
            e.printStackTrace(); 
        } 
        return clone; 
    } 
}

//class participant prototype registry
class CarRegistry { 
   
    private static Map<String, Car> CarMap = new HashMap<String, Car>();  
       
    static 
    { 
        CarMap.put("blue", new blueCar()); 
        CarMap.put("black", new blackCar()); 
    } 
       
    public static Car getCar(String CarName) 
    { 
        return (Car) CarMap.get(CarName).clone(); 
    } 
} 

//client
class Client 
{ 
    public static void main (String[] args) 
    { 
        //here you call methods you want
        //each call will give you a clone 
        CarRegistry.getCar("blue").addCar(); 
        CarRegistry.getCar("black").addCar(); 
        CarRegistry.getCar("black").addCar(); 
        CarRegistry.getCar("blue").addCar(); 
    } 
} 

class blueCar extends Car

{ 
    public blueCar()  
    { 
        this.CarName = "blue"; 
    } 
   
    @Override
    void addCar()  
    { 
        System.out.println("Blue Car added"); 
    } 
      
} 
  
class blackCar extends Car{
   
    public blackCar() 
    { 
        this.CarName = "black"; 
    } 
   
    @Override
    void addCar()  
    { 
        System.out.println("Black Car added"); 
    } 
} 
  