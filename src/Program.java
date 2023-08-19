import java.util.Arrays;

public class Program {
    public  int[] twoNumberSum(int[] array, int targetSum){
        int[] result = new int[2];
        for (int i=0; i< array.length; i++) {
            int remainder = targetSum - array[i];
            int index = getIndex(array, remainder);
            if(index!=-1 && index != i ){
            result[0] = array[i];
            result[1] = array[index];
            }
        }
        if(Arrays.equals(result, new int[]{0,0})){ return new int[0];}
        return result;
    }

    public int getIndex(int[] array, int num){
        for( int i=0; i<array.length; i++){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }
}
