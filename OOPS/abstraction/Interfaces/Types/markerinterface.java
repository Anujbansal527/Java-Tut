import java.io.Serializable;

interface MyMarkerInterface extends Serializable{

}

public class markerinterface {
    public static void main(String[] args) {
        // Marker interface does not have any methods or variables
        MyMarkerInterface mi = new MyMarkerInterface() {
            // No implementation needed
        };

        System.out.println(mi instanceof Serializable);
    }    
}


/*
  Marker interfaces, often called tag interfaces, are interfaces 
  without any methods declared. Simply said, they serve as markers, 
  signalling that a class that implements the marker interface has 
  particular properties or qualities. The Java runtime environment 
  and other tools make use of these APIs to deliver extra functionality
   or data. Serializable, Cloneable, and Remote are some instances of marker 
   interfaces in Java.
 */