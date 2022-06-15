import java.io.*;
import java.io.*;
class parent{
          void print(){
          System.out.println("parent class");
         }
}
   class child1 extends parent{
              void printchild1(){
              System.out.println("child class 1");
         }
   }
        class child2 extends parent{
               void printchild2(){
               System.out.println("child class 2");
         }
   }
      public class Runtimepolydemo{
          public static void main(String[] args) {
             parent a;
             a=new child1();
             a.print();
             
             a=new child2();
             a.print();
          }
             
       }
    
       