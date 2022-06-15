import java.io.*;
import java.util.*;
 class pattern{
     public void display(){
          for(int i=0;i<10;i++)
             
              System.out.print("*");
     }    
 
       public void display(char var){
           for (int i=0;i<10;i++){
           System.out.print(var);
            }
       } 
  }
       class patternpolymorphirsmoverloading{
         public static void main(String[] args) {
           pattern p=new pattern();
           p.display();
           System.out.println();
           p.display('#');
           System.out.println();    
         }
     }
