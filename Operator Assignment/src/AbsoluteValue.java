public class AbsoluteValue {
    public static void main(String[] args) {
        int num = -455;

        int abs = (num < 0) ? -num : num;

        System.out.println("Absolute value = " + abs);
    }
}