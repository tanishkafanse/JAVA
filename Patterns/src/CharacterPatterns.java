public class CharacterPatterns {

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

    // 1
    static void pattern1() {
        System.out.println("\nPattern 1");
        for(int i=1;i<=7;i++) {
            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);
            System.out.println();
        }
    }

    // 2
    static void pattern2() {
        System.out.println("\nPattern 2");
        for(int i=7;i>=1;i--) {
            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);
            System.out.println();
        }
    }

    // 3
    static void pattern3() {
        System.out.println("\nPattern 3");
        for(int i=1;i<=7;i++) {

            for(int s=1;s<=7-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            System.out.println();
        }
    }

    // 4
    static void pattern4() {
        System.out.println("\nPattern 4");
        for(int i=7;i>=1;i--) {

            for(int s=1;s<=7-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            System.out.println();
        }
    }

    // 5
    static void pattern5() {
        System.out.println("\nPattern 5");

        for(int i=1;i<=7;i++) {
            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);
            System.out.println();
        }

        for(int i=6;i>=1;i--) {
            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);
            System.out.println();
        }
    }

    // 6
    static void pattern6() {
        System.out.println("\nPattern 6");

        for(int i=7;i>=1;i--) {

            for(int s=1;s<=7-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            System.out.println();
        }

        for(int i=2;i<=7;i++) {

            for(int s=1;s<=7-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            System.out.println();
        }
    }

    // 7
    static void pattern7() {
        System.out.println("\nPattern 7");

        for(int i=1;i<=7;i++) {
            for(int j=1;j<=i;j++)
                System.out.print((char)('A'+i-1));
            System.out.println();
        }
    }

    // 8
    static void pattern8() {
        System.out.println("\nPattern 8");

        for(int i=7;i>=1;i--) {
            for(int j=1;j<=i;j++)
                System.out.print((char)('A'+i-1));
            System.out.println();
        }
    }

    // 9
    static void pattern9() {
        System.out.println("\nPattern 9");

        int n=7;

        for(int i=1;i<=n;i++) {

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            for(char ch=(char)('A'+i-2); ch>='A'; ch--)
                System.out.print(ch);

            System.out.println();
        }
    }

    // 10
    static void pattern10() {
        System.out.println("\nPattern 10");

        int n=7;

        for(int i=n;i>=1;i--) {

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            for(char ch=(char)('A'+i-2); ch>='A'; ch--)
                System.out.print(ch);

            System.out.println();
        }
    }

    // 11
    static void pattern11() {
        System.out.println("\nPattern 11");

        int n=4;

        for(int i=1;i<=n;i++) {

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            for(char ch=(char)('A'+i-2); ch>='A'; ch--)
                System.out.print(ch);

            System.out.println();
        }

        for(int i=n-1;i>=1;i--) {

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            for(char ch=(char)('A'+i-2); ch>='A'; ch--)
                System.out.print(ch);

            System.out.println();
        }
    }

    // 12
    static void pattern12() {
        System.out.println("\nPattern 12");

        int n=4;

        for(int i=n;i>=1;i--) {

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            for(char ch=(char)('A'+i-2); ch>='A'; ch--)
                System.out.print(ch);

            System.out.println();
        }

        for(int i=2;i<=n;i++) {

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(char ch='A'; ch<'A'+i; ch++)
                System.out.print(ch);

            for(char ch=(char)('A'+i-2); ch>='A'; ch--)
                System.out.print(ch);

            System.out.println();
        }
    }
}