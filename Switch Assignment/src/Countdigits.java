 

public class Countdigits {
    public static void main(String[] args) {
    	java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}