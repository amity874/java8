package Beforejava8;
public class ex1 {
}
/**
 * 100%abstraction
 */
interface SampleInterface{
    public  void method();
    public void method2();
    public void method3();
//    public void method4(){//we can't do this
//        System.out.println("Hello");
//    }
}
abstract class  SampleInterface1{
abstract public  void method();
abstract public void method2();
abstract public void method3();
    public void method4(){//we can do this
        System.out.println("Hello");
    }
}
