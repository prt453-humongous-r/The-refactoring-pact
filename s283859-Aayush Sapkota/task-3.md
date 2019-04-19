//
//Aayush Sapkota
//s283859
//

public class Laptop {

    public laptop();

    public connectMonitor(String portType) {
        if(portType == "displayport"){
            //connection logic
        }
    }
}

public class monitor {
    
    private string connectionType = "HDMI";

    public monitor() {

    }

    public int getConnectionType() {
        return this.connectionType();
    }
}


public class main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        Monitor monitor = new Monitor();
        
        //cannot connect in this case does nothing
        laptop.connectMonitor(monitor.getConnetionType);
    }
}


Title: Adapter Pattern implementation and why is it needed

Reason:
In the example above the the laptop is not camptible with the monitor as connection type is different to fix this we need to use a adapter that connects monitor to laptop. Adapter patterns
allow to classes to work togather when they are incompatible to each other so, are very important.

Refactored code


public class Laptop {

    public laptop();

    public connectMonitor(String portType) {
        if(portType == "displayport"){
            //connection logic
        }
    }
}

public class monitor {
    
    private string connectionType = "HDMI";

    public monitor() {}

    public int getConnectionType() {
        return this.connectionType();
    }
}

public class HdmiToDpConvertor{

    public class HdmiToDPConvertor (){}

    public void convert(String connectionType){
     //conversion logic
     //return dp connection
    }
}


public class main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        Monitor monitor = new Monitor();
        String connectionType = monitor.getConnectionType();
        
        HdmiToDpConvertor convertor = new HdmiToDpConvertor();

        String dpConnection = covertor.convert(connectionType);

        //Connects as laptop recives dp connection
        laptop.connectMonitor(dpConnection);
    }
}

