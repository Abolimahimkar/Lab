//Write a java program to swap two variables
 // Sample: define swap(a,b)
 // temp:=a
 //a:=b
//b:=temp

   
    
      public class swap {
 
    public static void main(String[] args)
    {
 
        int a = 10;
        int b = 20;
 
        System.out.println("Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
 
        int temp = a;
        a = b;
        b = temp;
 
        System.out.println("swap");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}

  
      