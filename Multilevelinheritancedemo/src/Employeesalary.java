class salary{
     int a=45000;
}
     class bonus extends salary{
         int b=4500;
         int total;
         
         void printbonus(){
             total=a+b;
             System.out.println("Employee bonus is:"+b);
             System.out.println("Employee salary is:"+a);
             System.out.println("Employee total Salary:"+total);
         }
     }
    public class Employeesalary{
         public static void main(String[] args) {
          bonus b1=new bonus();
          b1.printbonus();
             
            
             
             
             

         }
         
     }
    
