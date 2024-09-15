import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public int[] twoNumberSum(int[] array, int targetSum){
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

    public int[] twoNumberSumNew (int[] array, int targetSum){
        int[] result = {-1, -1};
        for (int num: array) {
            int remainder = targetSum - num;
            int indexR = getIndex(array, remainder);
            int indexNum = getIndex(array, num);
            if(indexR == -1 || indexR == indexNum){
                continue;
            }else{
                result[0] = num;
                result[1] = remainder;
            }
        }
        return result;
    }

    public int[] twoNumberSumList (int[] array, int targetSum){
        int[] result ={-1, -1};
        List<Integer> arrayList = this.getArrayList(array);
        arrayList.forEach(num -> {
            int remainder = targetSum - num;
            int indexR = arrayList.indexOf(remainder);
            int indexN = arrayList.indexOf(num);
            if(indexR !=-1 && indexR != indexN){

                result[0] = num;
                result[1] = remainder;
            }
        }
        );
        return result;
    }


    private int getIndex(int[] array, int num){
        for( int i=0; i<array.length; i++){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }

    private List<Integer> getArrayList(int[] array){
        List<java.lang.Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);  // Auto-boxes int to Integer
        }
        return arrayList;
    }


}
