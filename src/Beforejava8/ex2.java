package Beforejava8;

import jdk.swing.interop.LightweightFrameWrapper;

import java.sql.SQLOutput;

public class ex2 {
    public static void sendMessage(Message message){
        message.sendMessage();
    }
    public static void main(String[] args) {
        /**
         * Send the message in english,French
         */
        /**
         * ()->{} Anonymous function
         */
        sendMessage(new EnglishMessage());//polymorphism
        sendMessage(new FrenchMessage());//polymorphism
//        sendMessage(new Message() {
//            @Override
//            public void sendMessage() {
//                System.out.println("Sending msg in sanskrit");
//            }
//        });
        sendMessage(
            () ->{//called as lambda expression
                System.out.println("Sending the message in sanskrit");
            }
        );
    }
}
/**
 * Functional interface
 */
@FunctionalInterface
interface Message{
    public  void sendMessage();
    public default void getMessage(){
        System.out.println("Hey");
    }
    public default void getMessage1(){
        System.out.println("Hey");
    }
}
class EnglishMessage implements  Message{
    public void sendMessage(){
        System.out.println("sending msg in english");
    }
}
class FrenchMessage implements Message{

    @Override
    public void sendMessage() {
        System.out.println("Sending msg in french");
    }
}