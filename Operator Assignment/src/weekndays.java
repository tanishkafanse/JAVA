public class weekndays {
    public static void main(String[] args) {
        int totalDays = 365;

        int weeks = totalDays / 7;
        int days = totalDays % 7;

        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining Days = " + days);
    }
}