package Beforejava8;

public class Testing {


}


abstract class AbstractClassFeatures{
    private int a;
    protected int b;
    public int c;
    public AbstractClassFeatures(){};
    public static void eat(){
        System.out.println("Eating");
    }
    /**
     * method:
     * static non static  final
     */
}
interface javaEightInterfaceFeature{
    /**
     * method:
     * abstract
     * default static
     */
//    privat int a;//we cant define private method
//protected int b;
//    public int c;//final b
    public int c=9;//we can't have uninitialize variable because it is final by default
//    public javaEightInterfaceFeature(){};
default public void eat(){
    System.out.println("Eating");
}
    static public void eat1(){
        System.out.println("Eating");
    }
}

