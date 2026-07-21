//Wap to check whether a  no is +ve -ve or zero also if the no +ve also print whether it even or odd
public class NestedIfEx1 {
       public static void main(String[] args) {
    	   java.util.Scanner sc=new java.util.Scanner(System.in);
    	   System.out.println("Enter your Number :");
     	  int n=sc.nextInt();
    	   if(n > 0 ) {
    		   System.out.println("No is +ve");
    		   if( n % 2==0) {
        		   System.out.println("No is even");
    		   }else {
        		   System.out.println("No is odd");
        	   }
     	   } else if(n<0) {
    		   System.out.println("No is -ve");
           }else {
    		   System.out.println("No is +zero");
           }
		   System.out.println("Thank You");

	   }
}
