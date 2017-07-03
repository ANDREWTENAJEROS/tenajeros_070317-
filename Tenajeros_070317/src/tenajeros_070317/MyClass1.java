/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tenajeros_070317;

interface MyInterface{
    void iMethod();
}
public class MyClass1 implements MyInterface {

   public void iMethod(){
       System.out.println("Interface method.");
   }
   void myMethod(){
        System.out.println("Another method.");
   }
 }  
   class MyClass2 implements MyInterface{
       public void iMethod(){
           System.out.println("Another implementation.");
       }
   }
class InterfaceDemo{
    public static void main (String[] args){
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        mc1.iMethod();
        mc1.myMethod();
        mc2.iMethod();
    }
}
    

