public class TryFinallyTest {
    public static void main(String[] arguments) {
        System.out.println(returnNumber());
    }
    public static int returnNumber() {
        try {
            return 5;
        }

        finally {
            return 10;
        }
    }
}
