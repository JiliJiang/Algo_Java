import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Program myTest = new Program();
        int[] result = myTest.twoNumberSum( new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 2);
        int[] resultNew = myTest.twoNumberSumNew( new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 2);
        int[] resultList = myTest.twoNumberSumList( new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 2);

        String resultString = Arrays.toString(result);
        String resultStringNew = Arrays.toString(resultNew);
        String resultStringList = Arrays.toString(resultList);
        System.out.println(resultString + ' ' + resultStringNew +" "+ resultStringList);
    }
}