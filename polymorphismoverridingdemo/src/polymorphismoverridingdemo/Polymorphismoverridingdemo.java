
import java.io.*;
class pattern{
  public void displayinfo(){
      System.out.println();
  }
  
}
class langauge1 extends pattern {
     public void main (){
         System.out.println("langauge English");
     }
}
class polymophismoverridingdemo{
    public static void main(String[] args) {
    pattern var=  new pattern();
    System.out.println("Langauge1");
    
    }
}