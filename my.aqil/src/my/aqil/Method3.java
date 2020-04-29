/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.aqil;

/**
 *
 * @author Administrator
 */
public class Method3 {
    
    public static void main(String[]args){
        MyInterface myInterface = () -> System.out.println("Hello Method3");
        myInterface.sayHello();
    }
    
}
