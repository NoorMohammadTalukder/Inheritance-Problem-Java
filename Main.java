public class Main{
  public static void main(String[] args){
    
    Manager m1=new Manager(1,"Rayhan",2000,"Dhaka");
    m1.showManagerDetails();

    Salesman s1=new Salesman(2,"Abdullah",500,"Dhaka","T-Shirt",1);
    s1.showSalesmanDetails();

    System.out.println("-------------After Increament-----------------");
    m1.incrementSalary(s1,1000);
    s1.showSalesmanDetails();
   
  }
}