public class MedianOfThree {
    public static void main(String[] args) {
        int a = 30, b = 20, c = 15;

        int median = (a > b)
                ? ((a < c) ? a : (b > c ? b : c))
                : ((a > c) ? a : (b < c ? b : c));

        System.out.println("Median = " + median);
    }
}