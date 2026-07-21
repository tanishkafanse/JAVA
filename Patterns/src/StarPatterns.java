public class StarPatterns {

    public static void main(String[] args) {

        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
        pattern12();
    }

    // 1. Left Triangle
    static void pattern1() {
        System.out.println("\nPattern 1");
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 2. Inverted Left Triangle
    static void pattern2() {
        System.out.println("\nPattern 2");
        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 3. Center Pyramid
    static void pattern3() {
        System.out.println("\nPattern 3");
        for(int i=1;i<=7;i++){
            for(int s=1;s<=7-i;s++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 4. Inverted Center Pyramid
    static void pattern4() {
        System.out.println("\nPattern 4");
        for(int i=7;i>=1;i--){
            for(int s=1;s<=7-i;s++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 5. Right Triangle
    static void pattern5() {
        System.out.println("\nPattern 5");
        for(int i=1;i<=7;i++){
            for(int s=1;s<=7-i;s++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 6. Inverted Right Triangle
    static void pattern6() {
        System.out.println("\nPattern 6");
        for(int i=7;i>=1;i--){
            for(int s=1;s<=7-i;s++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 7. Diamond
    static void pattern7() {
        System.out.println("\nPattern 7");
        int n=7;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 8. Reverse Diamond
    static void pattern8() {
        System.out.println("\nPattern 8");
        int n=7;

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 9. Full Pyramid
    static void pattern9() {
        System.out.println("\nPattern 9");
        int n=7;

        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // 10. Inverted Full Pyramid
    static void pattern10() {
        System.out.println("\nPattern 10");
        int n=7;

        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // 11. Hourglass
    static void pattern11() {
        System.out.println("\nPattern 11");
        int n=4;

        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i=2;i<=n;i++){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // 12. Full Diamond
    static void pattern12() {
        System.out.println("\nPattern 12");
        int n=4;

        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}