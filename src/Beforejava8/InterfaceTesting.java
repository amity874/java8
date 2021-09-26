package Beforejava8;

public class InterfaceTesting {
}
interface nowjava8{
    /**
     * Abstract method
     */
    public void method1();
    /**
     * default method
     */
    default public void method2(){
        System.out.println("Inside defsult method");
    }
}


class Child1 implements nowjava8{
    //method 2 will already available for this class
    @Override
    public void method1(){
        System.out.println("Implement method 1");
    }
}




interface A{
    default void eat(){
        System.out.println("Ëating like A");
    }
}
interface B{
    default void eat(){
        System.out.println("Eating like B");
    }
}

class C implements A,B{
    @Override
    public void eat() {
        System.out.println("Implementing eat method myself");
        A.super.eat();
    }
    //if you are in ambiguity situation and override eat method
    /**
     * what if i want to parent A eat method
     */
}