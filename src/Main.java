import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Program myTest = new Program();
        int[] result = myTest.twoNumberSum( new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        String resultString = Arrays.toString(result);
        System.out.println(resultString);
    }
}