interface MyFunInterface{
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        MyFunInterface obj = ()-> System.out.println("Hello World");
        obj.show();
    }
}

/*
 * Single Abstract Method (SAM) Interfaces
Prior to Java 8, there were certain kinds of functional interfaces called SAM interfaces.
These interfaces can have any number of default or static methods, but only one abstract 
method. Runnable, Comparator, and MouseListener are a few pre-Java 8 APIs that contain SAM 
interface examples. With the introduction of functional interfaces in Java 8, SAM interfaces
can be used with lambda expressions and considered as functional interfaces.

 */