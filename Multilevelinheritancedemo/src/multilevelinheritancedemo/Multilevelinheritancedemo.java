// write a progrom for multilevel Inheritancedemo
import java.io.*;
import java.util.*;

class one{
    public void printone(){
    System.out.println("one class" );    
                 }
        }
     
  class Two extends one{
             public void printtwo(){
             System.out.println("Two class");
                    }
         }
class Three extends Two{
    public void printthree(){
    System.out.println("Three class");       
    }
}
class Four extends Three{
        public void printfour(){
        System.out.println("four class");
        
    }
}
      public class Multilevelinheritancedemo{
          public static void main(String[] args) {
              Four f= new Four();
              f.printone();
              f.printtwo();
              f.printthree();
             }
              
    }
    
    
