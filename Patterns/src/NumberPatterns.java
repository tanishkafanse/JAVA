public class NumberPatterns {

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

    // Pattern 1
    static void pattern1() {
        System.out.println("\nPattern 1");
        for(int i=1;i<=7;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    static void pattern2() {
        System.out.println("\nPattern 2");
        for(int i=7;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    static void pattern3() {
        System.out.println("\nPattern 3");
        for(int i=1;i<=7;i++) {
            for(int s=1;s<=7-i;s++)
                System.out.print("  ");

            for(int j=1;j<=i;j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }

    // Pattern 4
    static void pattern4() {
        System.out.println("\nPattern 4");
        for(int i=7;i>=1;i--) {
            for(int s=1;s<=7-i;s++)
                System.out.print("  ");

            for(int j=1;j<=i;j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }

    // Pattern 5
    static void pattern5() {
        System.out.println("\nPattern 5");
        int n=7;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++)
                System.out.print(j + " ");
            System.out.println();
        }

        for(int i=n-1;i>=1;i--) {
            for(int j=1;j<=i;j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // Pattern 6
    static void pattern6() {
        System.out.println("\nPattern 6");
        int n=7;

        for(int i=n;i>=1;i--) {

            for(int s=1;s<=n-i;s++)
                System.out.print("  ");

            for(int j=1;j<=i;j++)
                System.out.print(j + " ");

            System.out.println();
        }

        for(int i=2;i<=n;i++) {

            for(int s=1;s<=n-i;s++)
                System.out.print("  ");

            for(int j=1;j<=i;j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }

    // Pattern 7 - Floyd Triangle
    static void pattern7() {
        System.out.println("\nPattern 7");
        int num=1;

        for(int i=1;i<=7;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Pattern 8
    static void pattern8() {
        System.out.println("\nPattern 8");
        for(int i=1;i<=7;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Pattern 9
    static void pattern9() {
        System.out.println("\nPattern 9");
        for(int i=1;i<=7;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print((8-j) + " ");
            }
            System.out.println();
        }
    }

    // Pattern 10
    static void pattern10() {
        System.out.println("\nPattern 10");
        for(int i=1;i<=7;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i+j-1 + " ");
            }
            System.out.println();
        }
    }

    // Pattern 11
    static void pattern11() {
        System.out.println("\nPattern 11");

        int n=7;

        for(int i=1;i<=n;i++) {

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
                System.out.print(j);

            for(int j=i-1;j>=1;j--)
                System.out.print(j);

            System.out.println();
        }
    }

    // Pattern 12
    static void pattern12() {
        System.out.println("\nPattern 12");

        int n=7;

        for(int i=n;i>=1;i--) {

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
                System.out.print(j);

            for(int j=i-1;j>=1;j--)
                System.out.print(j);

            System.out.println();
        }
    }
}
